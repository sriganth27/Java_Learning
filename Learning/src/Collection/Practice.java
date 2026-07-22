package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		l1.add(9);
		l1.add(6);
		
		Collections.sort(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);

	}

}
