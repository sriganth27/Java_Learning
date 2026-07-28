package com.sri.java8;

public class Test345 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test test test test";
		int count =1;
		for(char st : str.toCharArray()) {
			if(st==' ') {
			
			count++;
			}
		}
		System.out.println(count);
	

	}
}
