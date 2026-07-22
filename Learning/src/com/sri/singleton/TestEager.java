package com.sri.singleton;

class EagerSingleton {
	
	private static final EagerSingleton obj = new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static  EagerSingleton getObj() {
		return obj;
	}
}
public class TestEager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton obj1 = EagerSingleton.getObj();
		EagerSingleton obj2 = EagerSingleton.getObj();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
