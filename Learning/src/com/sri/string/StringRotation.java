package com.sri.string;

public class StringRotation {

	public static boolean isRotation(String s1 , String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		String add = s1 + s1;
		System.out.println(add);
		return add.contains(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "cdac";
		System.out.println(isRotation(s1, s2));
		
	}

}
