package com.sri.inheritance;


class Employee{
	
	String name;
	int age;
	
	Employee(String name , int age){
		this.name = name;
		this.age = age;
		
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	static void details() {
		//System.out.println("employee name is "+ name + " age is " +age);
		System.out.println("i am in parent");
	}
	
	
}

class SoftwareEngineer extends Employee{

	int bonus;
	
	SoftwareEngineer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	void details() {
//		// TODO Auto-generated method stub
//		super.details();
//	}
	SoftwareEngineer(String name, int age , int bonus){
		super(name , age);
		this.bonus = bonus;
	}
	
	void showBonus() {
		System.out.println(name + "bonus is "+bonus);
	}
	
	static void details() {
		System.out.println("i am in child");
	}
	
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj1 = new Employee("sri",22);
		obj1.details();
		
		Employee obj2 = new SoftwareEngineer("sriganth", 22);
		obj2.details();
		
		SoftwareEngineer obj3 = new SoftwareEngineer("sri", 24, 9990);
		obj3.details();
		obj3.showBonus();
		

	}

}
