package com.ageev.study.patterns.strategy.example01;

import com.ageev.study.patterns.strategy.example01.aplicationImpl.FtocStrategy;

public class StartApp {
    public static void main(String[] args) {
        new ApplicationRunner(new FtocStrategy()).run();
    }
}
