package com.ageev.study.patterns.strategy.exampleHF;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
