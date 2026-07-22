package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //add, addFirst , addLast 
		List<String> fruits = new LinkedList<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("guva");
		fruits.reversed();
	
	
		System.out.println("fruits list => "+fruits.reversed());
		fruits.addLast("papaya");
		fruits.addFirst("sapata");
		
		System.out.println("fruits list => "+fruits);
		boolean isThere = fruits.contains("guva");
		System.out.println(isThere);
		
		List<String> frt = new LinkedList<>();
		frt.addAll(fruits);
		frt.addLast("mango");
		System.out.println(frt);
		System.err.println(frt.containsAll(fruits));
		
		String fname = frt.getFirst();
		String lname = frt.getLast();
		String rname = frt.get(0);
		System.out.println("first fruits "+ fname + ", last fruits "+lname);
		System.out.println("index base fruits "+rname);
		System.out.println(frt);
		
		System.out.println(frt.lastIndexOf("mango"));
		
		
		Iterator<String> itr =frt.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
			
		}
		
		frt.forEach(e -> System.out.println(e));
		
		for(String st : frt) {
			System.out.println("using modexr foreach "+st);
		}
		
		frt.remove(0);
		System.out.println(frt);
		
		frt.removeLast();
		frt.removeFirst();
		System.out.println(frt);
	}

}
