package dsa.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum18062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-1,0,1,2,-1,-4};
		List<List<Integer>> ls = find3Sum(arr);

		System.out.println(ls);
		List<List<Integer>> ls2 = find3SumMethod2(arr);
		System.out.println(ls2);
	}

	private static List<List<Integer>> find3SumMethod2(int[] arr) {
		// TODO Auto-generated method stub
		List<List<Integer>> ls = new ArrayList<>();
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1; k<arr.length;k++) {
					int sum = arr[i]+arr[j]+arr[k];
					if(sum==0) {
						ls.add(Arrays.asList(arr[i],arr[j],arr[k]));
					}
					
				}
			}
		}
		return ls;
	}

	private static List<List<Integer>> find3Sum(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		List<List<Integer>> ls = new ArrayList<>();
		int len = arr.length;
		for(int i=0;i<len-2;i++) {
			int j=i+1,k=len-1;
			if(i>0 && arr[i] + arr[i-1]==0) {
				continue;
			}
			int sum = arr[i]+arr[j]+arr[k];
			while(j<k) {
				if(sum==0) {
					ls.add(Arrays.asList(arr[i],arr[j],arr[k]));
					while(j<k && arr[j]==arr[j+1]) {
						j++;
					}
					while(j<k&& arr[k]==arr[k-1]) {
						k--;
					}
					j++;
					k--;
				}
				else if(sum>0) {
					k--;
				}
				else {
					j++;
				}
			}
			
		}
		return ls;
	}

}
