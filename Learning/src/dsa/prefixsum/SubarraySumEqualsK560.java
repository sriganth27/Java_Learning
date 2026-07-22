package dsa.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK560 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,-1,0,1,2,-1,3};
		int res = findMethod1(nums,3);
		System.out.println(res);
		

	}

	private static int findMethod1(int[] nums, int k) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);
		int count = 0;
		int prefixSum =0;
		for(int num : nums) {
			prefixSum += num;
			if(map.containsKey(prefixSum-k)) {
				count += map.get(prefixSum-k);
			}
			map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
			
		}
		return count;
	}

}
