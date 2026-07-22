package com.sri.staticExample;

public class Human {

	String name;
	int age;
	static long population;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		Human.population = population +1;
	}
	
	
}
