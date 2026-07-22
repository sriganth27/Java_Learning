package com.sri.staticExample;



public class InnerClass {
	
	static class Test {
		static String name;
		
		Test(String name){
			Test.name = name;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1 = new Test("sri");
		Test t2 = new Test("ganth");
		
		System.out.println(t1.name);
		System.out.println(t2.name);
	}

}
