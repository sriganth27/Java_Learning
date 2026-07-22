package com.sri;

import java.util.Arrays;

public class SwapTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {2,4,6,7};
		
		for (int i =0; i<arr1.length ; i++) {
			int temp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp;
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
