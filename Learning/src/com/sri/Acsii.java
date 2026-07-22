package com.sri;

public class Acsii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		StringBuffer sb = new StringBuffer();
		
		for (char ch :str.toCharArray()) {
			//System.out.println((ch - '0'));
			char num =  (char) ((ch - '0') +64);
			sb.append(num);
			System.out.println(num);

		}
		
		System.out.println(sb.toString());

	}

}
