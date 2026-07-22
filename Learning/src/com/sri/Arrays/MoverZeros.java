package com.sri.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoverZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,1,0,3,12};
		List<Integer> ls = new ArrayList<>();
		
		//approach 1
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
				ls.add(arr[i]);
			}
		}
		System.out.println(ls.size());
		System.out.println(arr.length);
		while(ls.size() < arr.length ) {
			ls.add(0);
		}
   
		System.out.println(ls.size());
		System.out.println(ls);
		
		//approach 2
		int temp;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=0) {
				temp = arr[j];
				arr[j] =arr[i];
				arr[i] = temp;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
