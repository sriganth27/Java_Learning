package com.sri;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "geekss";
		String s2 = "kseegs";
		
		char[] ch = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
	    boolean istrue =	Arrays.equals(ch, ch2);
	    System.out.println(istrue);
				

	}

}
