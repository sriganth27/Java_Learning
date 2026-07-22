package com.sri.program;

public class SriganthIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b =8;
		System.out.println(++a + a++);
		System.out.println(a + ++b);
		System.out.println(--b + b--);
		System.out.println(a - --b);
		System.out.println(b + --b + b++);

		SriganthIncrement sc = new SriganthIncrement();
		Object ob = "test";
		System.out.println(ob.hashCode());
		System.out.println(sc);
	}

}
