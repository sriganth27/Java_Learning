package Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new LinkedHashMap<>();
		map.putIfAbsent("one", 1);
	//	map.put("one", map.getOrDefault(map, 0)+1);
		if(!map.containsKey("one")) {
			map.put("one", 1);
		}
		else {
			map.put("one", map.get("one") + 1);
		}
		
		System.out.println(map);
		map.computeIfAbsent("two", k ->1);
		System.out.println(map);
		map.computeIfPresent("two", (k,v)-> v+1);
		System.out.println(map);
		map.compute("twot", (k,v)-> v==null ? 1 : v+1);
		System.out.println(map);
		
		String str = "sriganthsri";
		String arr [] = str.split("");
		
		for(String ar : arr) {
			map.compute(ar, (k,v) -> v == null ?1:v+1);
			//map.put(ar, map.getOrDefault(ar, 0)+1);
		}
		
		map.forEach((k,v)-> {
			if(v==1) {
				System.out.println("first non repetive character is :"+k);
				return;
			}
		});
		
		
			
		
		System.out.println(map);
		
		int count =0;
		int mapsize = map.size()-1;
		String last = "";
		for(Map.Entry<String,Integer> mp : map.entrySet()) {
			if(mp.getValue() == 1) {
				System.out.println(mp.getKey());
				
				last = mp.getKey();
				
			}

		}
		System.out.println("last non repitive "+last);
		

	}

}
