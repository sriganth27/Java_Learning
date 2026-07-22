package com.sri;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,5,6,7,1};
		Arrays.sort(arr);
		int sum = 0 ;
		int n = arr.length +1;
		int totalSum = n*(n+1)/2;
		for (int num :arr ) {
			sum+=num;
		}
		int result =totalSum- sum;
		System.out.println(result);
		

	}

}
