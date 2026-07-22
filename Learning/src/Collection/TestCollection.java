package Collection;

import java.util.*;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> animals = new ArrayList<>();
		animals.add("test");
		animals.add("test1");
		animals.add("testw");
		animals.add("test3");
		
		Collection<String> animals2 = new ArrayList<>();
		
		animals2.addAll(animals);
		
		
		
		
		System.out.println(animals.contains("testing"));
		//animals2.clear();
		animals2.forEach(s->System.out.println(s));
		System.out.println(animals2);
	}

}
