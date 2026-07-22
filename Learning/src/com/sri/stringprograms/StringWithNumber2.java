package com.sri.stringprograms;


import java.util.Arrays;


public class StringWithNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sri3 name4 test1 hllo2";
	
		String[] spl = str.split(" ");
		Arrays.sort(spl , (a,b) -> {
			char ch = a.charAt(a.length()-1);
			char ch2 = b.charAt(b.length()-1);
			int c = Character.getNumericValue(ch);
			int d = Character.getNumericValue(ch2);
			
			return c-d;
		});

		
		for(int i=0; i<spl.length ; i++) {
			spl[i] = spl[i].replaceAll("\\d", "");
		}
		
		System.out.println(String.join(" ", spl));
		
		
		

	}

}
