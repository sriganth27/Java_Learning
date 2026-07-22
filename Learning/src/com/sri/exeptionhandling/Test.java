package com.sri.exeptionhandling;

public class Test {
	
	void test() throws TestException {
		throw new TestException("exception is throwing");
	}

	public static void main (String [] args) {
		Test ts = new Test();
		try {
			ts.test();
		} catch (TestException e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
	
		
		
	}
}
