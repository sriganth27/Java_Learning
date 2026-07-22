package Collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(9);
		s1.add(7);
		s1.add(2);
		
		Set<Integer> s2 = new HashSet<>(s1);
		s2.add(null);
		s2.add(78);
		s2.add(56);
		s2.add(78);
		System.out.println(s2.remove(78));
		
		System.out.println(s2);
		
		Queue<Integer> q = new LinkedList<>();
		System.out.println("queue is " +q.peek());
		
		s2.removeAll(s1);
		System.out.println(s2);
		s1.addAll(s2);
		System.out.println(s1);
        s1.clear();
        System.out.println(s1);
        
        
		
		
		
		

	}

}
