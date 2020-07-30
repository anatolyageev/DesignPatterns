package com.ageev.study.patterns.observer.clockExample.step04;

import java.util.Iterator;
import java.util.Vector;

public class TimeSourceImpl {
    private Vector itsObserver = new Vector();

    public void notify(int hours, int minutes, int seconds) {
        Iterator i = itsObserver.iterator();
        while (i.hasNext()) {
            ClockObserver observer = (ClockObserver) i.next();
            observer.update(hours, minutes, seconds);
        }

    }

    public void registerObserver(ClockObserver observer) {
        itsObserver.add(observer);
    }
}
