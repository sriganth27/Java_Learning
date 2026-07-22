package com.sri.program;

import java.util.ArrayList;
import java.util.List;

public class SriganthTest implements Cloneable{

	String name;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		
		for(int i=0 ; i<10 ; i++) {
			l1.add(i);
		}
		System.out.println(l1.toString());
		for(int i=0 ; i < l1.size(); i++) {
			l1.remove(i);
		}
		System.out.println(l1.toString());
		
		try {
			int b = 10/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	
		SriganthTest t = new SriganthTest();
		t.name = "sri";
		SriganthTest t2= t;
		t2.name = "test";
		System.out.println(t.name);
		System.out.println(t2.name);
		SriganthTest t3 = (SriganthTest) t2.clone();
		t3.name = "sample";
		System.out.println(t3.name);
		
		SriganthTest t4 = new SriganthTest();
		System.out.println(t4.hashCode());
		System.out.println(t4);
		
		Object ob = null;
		//System.out.println(ob.hashCode());
		System.out.println(ob);
		
	}

}
