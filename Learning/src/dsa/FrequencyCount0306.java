package dsa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyCount0306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,5,10,15,10,5};
		
		Map<Integer , Integer> mp = new LinkedHashMap<>();
		for(int arr1 : arr) {
			//mp.put(arr1,mp.getOrDefault(arr1, 0)+1);
			mp.compute(arr1, (k,v) -> v==null ? 1 : v+1);
			//mp.computeIfAbsent(arr1, v-> 1);
			//mp.computeIfPresent(arr1, (k,v)-> v+1);
		}
		
		int min = 0;
		int max = 0;
		for(Map.Entry<Integer, Integer> map : mp.entrySet()) {
			System.out.println(map.getKey() + " occurs "+ map.getValue() + " times");
			
			if(map.getValue() ==1) {
				min = map.getKey();
			}
			
			else if(max < map.getValue()) {
				max = map.getKey();
			}
		}
		
		System.out.println("min value is "+ min);
		System.out.println("max value is "+ max);
		
		
		
		
		
		
		
		
		
		
		
		
		Set<Integer> st = mp.keySet();
		System.out.println(st);
		Collection<Integer> cl = mp.values();
		System.out.println(cl);
		Iterator<Map.Entry<Integer, Integer>> itr = mp.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> it = itr.next();
			System.out.println(it.getKey() + " occurs "+ it.getValue() + " times");
			
			
		}
		
		mp.forEach((k,v)->{
			System.out.println(k + " occurs "+ v + " times");
		});

	}

}
