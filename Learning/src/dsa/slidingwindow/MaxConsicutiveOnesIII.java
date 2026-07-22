package dsa.slidingwindow;

public class MaxConsicutiveOnesIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		int result = findMethod1(arr,k);
		System.out.println(result);
		int result2 = findMethod2(arr,k);
		System.out.println(result2);

	}

	private static int findMethod1(int[] arr, int k) {
		// TODO Auto-generated method stub
		int l=0;
		int zeroCount =0;
		int max = 0;
		for(int r=0;r<arr.length;r++) {
			if(arr[r]==0) {
				zeroCount++;
			}
			while(zeroCount>k) {
				if(arr[l] ==0) {
					zeroCount--;
				}
				l++;
			}
			max = Math.max(max, r-l+1);
		}
		return max;
	}
	private static int findMethod2(int[] arr, int k) {
		// TODO Auto-generated method stub
		int l=0;
		int zeroCount =0;
		for(int r=0;r<arr.length;r++) {
			if(arr[r]==0) {
				zeroCount++;
			}
			if(zeroCount>k) {
				if(arr[l] ==0) {
					zeroCount--;
				}
				l++;
			}
			
		}
		return arr.length-l;
	}

}
