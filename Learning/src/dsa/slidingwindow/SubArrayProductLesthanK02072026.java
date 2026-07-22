package dsa.slidingwindow;

public class SubArrayProductLesthanK02072026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,5,2,6};
		int k=100;
		int result = findMethod1(arr,k);
		System.out.println(result);
		int result2 = findMethod2(arr,k);
		System.out.println(result2);
	}

	private static int findMethod1(int[] arr, int k) {
		// TODO Auto-generated method stub
		int count =0;
		if(k<=0) {
			return 0;
		}
		for(int i=0;i<arr.length;i++) {
			int prod = 1;
			for(int j=i;j<arr.length;j++) {
				prod *=arr[j];
				if(prod<k) {
					count++;
				}
				else {
					break;
				}
			}
		}
		return count;
	}
	private static int findMethod2(int[] arr, int k) {
		// TODO Auto-generated method stub
		int count =0;
		if(k<=0) {
			return 0;
		}
		int prod = 1;
		int l=0;
		for(int r=0;r<arr.length;r++) {
			
			prod *=arr[r];
			while(prod>=k) {
				prod/= arr[l];
				l++;
			}
			count += r-l+1;

			
		}
		return count;
	}

}
