package com.ageev.study.patterns.strategy.example01;

public class ApplicationRunner {
    private Application itsApplication;

    public ApplicationRunner(Application app){
        this.itsApplication = app;
    }

    public void run(){
        itsApplication.init();
        while (!itsApplication.done()){
            itsApplication.idle();
        }
        itsApplication.cleanUp();
    }
}
