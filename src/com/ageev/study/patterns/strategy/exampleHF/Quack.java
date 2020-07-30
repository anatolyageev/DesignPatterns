package com.ageev.study.patterns.strategy.exampleHF;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
