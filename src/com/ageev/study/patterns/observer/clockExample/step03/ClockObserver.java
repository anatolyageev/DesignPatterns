package com.ageev.study.patterns.observer.clockExample.step03;

public interface ClockObserver {
    void update(int hours, int minutes, int seconds);
}
