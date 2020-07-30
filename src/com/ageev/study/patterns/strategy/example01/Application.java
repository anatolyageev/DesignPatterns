package com.ageev.study.patterns.strategy.example01;

public interface Application {
    public void init();
    public void idle();
    public void cleanUp();
    public boolean done();
}
