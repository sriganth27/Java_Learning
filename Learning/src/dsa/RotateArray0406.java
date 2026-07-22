package dsa;

import java.util.Arrays;

public class RotateArray0406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		int arr2[] = {1,2,3,4};
		int arr3[] = {1,2,3,4};
		
		
		int num = 2;
	
		// Method 1
		for(int j=0; j<num; j++) {
			int first = arr[0];
			for(int i=0; i<arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = first;
		}
		
		
		
		System.out.println(Arrays.toString(arr));

		// Mthod 2
		
		int newArray [] = new int [arr2.length];
		
		int k = 0;
		for(int i = num; i<arr2.length; i++) {
			newArray[k++] = arr2[i];
		}
		
		for(int i = 0; i<num; i++) {
			newArray[k++] = arr2[i];
		}
		
		System.out.println(Arrays.toString(newArray));
		
		//Method 3
		
		num = num % arr.length;
				
		reverse(arr3 , 0, arr3.length-1);
		
		reverse(arr3, 0 , num-1);
		
		reverse(arr3,num, arr3.length-1);
		System.out.println(Arrays.toString(arr3));
	}
	
	public static void reverse(int arr[] , int start , int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
