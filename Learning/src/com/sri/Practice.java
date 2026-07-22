package com.sri;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

class SuperClass {
	void process() throws NullPointerException  {
		//throw new ArithmeticException();
		System.out.println("parent");
	}
	static void recurse() {
	    recurse(); // infinite recursion
	}
	static void sri() {
		sri();
	}
}

class SubClass extends SuperClass{
	
	@Override
	void process() throws ArithmeticException{
		//throw new NullPointerException();
		System.out.println("child");
	}
	
}

public class Practice {

	public static int compareVersions(String v1, String v2) {
	    String[] parts1 = v1.split("\\.");
	    String[] parts2 = v2.split("\\.");
	    System.out.println(Arrays.toString(parts1));
	    System.out.println(Arrays.toString(parts2));
	    int length = Math.max(parts1.length, parts2.length);

	    for (int i = 0; i < length; i++) {
	        int p1 = i < parts1.length ? Integer.parseInt(parts1[i]) : 0;
	        int p2 = i < parts2.length ? Integer.parseInt(parts2[i]) : 0;
	        if (p1 < p2) return -1;
	        if (p1 > p2) return 1;
	    }
	    return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareVersions("18.6.2", "18.9.0.2")); 
	
		int  a = Integer.MAX_VALUE;
		Integer b = Integer.MIN_VALUE;
		int c = a+1;
		
		System.out.println(" max integer value is "+a + 1);
		System.out.println(" max integer value is "+a);
		System.out.println(c);
		System.out.println(b );
		System.out.println(b - 3);
		//SuperClass.recurse();
		String s1 = "hello";
		String s2 = s1.replace('x', 'y');
		
		String s3 = new String("hello").intern();
		
		System.out.println(s1==s3);
		System.out.println(s1 == s2);
		
		SuperClass sb = new SubClass();
		try {
			sb.process();
		} catch (Exception e) {
			// TODO: handle exception
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
