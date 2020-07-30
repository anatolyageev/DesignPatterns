package com.ageev.study.patterns.observer.clockExample.finalSolution;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class MockTimeSourseTest  extends TestCase {
    private MockTimeSourse sourse;
    private MockTimeSink sink;
    public MockTimeSourseTest(String name){
        super(name);
    }

    public void setUp(){
        sourse = new MockTimeSourse();
        sink = new MockTimeSink(sourse);
        sourse.registerObserver(sink);
    }

    private void assertSinkEaquals(MockTimeSink sink, int hours, int minutes, int seconds){
        assertEquals(hours,sink.getHours());
        assertEquals(minutes,sink.getMinutes());
        assertEquals(seconds,sink.getSeconds());
    }

    public void testTimeChange(){
        sourse.setTime(3,4,5);
        assertSinkEaquals(sink,3,4,5);

        sourse.setTime(7,8,9);
        assertSinkEaquals(sink,7,8,9);
    }

    public void testMultipleSink(){
        MockTimeSink sink2 = new MockTimeSink(sourse);
        sourse.registerObserver(sink2);

        sourse.setTime(12,13,14);
        assertSinkEaquals(sink,12,13,14);
        assertSinkEaquals(sink2,12,13,14);
    }

}