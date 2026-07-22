package com.sri.designPatterns.OCP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enginee obj1 = new DiesalEngine();
		Car car = new Car(obj1);
		car.drive();
		
		Enginee obj2 = new PetrolEngine();
		Car car2 = new Car(obj2);
		car2.drive();
		
		

	}

}
