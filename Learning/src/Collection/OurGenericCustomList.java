package Collection;

import java.util.Arrays;
import java.util.Iterator;

public class OurGenericCustomList<T> implements Iterable<T> {

	private T[] items;
	private int size;
	
	public OurGenericCustomList() {
		size =0;
		items = (T[])new Object[100];
		
	}
	
	public void add(T item) {
		items[size ++] = item;
	}
	
	public T get(int index ) {
		return items[index];	
	}
	
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "OurGenericCustomList [items=" + Arrays.toString(items) + ", size=" + size + "]";
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new OurGenericIterator(this);
	}
	
	private class OurGenericIterator implements Iterator<T>{

		private OurGenericCustomList<T> list;
		private int index =0;
		
		public OurGenericIterator(OurGenericCustomList<T> list) {
			this.list = list;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < list.size;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return list.items[index ++];
		}
		
	}
	
	
}
