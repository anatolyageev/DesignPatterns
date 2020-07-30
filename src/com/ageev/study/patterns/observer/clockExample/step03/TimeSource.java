package com.ageev.study.patterns.observer.clockExample.step03;

public interface TimeSource {
    void registerObserver(ClockObserver observer);
}
