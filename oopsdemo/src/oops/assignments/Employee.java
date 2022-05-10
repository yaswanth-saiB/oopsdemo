package oops.assignments;
class EmployeeSetter{
	String name,address;
	int yearOfJoining;
	long salary;
	
	public EmployeeSetter(String name, String address, int yearOfJoining, long salary) {
		this.name = name;
		this.address = address;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	
	void display() {
		System.out.println(name+"\t"+yearOfJoining+"\t\t"+salary+"\t"+address );
	}
}
public class Employee {
	public static void main(String[] args) {
		EmployeeSetter e1 = new EmployeeSetter("Robert","64C- WallsStreet",1994,100000);
		EmployeeSetter e2 = new EmployeeSetter("Sam","68D- WallsStreet",2000,50000);
		EmployeeSetter e3 = new EmployeeSetter("John","26B- WallsStreet",1999,75000);
		
		System.out.println("Name\tYear of joining\tSalary\tAddress");
		e1.display();
		e2.display();
		e3.display();
	}
}
