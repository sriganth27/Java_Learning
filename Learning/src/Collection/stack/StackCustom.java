package Collection.stack;

public class StackCustom {

	private int [] data;
	private static final int DEFAULT_SIZE =10;
	
	int ptr =-1;
	
	public StackCustom() {
		this(DEFAULT_SIZE);
	}
	public StackCustom(int defaultSize) {
		// TODO Auto-generated constructor stub
		this.data = new int[defaultSize];
	}
	public boolean push(int item) {
		
		if(isStackfull()) {
			System.out.println("stack is full");
			resize();
		}
		
		ptr++;
		data[ptr] = item;
		return true;
	}
	
	
	public void resize() {
		// TODO Auto-generated method stub
		int [] temp = new int[data.length *2];
		
		for(int i=0; i<data.length;i++) {
			temp[i] = data[i];
			
		}
		data = temp;
		
	}
	public int pop() {
		System.out.println(ptr);
		return data[ptr--];
	}
	public int peek() {
		if(isStackEmpty()) {
			System.out.println("stack is empty");
		}
		return data[ptr];
	}

	private boolean isStackEmpty() {
		// TODO Auto-generated method stub
		return ptr == 0;
	}
	private boolean isStackfull() {
		// TODO Auto-generated method stub
		return data.length == ptr;
	}
}
