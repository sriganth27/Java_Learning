package com.sri.encapsulation;

public class Account {
	private int balance;
	
	public  Account(){
		
	}
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(int amount) {
		if(amount < balance) {
			balance -= amount;
		}
		else {
			System.err.println("insufficient fund");
		}
		
	}
	
	public void deposit(int amount) {
		if(amount >0 ) {
			balance += amount;
		}
		System.err.println("");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
