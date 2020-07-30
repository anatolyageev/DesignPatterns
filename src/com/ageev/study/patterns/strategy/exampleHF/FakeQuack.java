package com.ageev.study.patterns.strategy.exampleHF;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
