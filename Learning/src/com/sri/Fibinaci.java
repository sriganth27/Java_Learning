package com.sri;

public class Fibinaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 1 , second =2 , next , num =10;
		
		for(int i = 1; i<=num ; i++) {
			System.out.print(first + ",");
			next = first + second ;
			first = second ;
			second = next;
		}
		
	

	}

}
