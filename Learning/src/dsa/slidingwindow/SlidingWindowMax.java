package dsa.slidingwindow;


import java.util.Arrays;


public class SlidingWindowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,-1,-3,5,3,6,7};
		int[] ls = findMethod1(arr,3);
        System.out.println(Arrays.toString(ls));
	}

	private static int [] findMethod1(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n= arr.length;
		int res[] = new int[n-k+1];
		for(int i=0;i<=n-k;i++) {
			int max = Integer.MIN_VALUE;
			for(int j=i;j<k+i;j++) {
				max = Math.max(max, arr[j]);
			}
			res[i] = max;
		}
		
		return res;
	}

}
