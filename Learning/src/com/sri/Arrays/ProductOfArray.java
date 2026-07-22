package com.sri.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-1,1,0,-3,3};
		int arr2[] = new int[arr.length];
		int sum =1;
		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i!=j) {
					sum = sum * arr[j];
				}
			}
			ls.add(sum);
			arr2[i] = sum;
			sum=1;
		}
		
		System.out.println(ls);
		System.out.println(Arrays.toString(arr2));
	}

}
