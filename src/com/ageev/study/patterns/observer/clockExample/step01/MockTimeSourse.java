package com.ageev.study.patterns.observer.clockExample.step01;

import java.time.Clock;

public class MockTimeSourse implements TimeSource {
    private ClockDriver itsDriver;

    public void setTime(int hours, int minutes, int seconds){
        itsDriver.update(hours,minutes,seconds);
    }

    @Override
    public void setDriver(ClockDriver driver) {
        itsDriver = driver;
    }
}
