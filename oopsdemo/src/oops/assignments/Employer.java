package oops.assignments;

public class Employer extends Member {
	String specialization;

	public Employer(String name, String address, byte age, long phoneNumber, long salary,String sp) {
		super(name, address, age, phoneNumber, salary);
		this.specialization = sp;
	}void display(){
		super.display();
		System.out.println("Specialization "+this.specialization);
	}
	

}
