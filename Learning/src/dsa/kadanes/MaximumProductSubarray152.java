package dsa.kadanes;

public class MaximumProductSubarray152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,-2,4};
		int res = maxProduct(arr);
		System.out.println(res);
		int res2 = maxProduct2(arr);
		System.out.println(res2);
		
		
	}
	   private static int maxProduct2(int[] arr) {
		// TODO Auto-generated method stub
		   int prefixSum =1;
		   int suffixSum =1;
		   int ans = Integer.MIN_VALUE;
		   for(int i=0;i<arr.length;i++) {
			   if(prefixSum ==0) prefixSum =1;
			   if(suffixSum ==0) suffixSum =1;
			   
			   prefixSum*=arr[i];
			   suffixSum*=arr[arr.length-1-i];
			   ans = Math.max(ans, Math.max(prefixSum, suffixSum));
			   
		   }
		return ans;
	}
	   public static int maxProduct(int[] nums) {
	        int max = Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            int prod =1;
	            for(int j=i;j<nums.length;j++){
	                prod*=nums[j];
	                max = Math.max(max,prod);
	            }
	        }
	        return max;
	    }
}
