package dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SubarrayswithKDifferentIntegers992 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//07-07-2026
		int arr[] = {1,2,1,2,3};
		int k=2;
		int result = findMethod1(arr,k);
		System.out.println(result);
		int result2 = findMethod2(arr,k);
		System.out.println(result2);

	}

	private static int findMethod1(int[] arr, int k) {
		// TODO Auto-generated method stub
		int count =0;
		
		for(int i=0;i<arr.length;i++) {
			Map<Integer,Integer> map = new HashMap<>();
			for(int j=i;j<arr.length;j++) {
				map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
				if(map.size()==k) {
					count++;
				}
				else if(map.size()>k){
					break;
				}
				
			}
		}
		return count;
	}

	private static int findMethod2(int[] arr, int k) {
		// TODO Auto-generated method stub
		return cal(arr,k) - cal(arr,k-1);
	}
	
	private  static int  cal(int[] arr, int k) {
		int l=0;
		int count =0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int r=0;r<arr.length;r++) {
			map.put(arr[r], map.getOrDefault(arr[r], 0)+1);
			while(map.size()>k) {
				map.put(arr[l], map.get(arr[l])-1);
				if(map.get(arr[l])==0) {
					map.remove(arr[l]);
				}
				l++;
			}
			count+= r-l+1;
		
		}
		return count;
		
	}

}
