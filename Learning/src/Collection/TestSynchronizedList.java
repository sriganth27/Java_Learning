package Collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestSynchronizedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = Collections.synchronizedList(new ArrayList<>());
		
		l1.add("sri");
		l1.add("tes");
		l1.add("test2");
		//l1.add("test");
		Thread t1 = new Thread(()->{
	    synchronized (l1) {
			Iterator<String> it = l1.iterator();
			while(it.hasNext()) {
				String names = it.next();
				System.out.println(names);	
				try {
					Thread.sleep(1000);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
}
		}	
		});
		Thread t2 = new Thread(()->{
			l1.add("testimg");
		});
		
		t1.start();
		t2.start();

	}

}
