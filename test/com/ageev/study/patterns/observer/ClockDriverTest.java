package com.ageev.study.patterns.observer;

import com.ageev.study.patterns.observer.clockExample.step01.ClockDriver;
import com.ageev.study.patterns.observer.clockExample.step01.MockTimeSink;
import com.ageev.study.patterns.observer.clockExample.step01.MockTimeSourse;
import junit.framework.TestCase;

import static org.junit.Assert.*;

public class ClockDriverTest extends TestCase {
    public ClockDriverTest (String name) {
        super(name);
    }

    public void testTimeChange(){
        MockTimeSourse sourse = new MockTimeSourse();
        MockTimeSink sink = new MockTimeSink();
        ClockDriver driver = new ClockDriver(sourse,sink);

        sourse.setTime(3,4,5);

        assertEquals(3, sink.getItsHours());
        assertEquals(4, sink.getItsMinutes());
        assertEquals(5, sink.getItsSeconds());

        sourse.setTime(7,8,9);

        assertEquals(7, sink.getItsHours());
        assertEquals(8, sink.getItsMinutes());
        assertEquals(9, sink.getItsSeconds());
    }

}