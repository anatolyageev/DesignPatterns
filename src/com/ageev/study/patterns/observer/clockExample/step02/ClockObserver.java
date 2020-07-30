package com.ageev.study.patterns.observer.clockExample.step02;

public interface ClockObserver {
    void update(int hours, int minutes, int seconds);
}
