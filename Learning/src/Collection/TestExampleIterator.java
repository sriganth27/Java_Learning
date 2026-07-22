package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestExampleIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>(Arrays.asList("1","2","3","4"));
//		int size = ls.size();
//		for(int i =0; i<=size ; i++) {
//			ls.remove(i);
//		}
//		
		System.out.println(ls);
		
		Iterator<String> itr =ls.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			
			if("1".equals(s)) {
				//ls.remove(s);
				itr.remove();
			}
		}
		System.out.println(ls);
	}

}
