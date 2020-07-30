package com.ageev.study.patterns.observer.clockExample.finalSolution;

public class MockTimeSink implements Observer {
    private int itsHours;
    private int itsMinutes;
    private int itsSeconds;
    private TimeSource timeSource;

    public MockTimeSink(TimeSource source){
        timeSource = source;
    }

    public int getHours() {
        return itsHours;
    }

    public int getMinutes() {
        return itsMinutes;
    }

    public int getSeconds() {
        return itsSeconds;
    }

    @Override
    public void update() {
        itsHours = timeSource.getHours();
        itsMinutes = timeSource.getMinutes();
        itsSeconds = timeSource.getSeconds();
    }
}
