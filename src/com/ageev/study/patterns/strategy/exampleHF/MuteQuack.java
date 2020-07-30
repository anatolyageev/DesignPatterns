package com.ageev.study.patterns.strategy.exampleHF;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
