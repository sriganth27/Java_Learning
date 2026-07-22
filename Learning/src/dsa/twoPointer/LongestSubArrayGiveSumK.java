package dsa.twoPointer;

public class LongestSubArrayGiveSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,5,2,7,1,9};
		int target = 15;
		int sum = findSubArray(arr,target);
		System.out.println(sum);
		

	}

	private static int findSubArray(int[] arr , int target) {
		// TODO Auto-generated method stub
		int max = 0;
		int sum = arr[0];
		int j=1;
		int start = 0;
		for(int i=0;i<arr.length-1; i++) {
			sum = sum+arr[j];
			if(sum == target) {
				start = j- start+1;
				max = Math.max(max, start);
				start = j;
				sum =arr[start];
			}
			
			j++;
			
		}
		return max;
	}

}
