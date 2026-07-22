package com.sri.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
class Print {
	void m1(String s) {
		System.out.println(s);
	}
}

class Calculator  {
	int square(int a) {
		return a *a;
	}
}
public class ObjectMethodRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p = new Print();
		Calculator c = new Calculator();
		//1.instance method reference
		//lamda
		Consumer<String> cs = (e) -> p.m1(e);
		cs.accept("strog");
		
		// method reference
		Consumer<String> cs2 = p::m1;
		cs2.accept("stroges");
		
		List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");
		//names.forEach(e -> System.out.println(e));
		
		names.forEach(System.out::println);
		
		Function<Integer , Integer> fc = (a) -> c.square(a);
		System.out.println(fc.apply(56));
		
		Function<Integer , Integer> fc2 =  c::square;
		System.out.println(fc2.apply(36));

	}

}
