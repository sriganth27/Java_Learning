package dsa;

import java.util.Arrays;

public class MoveZerosToEnd08062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,0,2,3,4,0};
		int arr3[] = {1,2,0,2,3,4,0};
		int arr4[] = {1,2,-9,2,-6,4,0};
		int k = 0;
		int arr2[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr2[k++] = arr[i];
			}
		}
		System.out.println(arr2.length);
		System.out.println(Arrays.toString(arr2));
		
		int j =0;
		for(int i=0 ; i<arr3.length; i++) {
			if(arr3[i] !=0) {
				int temp = arr3[j];
				arr3[j] = arr3[i];
				arr3[i] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr3));
		
		int k1 =0;
		for(int i=0 ; i<arr4.length; i++) {
			if(arr4[i] <0) {
				int temp = arr4[k1];
				arr4[k1] = arr4[i];
				arr4[i] = temp;
				k1++;
			}
		}
		System.out.println(Arrays.toString(arr4));
		

	}

}
