package dsa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement17062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,2,3};
		int result = findMajority(arr);

		System.out.println(result);
	}

	private static int findMajority(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> mp = new HashMap<>();
		int max =0;
		int  res =0;
		for(int arr1 : arr) {
			mp.put(arr1, mp.getOrDefault(mp, 0)+1);
		}
		for(Map.Entry<Integer, Integer> map : mp.entrySet()) {
			if(map.getValue() > max) {
				max = map.getValue();
				res = map.getKey();
			}
		}
		return res;
	}

}
