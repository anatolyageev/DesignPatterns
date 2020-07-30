package com.ageev.study.patterns.observer.clockExample.finalSolution;

import com.ageev.study.patterns.observer.clockExample.step04.ClockObserver;

public interface TimeSource {
    int getHours();
    int getMinutes();
    int getSeconds();
}
