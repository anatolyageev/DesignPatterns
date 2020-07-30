package com.ageev.study.patterns.observer.clockExample.step01;

public class ClockDriver {
    private TimeSink timeSink;
    public  ClockDriver(TimeSource source, TimeSink sink){
        source.setDriver(this);
        timeSink = sink;
    }

    public void update(int hours, int minutes, int seconds){
        timeSink.setTime(hours,minutes,seconds);
    }
}
