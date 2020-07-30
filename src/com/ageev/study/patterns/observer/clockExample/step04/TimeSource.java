package com.ageev.study.patterns.observer.clockExample.step04;

public interface TimeSource {
    void registerObserver(ClockObserver observer);
}
