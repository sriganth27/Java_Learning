package com.sri.sorting;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,1,5,2,4,2};
	   // sort(arr);
		//selection(arr);
		insertion(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void insertion(int [] arr) {
		for(int i =0 ; i<arr.length-1 ; i++) {
			for (int j = i+1 ; j > 0 ; j--) {
				if(arr[j] < arr[j-1]) {
					 int temp = arr[j];
					 arr[j] = arr[j-1];
					 arr[j-1] = temp;
				}
				else {
					break;
				}
			}
		}
	}
	static void selection(int [] arr) {
		
		for(int i =0 ; i< arr.length; i++) {
			int last = arr.length -i -1;
			
			int maxIndex = maximum(arr , 0 , last);
			
			//(arr , maxIndex , last);
			int tem = arr[maxIndex];
			arr[maxIndex] = arr[last];
			arr[last] = tem;
		}
	}
//	private static void swap(int[] arr, int maxIndex, int last) {
//		// TODO Auto-generated method stub
//		int tem = arr[maxIndex];
//		arr[maxIndex] = arr[last];
//		arr[last] = tem;
//	}

	private static int maximum(int[] arr, int start, int last) {
		// TODO Auto-generated method stub
		int max = start;
		for( int i = start ; i<=last ; i++) {
			if( arr[max] < arr[i] ) {
				max = i;
			}
		}
		return max;
	}

	static void sort(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			 for(int j=1; j<=arr.length -i -1 ; j++) {
				 
				 if(arr[j] <  arr[j-1]) {
					 int temp = arr[j];
					 arr[j] = arr[j-1];
					 arr[j-1] = temp;
				 }
			 }
			
		}
		
	}

}
