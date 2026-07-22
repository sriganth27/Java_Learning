package Collection;

public class CustomDLL {

	int size ;
	Node head;
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		if(head !=null) {
			head.prev = node;
		}
		
		node.prev = null;
		node.next = head;
		
		head = node;
		size++;
		
	}
	
	public void insertLast(int val) {
		Node node = new Node(val);
		node.next = null;
	    Node last = head;
	   
	    if(head ==null) {
	    	insertFirst(val);
	    	return;
	    }
	    
	    while(last.next !=null) {
	    	last = last.next;
	    }
	    

	    last.next = node;
	    node.prev = last;
	    size ++;
	    
	}
	public void set(int index , int val) {
		Node last = get(index -1);
		Node node = new Node(val,last,last.next);
		last.next.prev = node;
		last.next = node;
		
		size++;
	
		
		
	}

	public Node get(int index) {
		Node last = head;
		for(int i=0; i<index; i++) {
			last = last.next;
		}
		return last;
	}
	public void display() {
		Node temp = head;
		
		while(temp !=null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
			
		}
		System.out.println("null");
		

	}
	
	public void reverse() {
		Node temp = head;
		Node last = null;
		while(temp !=null) {
			
			last = temp;
			temp = temp.next;
			
		}
		
		
		while(last !=null) {
			System.out.print(last.val + " -> ");
			last = last.prev;
		}
		System.out.println("END");
	}
	private class Node {
		private int val;
		private Node prev;
		private Node next;
		
		
		public Node(int val) {
			super();
			this.val = val;
		}


		public Node(int val, Node prev, Node next) {
			super();
			this.val = val;
			this.prev = prev;
			this.next = next;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomDLL dl = new CustomDLL();
		dl.insertFirst(1);
		dl.insertFirst(2);
		dl.insertLast(3);
		dl.display();
		dl.set(2, 20);
		dl.display();
		dl.reverse();

	}

}
