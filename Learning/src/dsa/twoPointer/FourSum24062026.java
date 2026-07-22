package dsa.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum24062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1000000000,1000000000,1000000000,1000000000};
		int target = -294967296;
		List<List<Integer>> ls = find4Sum(arr,target);
		System.out.println(ls);

	}

	private static List<List<Integer>> find4Sum(int[] arr, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> ls = new ArrayList<>();
		Arrays.sort(arr);
		int n = arr.length;
		for(int i=0;i<n-3;i++) {
			if(i>0 && arr[i] == arr[i-1]) {
				continue;
			}
			for(int j=i+1;j<n-2;j++) {
				if(j>i+1 && arr[j] == arr[j-1]) {
					continue;
				}
				int k = j+1;
				int l= n-1;
				while(k<l) {
					int sum = arr[i]+arr[j]+arr[k]+arr[l];
					if(sum == target) {
						ls.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
						while(k<l && arr[k] == arr[k+1]) {
							k++;
						}
						while(k<l && arr[l] == arr[l-1]) {
							l--;
						}
						k++;
						l--;
					}
					else if(sum<target){
						k++;
					}
					else {
						l--;
					}
				}
				
			}
		}
		return ls;
	}

}
