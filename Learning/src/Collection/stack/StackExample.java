package Collection.stack;

import java.util.ListIterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
	
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.peek();
		st.remove(0);
		st.addFirst(null);
		st.addLast(67);
		System.out.println(st);
		ListIterator<Integer> lst =st.listIterator();
		while(lst.hasNext()) {
			System.out.println(st.pop());
		}
		
//		st.forEach(e-> System.out.println(e));
//		st.forEach(System.out::println);
//		System.out.println(st.search(4));
		

	}

}
