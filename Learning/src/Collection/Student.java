package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {

	int roll;
	float marks;
	
	public Student(int roll, float marks) {
		this.roll = roll;
		this.marks = marks;
	}

	

	@Override
	public String toString() {
		return  roll + "," + marks + "";
	}

	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		System.out.println("inside compareto");
		int diff = (int)(this.marks - o.marks);
		return diff;
	}
	
	
}




