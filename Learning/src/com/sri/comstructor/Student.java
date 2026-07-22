package com.sri.comstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ForkJoinPool;

public class Student {
	
	int roll;
	String name;
	int age;
	float marks;
	
//	public Student() {
//		// TODO Auto-generated constructor stub
//		this.name = "sri";
//		this.age = 22;
//		this.marks = 98f;
//		
//	}
//	 
	public Student(int rollnum , float mark) {
		this.roll = rollnum;
		this.marks = mark;
		
	}
	
	public Student( Student other , int age , String mame) {
		this.roll = other.roll;
		this.marks = other.marks;
		this.name = mame;
		this.age = age;
		
		
	}
	
	public Student( Student other) {
		this.roll = other.roll;
		this.marks = other.marks;
		this.name = other.name;
		this.age = other.age;
		
		
	}
	public Student (int roll , float marks  , String name , int age) {
		this.roll = roll;
		this.marks = marks;
		this.name = name;
		this.age = age;
		
	}
	
	public Student() {
		
		this (21, 98f , "default" , 99);
	}
	
	public void showname(String name) {
		System.out.println("  hello my name is " + name);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name " + name + " age " +age + " marks " +marks + " roll " + roll;
	}
	
	
	public int equal(Object obj) {
		// TODO Auto-generated method stub
		
	
		Student st = (Student) obj;
		return (this.age == st.age) ? 1 : 0 ;
	
		
	}
	
//	public int equal(Object obj) {
//		// TODO Auto-generated method stub
//		
//	
//
//		if(this.name == obj.name2)
//		return 1;
//		else {
//			return 0;
//		}
//		
//	}
    static void swap(int a , int b) {
    	int temp = a;
    	a = b;
    	b = temp;
    	
    	System.out.println(a + " " + b);
		
	}
	public static void main(String [] args) {
	  
		Student kunal = new Student(12, 97 , "kunal",99);
		Student sri = new Student(kunal , 19 , "name");
		Student raj = new Student(kunal);
		Student random = new Student();
	    sri.roll = 34;
	    raj.name = "raja";
	    System.out.println("kunam objs name  is " + kunal.name);
	    System.out.println("kunam role num is " + kunal.roll);
		 String name = new String("sriganth");
		 String name2 = new String("sriganth");
		  //System.out.println(name.equal(name2)); 
		   
		Integer num = 10;
		Integer num2 = 1;
		System.out.println(random.equal(kunal));
		
		System.out.println(num.compareTo(num2));
		
		List as = new ArrayList<>();
		
		as.add(kunal);
		
		System.out.println(as);
//		kunal.showname(sri.name);
//		System.out.println(sri);
//		System.out.println(kunal);
//		System.out.println(random);
		
//		int a = 10;
//		int b = 20;
		
		swap(num , num2);
		System.out.println(num + " " +num2);
		
		// you can chnage the valus in non primitive but can not reassign 
		// you can not chnage the value in primitive data type
		
//		final A a = new A("sriganth");
//		a.name = "after change";
		
	//	a = new A("after chnag");
		
		//System.out.println(a.name);
//		A obj;
//		
//		for (int i =0 ; i< 1000000 ; i++) {
//			obj = new A("object is created");
//		}
//	}
	
	

}


class A {
	String name ;

	public A(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("object is destroyed");
	}
	
}
}

