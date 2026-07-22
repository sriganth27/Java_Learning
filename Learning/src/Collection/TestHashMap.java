package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> mp = new LinkedHashMap<>();
		mp.put("one", 1);
		mp.put("two", 2);
		mp.put("three", 3);
		mp.put("four", 4);
		System.out.println(mp);
		//mp.clear();
		mp.get("three");
		mp.values();
		System.out.println(mp.containsValue(4));
		mp.putIfAbsent("fours",4);
	
	
	
		mp.forEach((K,V)->{
			System.out.println(K.charAt(K.length()-1));
			
			System.out.println("replace "+K.replaceAll("wo","ow" ));
			
			if(K.equalsIgnoreCase("three")) {
				System.out.println(V);
			}
			
			
			System.out.println("Key ->" + K + " Val ->" + V );
		});
		Collection<Integer> cl =mp.values();
		System.out.println("values "+cl);
		for(Integer vl : cl) {
			System.out.println(vl);
		}
		Set<String> set =mp.keySet();
		System.out.println("keys in "+set);
		Map<String,String> map = new HashMap<>();
		map.put(null, null);
	//	Set<String> key  = mp.keySet();
		System.out.println("using sysout"+mp);
		for(Map.Entry<String, Integer> entry : mp.entrySet()) {
			
			if("one".equals(entry.getKey())) {
				//mp.remove(entry.getKey());
			}
			System.out.println("Key -> "+entry.getKey() + " Value ->"+ entry.getValue());
		}
		
		Set<Map.Entry<String, Integer>> entryMap = mp.entrySet();
		Iterator<Entry<String, Integer>> iterator = mp.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> it = iterator.next();
			if(it.getKey().equalsIgnoreCase("One")) {
				//mp.remove("one");
				iterator.remove();
			}
			
			System.out.println("Key in Iterator ->" + it.getKey() + "  Value ->"+it.getValue());
		}
		System.out.println(mp);
		
		String str ="Hi iam sriganth sriganth is my name hi";
		// =str.toLowerCase();
		String [] words = str.split(" ");
		Map<String, Integer>  m1= new HashMap<>();
		
		for(String word : words) {
			m1.put(word, m1.getOrDefault(word, 0) +1);
			
		}
		System.out.println(m1);
		m1.forEach((K,V)->{
			System.out.println(K+" occurs ->" +V+" time");
		});
		List<Map.Entry<String, Integer> > entryList = new ArrayList<>(m1.entrySet());
		entryList.sort((a,b)->b.getValue().compareTo(a.getValue()));
		
		
		for(Map.Entry <String, Integer> entry : entryList) {
			
			System.out.println(entry.getKey()+" occurs: ->" +entry.getValue()+" :time");
			
		}

	}

}
