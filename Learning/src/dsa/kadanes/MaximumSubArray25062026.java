package dsa.kadanes;

public class MaximumSubArray25062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum = Integer.MIN_VALUE;
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			maxSum = Math.max(maxSum, sum);
			if(sum<0) {
				sum =0;
			}
		}
		System.out.println(maxSum);
		int nums[] = {2,3,-2,4};
        int prod =1;
        int maxProd =Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			prod = prod * nums[i];
			maxProd = Math.max(maxProd, prod);
			if(prod<0) {
				prod =0;
			}
		}
		System.out.println(maxProd);
	}

}
