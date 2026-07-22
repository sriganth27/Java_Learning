package com.sri.singleton;

class LazySinleton {
	private static  LazySinleton obj;
	
	private LazySinleton() {
		
	}
	
	public static LazySinleton getObj() {
		if (obj == null) {
			obj = new LazySinleton();
		}
		return obj;
	}
	
}
public class TestLazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySinleton obj1 = LazySinleton.getObj();
		LazySinleton obj2 = LazySinleton.getObj();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
