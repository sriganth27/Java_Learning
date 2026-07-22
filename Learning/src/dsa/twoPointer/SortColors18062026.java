package dsa.twoPointer;

import java.util.Arrays;

public class SortColors18062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2,0,2,1,1,0};
		int [] arr2 = {2,0,2,1,1,0};
		SortColor(arr);
		SortColorMethod2(arr2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

	private static void SortColorMethod2(int[] arr) {
		// TODO Auto-generated method stub
		int one =0;
		int two =0;
		int three =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				one++;
			}
			else if(arr[i]==1) {
				two++;
			}
			else {
				three++;
			}
		}
		
		int i=0;
		while(one>0) {
			arr[i++] = 0;
			one--;
		}
		while(two>0) {
			arr[i++] = 1;
			two--;
		}
		while(three>0) {
			arr[i++] = 2;
			three--;
		}
		
	}

	private static void SortColor(int[] arr) {
		// TODO Auto-generated method stub
		int low =0,mid=0,high = arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr,mid,low);
				mid++;
				low++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				swap(arr,mid,high);
				high--;
			}
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
