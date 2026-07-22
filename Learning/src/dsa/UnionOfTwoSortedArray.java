package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {3, 4, 6, 7, 9, 9};
		int arr2[] = { 1, 5, 7, 8, 8};
		List<Integer> ls = new ArrayList<>();
		Set<Integer> ls2 = new TreeSet<>();
		Map<Integer, Integer> map = new LinkedHashMap<>();
		List<Integer> ls3 = new ArrayList<>();

		for (int arr : arr1) {
			map.computeIfAbsent(arr, k -> 1);
			ls2.add(arr);
		}
		for (int arr : arr2) {
			map.computeIfAbsent(arr, k -> 1);
			ls2.add(arr);
		}

		for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
			ls.add(mp.getKey());
		}

		System.out.println(ls);
		System.out.println(ls2);
		usingTwoPointer(arr1, arr2, ls3);
		System.out.println("using two pointer is " + ls3);
	}

	private static void usingTwoPointer(int[] arr1, int[] arr2, List<Integer> ls) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				if (ls.isEmpty() || ls.get(ls.size() - 1) != arr1[i]) {
					ls.add(arr1[i]);
				}

				i++;
			} else  {
				if (ls.isEmpty() || ls.get(ls.size() - 1) != arr2[j]) {
					ls.add(arr2[j]);
				}

				j++;
			}

		}
		while (i < arr1.length) {

			if (ls.isEmpty() || ls.get(ls.size() - 1) != arr1[i]) {
				ls.add(arr1[i]);
				
			}
			i++;
		}
		while (j < arr2.length) {

			if (ls.isEmpty() || ls.get(ls.size() - 1) != arr2[j]) {
				ls.add(arr2[j]);
				
			}
			j++;
		}

		int [] arr = new int[ls.size()];
		for(int k=0; k<ls.size();k++) {
			arr[k] = ls.get(k);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
