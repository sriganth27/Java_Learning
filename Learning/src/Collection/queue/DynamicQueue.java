package Collection.queue;

public class DynamicQueue {

	private int [] data ;
	private static final int DEFAULT_SIZE = 5;
	private int front =0;
	private int end =0;
	private int size =0;
	public DynamicQueue() {
		this(DEFAULT_SIZE);
	}
	public DynamicQueue(int defaultSize) {
		// TODO Auto-generated constructor stub
		this.data = new int [DEFAULT_SIZE];
	}
	
	public boolean offer(int item) {
		if(isFull()) {
			//throw new RuntimeException("queue is full");
			
			
			int [] temp = new int [data.length *2];
			
			for(int i = 0 ; i<data.length ; i++) {
				temp[i] = data[(front + i) % data.length];
			}
			front = 0;
			end = data.length;
			data = temp;
					
			
		}
		
		data[end++] = item;
		end = end % data.length;
		size ++;
		return true;
	}
	
	public int poll() {
		if(isEmpty()) {
			throw new RuntimeException("queue is empty");
		}
		
		int removed = data[front++];
		front = front % data.length;
		size --;
		return removed;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return size ==0;
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return size == data.length;
	}
	public void display() {
		int i = front ;
		do {
			System.out.print(data[i++] + " -> ");
			i = i%data.length;
		}
		while( i!=end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DynamicQueue dm = new DynamicQueue();
		dm.offer(7);
		dm.offer(9);
		dm.offer(0);
		
		System.out.println(dm.poll());
		System.out.println(dm.poll());
		//dm.poll();
		dm.offer(78);
		dm.offer(7);
		dm.offer(9);
		dm.offer(0);
		dm.offer(78);
		dm.offer(90);
		dm.offer(90);
		dm.display();
		
	}

}
