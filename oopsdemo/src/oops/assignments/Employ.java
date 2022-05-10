package oops.assignments;

import java.util.Scanner;

class EmployTest{
	int empId;
	String name;
	long salary;
	float noOfHoursworksPerDay;
	
	Scanner sc = new Scanner(System.in);
	
	void getInfo() {
		System.out.println(">>>>>>>>>>>>>Enter employee details<<<<<<<<<<<");
		System.out.println("employee id, employee name, salary in dollars, no of hours works in a day");
		empId = sc.nextInt();
		name = sc.next();
		salary = sc.nextLong();
		noOfHoursworksPerDay = sc.nextFloat();
	}
	void addSalary() {
		if (salary < 500)
			salary+=10;
		
	}void addWork(){
		if(noOfHoursworksPerDay>6)
			salary += 5;
	}
	void print() {
		System.out.println("The final salary of an employee is "+salary);
	}
}
public class Employ {

	public static void main(String[] args) {
		EmployTest e1 = new EmployTest();
		e1.getInfo();
		e1.addSalary();
		e1.addWork();
		e1.print();

	}

}
