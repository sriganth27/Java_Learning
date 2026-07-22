package Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		List<Integer> l2 = new ArrayList<>(l1);
		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(8);
		//l2.remove(9);
		
		l2.removeAll(l1);
		
		System.out.println(l2);
		
		List<String> course = Arrays.asList("jva" , "python" , "c" , "c++");
		//course.add("php");
		
		System.out.println(course);
		
		List<Integer> l3 = new ArrayList<>(3);
		l3.add(90);
		l3.add(89);
		l3.add(78);
		l3.add(909);
//		l3.addFirst(null);
//		l3.removeFirst();
//		l3.removeLast();
		
		
		for(int i=0; i<l3.size() ; i++) {
			System.out.println(l3.get(i));
		}
		
		ListIterator<Integer> itr = l3.listIterator();
		
		while(itr.hasNext()) {
			Integer it = itr.next();
			if(it.equals(909)) {
				l3.remove(909);
			}
//			System.out.println(itr.next());
		}
		
		System.out.println(l3);
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		 
		for(Iterator itrr = l3.iterator() ; itrr.hasNext();) {
			Integer it = (Integer) itrr.next();
			System.out.println("using"+it);
		}
		
		l3.forEach(e-> System.out.println(e));
		
	}

}
