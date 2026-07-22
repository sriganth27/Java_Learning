package dsa;

import java.util.Arrays;

public class ReverseUsingTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,6,7};
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
