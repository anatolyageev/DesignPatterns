package com.ageev.study.patterns.observer.clockExample.step01;

public class MockTimeSink implements TimeSink {
    private int itsHours;
    private int itsMinutes;
    private int itsSeconds;

    public int getItsHours() {
        return itsHours;
    }

    public int getItsMinutes() {
        return itsMinutes;
    }

    public int getItsSeconds() {
        return itsSeconds;
    }

    @Override
    public void setTime(int hours, int minutes, int seconds) {
        itsHours = hours;
        itsMinutes = minutes;
        itsSeconds = seconds;
    }
}
