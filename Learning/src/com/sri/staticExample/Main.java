package com.sri.staticExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Human sri = new Human("sri", 22 );
//		System.out.println(sri.population);
//		Human man = new Human("sri", 22 );
//		System.out.println(man.population);
		
		System.out.println(Human.population);
		
      Main m = new Main();
      m.greeting();
      fun();
	}
	
	void greeting() {
		fun2();
		System.out.println("hello");
	}
	
	static void fun2() {
		System.out.println("hello seo");
	}

	static void fun() {
		//greeting();
		
		// you cannot direct acces to use not static menthod inside static if u want to do you can creta object inside this
		Main ma = new Main();
		System.out.println("inside static");
		ma.greeting();
	}
}
