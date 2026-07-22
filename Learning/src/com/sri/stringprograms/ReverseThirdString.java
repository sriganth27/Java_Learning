package com.sri.stringprograms;

import java.util.Arrays;

public class ReverseThirdString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name = "welcome to iexceed";
//		String[] nameArr = name.split(" ");
//		String thirdName = nameArr[2];
//		//StringBuilder sb = new StringBuilder(thirdName);
//		String result = new StringBuilder(thirdName).reverse().toString();
//		
//		nameArr[2] = result;
//		System.out.println(Arrays.toString(nameArr));
//		String finalRes = String.join(" ", nameArr);
//		System.out.println(finalRes);
//		System.out.println(Character.isDigit('9'));
//		
		String numberWithString = "hi 89 i am 23 sriganth";
		String[] arr = numberWithString.split(" ");
		//System.out.println(Arrays.toString(arr));
		int num = 0;
		String res="";
		for(int i =0; i<arr.length ; i++) {
			//System.out.println(arr[i]);
			if(Character.isDigit(arr[i].charAt(0))) {
				for(int j =0; j<arr[i].length() ; j++) {
					num = num + arr[i].charAt(j) - '0';
				}
			}
			else {
				res = res+ " " +arr[i];
			}
		}
		System.out.println(res);
		System.out.println(num);
//		String num = "8909";
//		int number =0;
//		for(char st : num.toCharArray()) {
//			if(Character.isDigit(st)) {
//				number = number + (st - '0');
//			}
//		}
//		System.out.println(number);
	}

}
