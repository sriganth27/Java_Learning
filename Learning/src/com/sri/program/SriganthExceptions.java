package com.sri.program;

public class SriganthExceptions {

	static void m1() {
		String s = null;
		System.out.println(s.length());
		System.out.println(10/0);
		int [] arr = {1,2,3,4};
		System.out.println(arr[5]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			m1();
		} catch (NullPointerException |  ArithmeticException |ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
