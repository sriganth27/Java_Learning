package com.sri.dailyprograms;

import java.util.HashMap;

public class day1 {

	public static int[] m1(int []arr , int target) {
		HashMap<Integer , Integer> map = new HashMap<>();
		
		for(int i =0; i< arr.length ; i++) {
			int complement  = target - arr[i];
			System.out.println(complement);
			if(map.containsKey(complement )) {
				System.out.println("inside");
				return new int [] { map.get(complement ), i};
			}
			
			else {
				map.put(arr[i] , i);
				System.out.println(map);
			}
		}
		
		return new int [] {};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two sum
		/** 
		 input = [3,6,8,3,6]
		 target = 9
		 *   **/

		int [] arr = {3,7,8,6};
		int target = 19;
		
		int [] result = m1(arr,target);
		if(result.length == 2) {
			System.out.println("Result indices: [" + result[0] + ", " + result[1] + "]");
		}
		
		else {
			System.out.println("no match found");
		}
		 	for(int i =0 ; i<arr.length ; i++ ) {
			for(int j = i+1 ; j < arr.length ; j++) {
				if (target == arr[i] + arr[j]) {
					System.out.println(i + ","+ j);
					return;
				}
			}
		}
		

		
		
	}

}
