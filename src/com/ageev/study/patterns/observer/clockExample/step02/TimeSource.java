package com.ageev.study.patterns.observer.clockExample.step02;

public interface TimeSource {
    void setObserver(ClockObserver observer);
}
