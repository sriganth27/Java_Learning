package com.sri.program;


public class Test2 {

	static void m1(String s1) {
		StringBuilder sb = new StringBuilder();
		
		for(char ch : s1.toCharArray()) {
			if(ch == '+') {
				sb.append('-');
			}
			else if(ch == '-') {
				sb.append('*');
			}
			
		    else if(ch == '*') {
		    	sb.append('+');
			}
		    else {
		    	sb.append(ch);
		    }
		}
		
		System.out.println("test"+sb);
	}
	
	static void m2(String s3) {
		StringBuilder sb2 = new StringBuilder();
		for(char ch : s3.toCharArray()) {
			//System.out.println(ch);
			//System.out.println((int)ch);
			int number = (int) ch - 96;
			sb2.append(number);
		}
		System.out.println(sb2.toString());
	}
	
	static void m3(String s4) {
		StringBuilder sb3 = new StringBuilder();
		
		for(char ch : s4.toCharArray()) {
			int num =  ch - '0';
			//System.out.println(ch);
			char ch1 = (char)(num  + 96);
			//System.out.println(ch1);
			sb3.append(ch1);
		}
		
		System.out.println(sb3.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "80+9-6*4";
		String s3 = "abc";
		String s4 = "123";
		m1(s1);
        m2(s3);
		m3(s4);
		

		


	}

}
