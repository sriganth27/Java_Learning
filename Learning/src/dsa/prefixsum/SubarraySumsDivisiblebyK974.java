package dsa.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisiblebyK974 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {4,5,0,-2,-3,1};
		int k=5;
		int res = findMethod(nums,k);
		System.out.println(res);
	}

	private static int findMethod(int[] nums, int k) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0;
		int count =0;
		for(int i=0;i<nums.length;i++) {
			sum +=nums[i];
			int rem = ((sum%k)+k)%k;
			count += map.getOrDefault(rem, 0);
			map.put(rem,  map.getOrDefault(rem, 0)+1);
		}
		return count;
	}

}
