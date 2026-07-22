package com.sri.encapsulation;

public class Main {
	public static void main(String [] args) {
		
		Account sri = new Account();
		sri.setBalance(1000);
		sri.withdraw(1233);
		
		System.out.println("your balance is "+ sri.getBalance());
		
		sri.deposit(234);
		System.out.println("your balance is " +sri.getBalance());
		
	}

}
