package com.sri;

public class test1 {

	public static void main(String []sd) {
		
		int a = 1;
		
		for(int i=1; i<128 ; i+=i) {
			a+=a;
			System.out.println(a);
		}
		System.out.println(a);
		int b=1;
		for(int i=0; i<10 ; ++i) {
			System.out.println("value is is"+i);
			b+=i;
			System.out.println(b);
		}
		System.out.println(b);
		int c =1;
		System.out.println(c++ + ++c);
		
		 String s1 = "test";
		    String s2 = "testing";
		    System.out.println(s2.contains(s1));
		}
	
	   
      
	}
