package dsa.prefixsum;

public class FindPivotIndex724 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,7,3,6,5,6};
		int res = findMethod(arr);
		System.out.println(res);
		int res1 = findMethod2(arr);
		System.out.println(res1);

	}

	private static int findMethod(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int lsum = 0;
			for(int j=0; j<i;j++) {
				lsum+=arr[j];
			}
			int rsum = 0;
			for(int k=i+1; k<arr.length;k++) {
				rsum+=arr[k];
			}
			if(lsum ==rsum) {
				return i;
			}
		}
		return -1;
	}

	private static int findMethod2(int[] arr) {
		// TODO Auto-generated method stub
		int totalSum = 0;
		for(int n : arr) {
			totalSum+=n;
		}
		int lsum=0;
		for(int i=0;i<arr.length;i++) {
			
			int rsum = totalSum -lsum-arr[i];
			if(lsum == rsum) {
				return i;
			}
			lsum+=arr[i];
		}
		return -1;
	}

}
