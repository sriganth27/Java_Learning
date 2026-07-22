package com.sri.Arrays;



public class MaxSubArray {
	
	public static int maxSub(int[] nums) {
		int curretMaxSum = 0;
		int maxSum = nums[0];
		for(int num :nums) {
			curretMaxSum = Math.max(num, curretMaxSum + num);
			maxSum = Math.max(curretMaxSum, maxSum);
		}
		
		return maxSum;
	}
	
	public static int minSub(int[] nums) {
		int curretMinSum = 0;
		int minSum = nums[0];
		for(int num :nums) {
			curretMinSum = Math.min(num, curretMinSum + num);
			minSum = Math.min(curretMinSum, minSum);
		}
		
		return minSum;
	}
//	public static int minSub(int[] nums) {
//		Arrays.sort(nums);
//		int minValue = nums[0];
//		
//		return minValue;
//	}
//	
//	public static int maxSub(int[] nums) {
//		Arrays.sort(nums);
//		int sum =0;
//		for(int num : nums) {
//			sum+=num;
//		}
//		return sum;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,-4,5,-8};
		
       
		
		
		
		System.out.println(maxSub(arr));
		System.out.println(minSub(arr));
		
		
		
	}

}
