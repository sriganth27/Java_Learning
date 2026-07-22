package dsa.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {23,2,4,6,7};
		boolean test = findMethod1(nums,6);
		System.out.println(test);

	}

	private static boolean findMethod1(int[] nums, int k) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		int prefixSum=0;
		map.put(0, -1);
		for(int i=0;i<nums.length;i++) {
			prefixSum+=nums[i];
			int rem = prefixSum%k;
			if(map.containsKey(rem)) {
				if(i-map.get(rem)>=2) {
					return true;
				}
			}
			else {
				map.put(rem, i);
			}
		}
		return false;
	}

}
