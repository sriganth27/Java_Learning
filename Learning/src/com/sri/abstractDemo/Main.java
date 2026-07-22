package com.sri.abstractDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son obj1 = new son("sriganth");
		Daugter obj2 = new Daugter("sri");
		obj1.carrer();
		obj1.partner();
		
		obj2.carrer();
		obj2.partner();
		
		Parent.show();
	}

}
