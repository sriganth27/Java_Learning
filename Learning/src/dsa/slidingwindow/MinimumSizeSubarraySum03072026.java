package dsa.slidingwindow;

public class MinimumSizeSubarraySum03072026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] nums = {2,3,1,2,4,3};
      int target =7;
      int result = findMethod1(nums,target);
      System.out.println(result);
      int result2 = findMethod2(nums,target);
      System.out.println(result2);
	}

	private static int findMethod1(int[] nums, int target) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			int sum =0, count =0;
			for(int j=i;j<nums.length;j++) {
				sum += nums[j];
				count++;
				if(sum>=target) {
					min = Math.min(min, count);
					break;
				}
			}
		}
		if(min==Integer.MAX_VALUE) {
			return 0;
		}
		return min;
	}

	private static int findMethod2(int[] nums, int target) {
		// TODO Auto-generated method stub
	
		int l=0;
		int min = Integer.MAX_VALUE;
		int sum=0;
		for(int r=0;r<nums.length;r++) {
			sum+=nums[r];
			while(target<=sum) {
				min = Math.min(min, r-l+1);
				sum-=nums[l];
				l++;
			}
		}
		if(min==Integer.MAX_VALUE) {
			return 0;
		}
		return min;
	}

}
