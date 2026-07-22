package Collection.queue;

public class CustomQueueExample {

	private int[] data;
	private  static final int DEFAULT_SIZE = 10;
	
	private int end = 0;
	
	public CustomQueueExample() {
		this(DEFAULT_SIZE);
		
	}
	public CustomQueueExample(int defaultSize) {
		// TODO Auto-generated constructor stub
		this.data = new int[DEFAULT_SIZE];
	}
	
	public boolean add(int item) {
		if(isFull()) {
			return false;
		}
		data[end++] = item;
		return true;
	}
	
	public int remove() {
		
		if(isEmpty()) {
			throw new RuntimeException("queue is empty");
		}
		int removed = data[0];
		for(int i=1 ; i<end ; i++) {
			data[i-1] = data[i];	
		}
		end--;
		return removed;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return end ==0;
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return end == data.length;
	}
	
	public void display() {
		for(int i=0; i<end ; i++) {
			System.out.print(data[i] + " -> ");
		}
		System.out.println("END");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomQueueExample cq = new CustomQueueExample();
		cq.add(8);
		cq.add(9);
		cq.add(10);

		cq.display();
		System.out.println(cq.remove());
		cq.display();
	}

}
