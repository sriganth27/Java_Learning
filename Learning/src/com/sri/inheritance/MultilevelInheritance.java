package com.sri.inheritance;

class Employees{
	
	String name;
	int age;
	
	Employees(String name , int age){
		this.name = name;
		this.age = age;
		
	}
	
	
	void details() {
		System.out.println("employee name is "+ name + " age is " +age);
	}
}

class SoftwareEngineers extends Employees{

	int bonus;
	
	SoftwareEngineers(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void details() {
		// TODO Auto-generated method stub
		super.details();
	}
	SoftwareEngineers(String name, int age , int bonus){
		super(name , age);
		this.bonus = bonus;
	}
	
	

	void showBonus() {
		System.out.println(name + "bonus is "+bonus);
	}
	
}

class SoftwareTesting extends SoftwareEngineers {

	SoftwareTesting(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	void details() {
		// TODO Auto-generated method stub
		super.details();
	}
}
public class MultilevelInheritance {
	
	public static void main(String [] sri) {
		Employees obj1 = new Employees("sri" , 22);
		SoftwareEngineers obj2 = new SoftwareEngineers("sriganth", 34);
		SoftwareTesting obj3 = new SoftwareTesting("test", 34);
		Employees emp = new SoftwareEngineers(null, 0); //upcasting
		SoftwareEngineers emp2 = (SoftwareEngineers) emp; //downcastin - casting super reference back to original reference
		obj1.details();
		obj3.details();
		obj2.details();
	}



}
