package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(16, 89.66f);
		Student s1 = new Student(90, 78.98f);
		Student kunal = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.52f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student [] ls = {s , s1 , kunal};
        System.out.println(Arrays.toString(ls));
        Arrays.sort(ls);
        System.out.println(Arrays.toString(ls));
        
        List<Student> lis = new ArrayList<>();
        lis.add(s);
        lis.add(s1);
        
        Collections.sort(lis);
        System.out.println("test" +lis);
		if(s.compareTo(s1) < 0) {
			System.out.println("s is smaller");
		}
		
		OurGenericCustomList<Integer> list = new OurGenericCustomList<>();
		list.add(4);
		list.add(5);
//		System.out.println(list.toString());
//		System.out.println(list.get(1));
//		System.out.println(list.size());
		
		Iterator<Integer> iterator =  list.iterator();
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
	    
	    for(Integer it : list) {
	    	System.err.println(it);
	    }
		

		

	}

}
