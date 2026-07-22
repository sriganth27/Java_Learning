package com.sri.sorting;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		List<Number> arr = new ArrayList<>();
		for(int i=1 ; i<num ;i++) {
			if(num % i ==0) {
				arr.add(i);
				System.out.print(" "+i);
			}
		}

		System.out.println(arr);
	}

}
