package oops.assignments;

public class Member {
	String name,address;
	byte age;
	long phoneNumber,salary;
	
	public Member(String name, String address, byte age, long phoneNumber, long salary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	void printSalary() {
		System.out.println("The salary of "+name+" is "+salary);
	}
	void display() {
		System.out.println("-------------------------------------");
		System.out.println("Members details are");
		System.out.println("Name "+this.name);
		System.out.println("Age "+this.age);
		System.out.println("Address "+this.address);
		System.out.println("Phone number "+this.phoneNumber);
		System.out.println("Salary "+this.salary);
		
	}
}
