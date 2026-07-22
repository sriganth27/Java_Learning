package com.sri.abstractDemo;

public abstract class Parent {
	
	String name;
	
	final int AGE;
	
	Parent(String name){
		this.name = name;
		this.AGE = 23;
	}
	abstract void carrer();
	abstract void partner();
	
	void details() {
		System.out.println("hello");
	}
	
	static void show() {
		System.out.println("static method inside parent");
	}

}
