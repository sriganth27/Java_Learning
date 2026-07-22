package com.sri.program;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		int length = 0;
		char prev = 0;
		String res = "";
		for(char ch : s.toCharArray()) {
			int slenth = 0;
			if(ch != prev) {
				prev = ch;
				res = String.valueOf(ch) + res;
				 slenth = res.length();
			}

			if(length < slenth) {
				length = slenth;
			}
			
		}
		
		System.out.println("lenth is "+length);

	}

}
