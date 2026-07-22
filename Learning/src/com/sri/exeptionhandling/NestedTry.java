package com.sri.exeptionhandling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("inside nested try exception");
			try {
				int a = 10/0;
				System.out.println(a);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("inner catch "+ e);
			}
			
			String s = null;
			System.out.println(s.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("outer catch "+ e);
		}

	}

}
