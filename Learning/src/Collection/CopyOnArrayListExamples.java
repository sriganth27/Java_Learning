package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnArrayListExamples {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<Integer> l1 = new CopyOnWriteArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);

		Iterator<Integer> itr = l1.iterator();
		l1.add(4);

		while (itr.hasNext()) {
			Integer it = itr.next();
			if (it.equals(3)) {
				l1.remove(it);
			}
			System.out.println(it);
		}

		System.out.println(l1);

		Set<Integer> l2 = new CopyOnWriteArraySet<>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		System.out.println(l2);

		Iterator<Integer> itr2 = l2.iterator();
		while (itr2.hasNext()) {
			Integer it = itr2.next();
			if (it.equals(10)) {
				l2.remove(it);
			}
		}

		System.out.println(l2);
	}

}
