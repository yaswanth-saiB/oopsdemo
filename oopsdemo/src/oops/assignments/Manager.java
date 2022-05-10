package oops.assignments;

public class Manager extends Member {
	String department;
	
	public Manager(String name, String address, byte age, long phoneNumber, long salary,String dp) {
		super(name, address, age, phoneNumber, salary);
		this.department = dp;
	}
	void display() {
		super.display();
		System.out.println("Department "+this.department);
	}
}
