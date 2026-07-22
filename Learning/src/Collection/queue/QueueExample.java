package Collection.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> qu = new LinkedList<>();
//		qu.offer(null);
//		qu.add(5);
//		qu.add(6);
//		qu.add(67);
//		qu.add(8);
		
		//System.out.println(qu.remove()); // throw exceptions if queue is empty
		System.out.println(qu.poll()); // wont throw exception return null if queue is empty
		//System.out.println(qu.element());
		System.out.println(qu.peek());
		System.out.println(qu);
	//	Stack<Integer> st = new Stack<>();
		
		Deque<Integer> dq = new LinkedList<>();
		dq.push(null);
		dq.pop();
		//dq.pop();
		dq.offer(78);
		dq.offerFirst(55);
		dq.offerFirst(57);
		System.out.println("first occurance"+dq.removeFirstOccurrence(dq));
		System.out.println("peek first element"+dq.peekFirst()); 
		System.out.println(dq.pollFirst());
		System.out.println(dq);
		
		Iterator<Integer> itr = dq.descendingIterator();
		while(itr.hasNext()) {
			Integer val = itr.next();
			System.out.println("value is "+val);
		}
		
	}

}
