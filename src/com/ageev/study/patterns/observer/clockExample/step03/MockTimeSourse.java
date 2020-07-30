package com.ageev.study.patterns.observer.clockExample.step03;

import java.time.Clock;
import java.util.Iterator;
import java.util.Vector;

public class MockTimeSourse implements TimeSource {
    private Vector itsObserver = new Vector();

    public void setTime(int hours, int minutes, int seconds){
        Iterator i = itsObserver.iterator();
        while (i.hasNext()){
            ClockObserver observer = (ClockObserver) i.next();
            observer.update(hours,minutes,seconds);
        }

    }

    @Override
    public void registerObserver(ClockObserver observer) {
        itsObserver.add(observer);
    }
}
