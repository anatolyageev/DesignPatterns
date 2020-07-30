package com.ageev.study.patterns.observer.clockExample.step04;

public class MockTimeSourse implements TimeSource {
    TimeSourceImpl tsImpl = new TimeSourceImpl();

    @Override
    public void registerObserver(ClockObserver observer) {
        tsImpl.registerObserver(observer);
    }

    public void setTime(int hours, int minutes, int seconds) {
        tsImpl.notify(hours, minutes, seconds);
    }
}
