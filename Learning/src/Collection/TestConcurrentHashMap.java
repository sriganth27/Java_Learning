package Collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> map = new ConcurrentHashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		Map<String,Integer> map2 = new ConcurrentHashMap<>();
		map2.put("test", 1);
		map2.put("tet5", 2);
		map2.put("thuurr", 3);
		
		map.putAll(map2);
		
		//map.compute(null, null);
		System.out.println(map2);
		Thread t1 = new Thread(()->{
			for(String st : map.keySet()) {
				System.out.println(st);
			}
		});
		
		Thread t2 = new Thread(()->{
			map.put("newKey",4);
		});
		
		t1.start();
		t2.start();
	}
	

}
