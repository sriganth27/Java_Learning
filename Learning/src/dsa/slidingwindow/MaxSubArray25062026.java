package dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArray25062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,5,4,2,9,9,9};
		int k=3;
		//long res = subarraySum(nums,k);
		//System.out.println(res);
		long res2 = subarraySum2(nums,k);
		System.out.println(res2);
	}

	private static long subarraySum2(int[] nums, int k) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
	
		long total =0;
		int l=0;
		long max = 0;
		for(int i=0;i<k;i++) {
			total += nums[i];
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			
		}
		if(map.size()==k) {
			max = total;
		}
		for(int j=k;j<nums.length;j++) {
			total +=nums[j];
			total-=nums[l];
			map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
			map.put(nums[l],map.get(nums[l])-1);
			if(map.get(nums[l])==0) {
				map.remove(nums[l]);
				
			}
			
			l++;
			if(map.size()==k) {
				max = Math.max(max, total);
				
			}
		}
		return max;
	}

	public static long subarraySum(int[] nums, int k) {
		long max = 0;
		int sum =0;
		int l=0;
        for(int i=0;i<k;i++){
        	if((i>0&& nums[i] != nums[i-1]) || (i==0 && nums[i] != nums[i+1])) {
        		 sum = sum + nums[i];
                 max = Math.max(sum,max);
        	}
           
        }
        for(int j=k;j<nums.length;j++){
        	if(nums[j] != nums[j-1]) {
        		sum = sum + nums[j];
                sum = sum - nums[l++];
                max = Math.max(sum,max);
        	}
            
        }
        return max;
    }
}
