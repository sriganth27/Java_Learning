package streams;

public class Student {

	private int roll;
	private String name;
	private String dept;
	private int marks;

	public Student(int roll, String name, String dept, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Students{" + "roll= "+roll + "name= "+name + "dept= "+dept + "}";
	}


}
