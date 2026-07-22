package com.sri.program;

public class Fibinaci {

	static void m1() {
		int n=10 ;
		int firstTerm = 0, secondTerm =1 , nextTerm;
		for(int i =1 ; i<=n ; i++) {
			System.out.print(firstTerm+ " , ");
			nextTerm = firstTerm + secondTerm ;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();

	}

}
