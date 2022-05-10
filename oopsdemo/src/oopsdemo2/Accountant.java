package oopsdemo2;

//child class derived from Employee parent class
public class Accountant extends Employee {
	
	String task,tech;
	public Accountant(int empId, String name,String t1,String t2) {
		super(empId, name);
		this.task = t1;
		this.tech = t2;
		
	}
	void print() {
		super.display();// invokes base class display() method
        System.out.println("Accountant Task :"+task);
        System.out.println("Softwares used :"+tech);
	}
}
