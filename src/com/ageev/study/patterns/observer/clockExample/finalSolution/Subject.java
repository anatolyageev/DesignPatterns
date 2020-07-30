package com.ageev.study.patterns.observer.clockExample.finalSolution;

import java.util.Iterator;
import java.util.Vector;

public class Subject {
    private Vector itsObserver = new Vector();

    public void notifyObservers() {
        Iterator i = itsObserver.iterator();
        while (i.hasNext()) {
            Observer observer = (Observer) i.next();
            observer.update();
        }
    }

    public void registerObserver(Observer observer) {
        itsObserver.add(observer);
    }
}
