package Collection;

import java.util.Arrays;

// here T should be either a Number or its subclass
public class WildCards<T extends Number> {

	private Object[] data;
	private static int DEFAULT_SIZE = 10;
	private int size =0;
	
	public WildCards() {
		this.data = new Object[DEFAULT_SIZE];
	}
	
	public void add(T num) {
		if(isFull()) {
			resize();
		}
		
		data[size++] = num;
	}

	private void resize() {
		// TODO Auto-generated method stub
		Object[] temp = new Object [data.length *2];
		
//		for(int arr : data) {
//			temp = data;
//		}
		
		for(int i =0 ; i< data.length ; i++) {
			temp[i] = data[i];
		}
		 
		data = temp;
	}

	public T get(int index) {
		return (T) (data[index]);
	}
	
	public void set(int index , T value) {
		data[index] = value;
	}
	
	public int size() {
		return size;
	}
	
	
	public T remove() {
		T removed = (T)(data[--size]) ;
		return removed;
	}
	
	private boolean isFull() {
		// TODO Auto-generated method stub
		return size == data.length;
	}
	
	@Override
	public String toString() {
		return "CustomGenericArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}

	public static void main(String []args) {
		
		WildCards<Float> cs = new WildCards<Float>();
		cs.add(3.8f);
		cs.add(7.8f);
		cs.add(8.5f);
		
		cs.set(2, 10.8f);
		System.out.println(cs.toString());
		
		cs.remove();
		cs.add(56.6f);
		System.out.println(cs.toString());
		
		for( int i=0 ; i<13 ; i++) {
			cs.add((float)i);
		}
		
		System.out.println(cs.toString());
		int x =6;
		double d = x;
		System.out.println(d);
		
		double s = 12.6;
		int t = (int)(s);
		System.out.println(t);
		
	}
}
