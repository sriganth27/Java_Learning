package com.sri.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> op = Optional.ofNullable("sriganth");
		System.out.println(op);
		//Optional<String> op2 = Optional.of(null);
		System.out.println("or else method "+op.orElse("No value found"));
		String result = op.orElseGet(()-> "testMethod");
		String result2 = op.orElseThrow(()->new  RuntimeException("exception occured"));
		String outpt = op.map(String::toUpperCase)
				.filter(e -> e.startsWith("S"))
				.orElse("sriganth");
		System.out.println(outpt);

		
	}

}
