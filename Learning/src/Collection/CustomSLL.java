package Collection;



public class CustomSLL {

	private Node head;
	private Node tail;
	private int size;
	
	public CustomSLL() {
		this.size =0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Node temp = head;
		StringBuilder sb = new StringBuilder();
		while(temp !=null) {
			sb.append(temp.val).append(" -> ");
			temp = temp.next;
		}
		sb.append("null");
		return sb.toString();
	}

	public void insertFirst(int val) {
		Node node = new Node(val,head);
		//node.next = head;
		head = node;
		
		if(tail==null) {
			tail=head;
		}
		size++;
	}
	public void insert(int val) {
		Node node = new Node(val);
		if(head ==null) {
			 insertFirst(val);
			 return;
		}
		System.out.println(size);
		Node temp =get(size-1);
		node.next = temp.next;
		temp.next = node;
		size++;
		
	}
	public void insertLast(int val) {
		if(head ==null) {
			insertFirst(val);
			return;
		}
		
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void insert(int val , int index) {
		if(index>size) {
			return;
		}
		if(index==0) {
			insertFirst(val);
			return;
		}
		else if(index == size) {
			insertLast(val);
			return;
		}
		
		Node temp = head;
		for(int i=1; i<index ;i++) {
			temp = temp.next;
		}
		Node node = new Node(val , temp.next);
		temp.next = node;
	}
	
	public int deleteFirst() {
		if(size ==0) {
			return 0;
		}
	    int val = head.val;
	    head = head.next;
	    if(head ==null) {
	    	tail =null;
	    }
	    size--;
	    return val;
	   
	}
	
	public int deleteLast() {
	
		Node secondLast = get(size-1);
		int val = tail.val;
		tail = secondLast;
		
		tail.next = null;
		size--;
		return val;
	}
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
	
	public int delete(int index) {
		if(index ==0) {
			return deleteFirst();
		}
		else if(index ==size) {
			return deleteLast();
		}
		Node prev = get(index-1);
		int val = prev.next.val;
		prev.next = prev.next.next;
		size--;
		return val;
	}
	
	public Boolean contains(int val) {
		Node temp = head;
		while(temp !=null) {
			if(temp.val == val) {
				return true;
			}
			temp = temp.next;
		}
		
		return false;
	}
	public void duplicates() {
		Node node = head;
		if(head == null) {
			return ;
		}
		while(node.next != null) {
			if(node.val == node.next.val) {
				node.next = node.next.next;
				size--;
			}
			else {
				node = node.next;
			}
		}
		tail = node;
		tail.next = null;
	}
	
	public static CustomSLL merge(CustomSLL fs , CustomSLL ls) {
		Node f =fs.head;
		Node s = ls.head;
		CustomSLL ans = new CustomSLL();
		while(f!=null && s!=null) {
			if(f.val < s.val) {
				ans.insertLast(f.val);
				f = f.next;
			}
			else {
				ans.insertLast(s.val);
				s= s.next;
			}
		}
		while(f!=null) {
			ans.insertLast(f.val);
			f = f.next;
		}
		while(s!=null) {
			ans.insertLast(s.val);
			s= s.next;
		}
		
		
//		Node temp = ans.head;
//		 while(temp != null) {
//			 System.out.print(temp.val + " -> ");
//			 temp = temp.next;
//		 }
		return ans;
		 
	}
	public void display() {
		Node temp = head;
		 while(temp != null) {
			 System.out.print(temp.val + " -> ");
			 temp = temp.next;
		 }
 
		 System.out.println("END");
	}
	private class Node {
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val, Node next) {
			super();
			this.val = val;
			this.next = next;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.valueOf(val);
		}
		
	}
	
	public static void main(String[] args) {
//		CustomSLL ls = new CustomSLL();
//		ls.insertFirst(5);
//		ls.insertFirst(8);
//		ls.insertFirst(9);
//		ls.insertLast(10);
//		ls.insertLast(11);
//        ls.insert(20, 2);
//		ls.display();
//		System.out.println(ls.deleteFirst());
//		ls.display();
//		System.out.println(ls.deleteLast());
//		ls.display();
//		System.out.println(" deleted value is "+ls.delete(2));
//		ls.display();
//		System.out.println(ls.get(1));
//		System.out.println(ls.contains(1));
//		
		CustomSLL ls2 = new CustomSLL();
		ls2.insertFirst(1);
		ls2.insertFirst(1);
		ls2.insertFirst(2);
		ls2.insertFirst(4);
		ls2.insertFirst(7);
		ls2.insertFirst(7);
		ls2.insert(12, 9);
		ls2.duplicates();
		ls2.display();
		
		CustomSLL ls3 = new CustomSLL();
		ls3.insertFirst(4);
		ls3.insertFirst(3);
		ls3.insertFirst(1);
		ls3.display();
		
		CustomSLL ls4 = new CustomSLL();
		ls4.insertFirst(5);
		ls4.insertFirst(3);
		ls4.insertFirst(1);
		ls4.insert(8);
		ls4.display();
//		CustomSLL result = CustomSLL.merge(ls3, ls4);
//		System.out.println(result);
		
	}
}
