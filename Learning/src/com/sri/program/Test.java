package com.sri.program;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str = "a1b2c3";
		char [] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int j=0;
		for(int i=0;i<ch.length; i++) {
			while(Character.isDigit(ch[i]) && j!=ch[i]-'0') {
				sb.append(ch[i-1]);
				j++;
			}
			j=0;
			if(Character.isDigit(ch[i])) {
				for(int k=0; k<ch[i]-'0';k++) {
					sb2.append(ch[i-1]);
				}
			}
		}
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
	}

}
