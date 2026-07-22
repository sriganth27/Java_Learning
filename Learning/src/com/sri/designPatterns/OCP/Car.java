package com.sri.designPatterns.OCP;

public class Car {
	private final Enginee eng;
	
	public Car(Enginee eng) {
		this.eng = eng;
	}

	void drive() {
		eng.start();
	}
}
