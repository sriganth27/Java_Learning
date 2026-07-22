package Collection;

import java.util.Arrays;

public class CustomArrayList {

	private int[] data;
	private static int DEFAULT_SIZE = 10;
	private int size =0;
	
	public CustomArrayList() {
		this.data = new int[DEFAULT_SIZE];
	}
	
	public void add(int num) {
		if(isFull()) {
			resize();
		}
		
		data[size++] = num;
	}

	private void resize() {
		// TODO Auto-generated method stub
		int[] temp = new int [data.length *2];
		
//		for(int arr : data) {
//			temp = data;
//		}
		
		for(int i =0 ; i< data.length ; i++) {
			temp[i] = data[i];
		}
		 
		data = temp;
	}

	public int get(int index) {
		return data[index];
	}
	
	public void set(int index , int value) {
		data[index] = value;
	}
	
	public void clear() {
		
		for(int i =0 ; i<size ; i++) {
			data[i] =   0;
		}
		size =0;
	}
	public int size() {
		return size;
	}
	
	
	public int remove() {
		int removed = data[--size] ;
		return removed;
	}
	
	private boolean isFull() {
		// TODO Auto-generated method stub
		return size == data.length;
	}
	
	private boolean contains(int value) {
		return indexof(value) >=0;
		
	}
	private int indexof(int value) {
		// TODO Auto-generated method stub
		return indexRange(value,0,size);
	}

	private int indexRange(int value, int start, int end) {
		// TODO Auto-generated method stub
		int[] obj = data;
		
		for(int i =start ; i<=end ; i++ ) {
			if(value == obj[i]) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}

	public static void main(String []args) {
		
		CustomArrayList cs = new CustomArrayList();
		cs.add(3);
		cs.add(7);
		cs.add(8);
		System.out.println(cs.contains(89));
		cs.set(2, 10);
		System.out.println(cs.toString());
		
		cs.remove();
		cs.add(56);
		System.out.println(cs.toString());
		
		for( int i=0 ; i<13 ; i++) {
			cs.add(i);
		}
		
		System.out.println(cs.toString());
		cs.clear();
		System.out.println(cs);
	}
}
