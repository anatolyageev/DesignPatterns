package com.ageev.study.patterns.observer.clockExample.step02;
// This class can be deleted due to is not needed any more. This interface ClockObserver can be implemented MockTimeSink
public class ClockDriver implements ClockObserver{
    private TimeSink timeSink;
    public  ClockDriver(TimeSource source, TimeSink sink){
        source.setObserver(this);
        timeSink = sink;
    }

    public void update(int hours, int minutes, int seconds){
        timeSink.setTime(hours,minutes,seconds);
    }
}
