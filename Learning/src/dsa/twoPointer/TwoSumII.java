package dsa.twoPointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,7,11,15};
		int target = 9;
		int result[] = findSum(arr,target);
		int result2[] = findSumUsingHashMap(arr,target);

		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
	}

	private static int[] findSumUsingHashMap(int[] arr, int target) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int complement = target - arr[i];
			if(map.containsKey(complement)) {
				return new int [] {map.get(complement)+1 , i+1};
			}
			map.put(arr[i], i);
		}
		
		return null;
	}

	private static int[] findSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		int start=0;
		int end = arr.length-1;
		int sum=0;
		while(start<end) {
			sum = arr[start]+arr[end];
			if(sum==target) {
				return new int[] {start+1 , end+1};
			}
			else if(sum<target) {
				start++;
			}
			else {
				end--;
			}
		}
		return new int[] {-1,-1};
		
	}

}
