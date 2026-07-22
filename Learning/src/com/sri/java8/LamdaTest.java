package com.sri.java8;

interface Test{
	int sum(int a, int b);
}
interface Testing{
	void print();
}
public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Test t = (a,b)-> a+b;
	    System.out.println(t.sum(6, 8));
	    
	    Testing test = () ->  {
	    	System.out.println("testing");
	    };
	    test.print();
	    
	    printMethod((a,b)-> a+b);
	    printMethod2(() ->  System.out.println("testing"));
	    

	}
	
	public static void printMethod(Test t) {
		System.out.println(t.sum(6, 12));
	}

	public static void printMethod2(Testing t) {
		t.print();
	}
}
