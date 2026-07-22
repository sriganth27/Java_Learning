package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator  {

	int roll;
	float marks;
	String name;
	
	public TestComparator(int roll, float marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public TestComparator(int roll, float marks) {
		this.roll = roll;
		this.marks = marks;
	}

	

	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public float getMarks() {
		return marks;
	}



	public void setMarks(float marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return  roll + "," + marks + "," + name;
	}

	
public static void main(String[] args) {
	List<TestComparator> l1 = new ArrayList<>();
	l1.add(new TestComparator(34, 89f , "sri"));
	l1.add(new TestComparator(25, 89f,"raj"));
	l1.add(new TestComparator(89, 89f,"abhi"));
	l1.add(new TestComparator(56, 89f,"dhanush"));
	
	List<String> names = new ArrayList<>();
	names.add("sri");
	names.add("raj");
	names.add("dhee");
//	names.sort((o1, o2) -> o1.compareTo(o2));
//	Collections.sort(names ,(o1, o2) -> o1.compareTo(o2));
//	System.out.println("names " +names);
//	Collections.sort(l1, new Mysort1());
//	System.out.println(l1);
//	l1.forEach(e -> System.out.println(e));
//	//l1.sort((a,b) -> b.getRoll() - a.getRoll());
//	System.out.println("roles " +l1);
//	Collections.sort(l1, (a,b) -> a.getName().compareTo(b.getName()));
//	System.out.println("using names " +l1);
	//Using subtraction in comparator may cause integer overflow for large values, 
	//leading to incorrect sorting behavior. Integer.compare() is the safer approach.
	l1.sort((a,b) -> Integer.compare(b.getRoll(), a.getRoll()));
	System.out.println("roles " +l1);
}


	
}

class Mysort1 implements Comparator<TestComparator>{


	   @Override
		public int compare(TestComparator o , TestComparator o1) {
			// TODO Auto-generated method stub
			return (int)o1.getRoll() - o.getRoll() ;
		}


	}
