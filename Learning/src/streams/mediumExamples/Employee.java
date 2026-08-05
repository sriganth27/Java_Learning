package streams.mediumExamples;

public class Employee {

	int rollNumber;
	String name;
	String department;
	double salary;
	
	
	public Employee(int rollNumber, String name, String department,double salary) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [rollNumber=" + rollNumber + ", name=" + name + ", department=" + department + ", salary="
				+ salary + "]";
	}
	
	
	
	
}
