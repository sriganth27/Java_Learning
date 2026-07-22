package com.sri;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2029;
		if(year%4 == 0 || year%400 ==0 && year !=100) {
			System.out.println("leap year");	
		}
		else {
			System.out.println("not leap year");	
		}
	}

}
