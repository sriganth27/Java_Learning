package com.sri;
import java.util.*;
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = { 1,1,2,4,5,5,6,6,6,7,8,8,8};
		Map<Integer , Integer> map = new TreeMap<>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		System.out.println(map);
		
		// vowels program 
		String str = "interview";
		str.toLowerCase();
		int vowels =0; 
		int consonant =0;
		for (char ch : str.toCharArray()) {
        if("aeiou".indexOf(ch)>0) {
        	vowels++;
        	System.out.println("aeiou".indexOf(ch));
        }
        else {
        	consonant++;
        }
       
	}
	 System.out.println("consonant is " + consonant + "vowels "+vowels);
	 
	 int num = 2345;
	 int digit = String.valueOf(num).length();
	 int digit2 = Integer.toString(num).length();
	 System.out.println(digit);
	 
	 char ch = 'A';
	 System.out.println((int)ch);

}
}
