package oopsdemo1;

import java.util.Scanner;

// instance class
public class Student {
	
	 //properties/state/variables/attributes
	int rollNumber;
	String name,course;
	float m1,m2,m3,total;
	
	Scanner sc = new Scanner(System.in);
	
	//instance methods/actions/function - user defined functions
	public void inputDetils() {//method doesnot return any value
		System.out.println("Enter  Roll No,Name,course:");
        rollNumber=sc.nextInt();
        name=sc.next();
        course=sc.next();

        System.out.println("Enter marks of 3 subjects:");
        m1=sc.nextFloat();
        m2=sc.nextFloat();
        m3=sc.nextFloat();
        
	}
	public float calculate() {
		total = m1+m2+m3;
		return total;
	}
	
	public void displayDetails() {
		System.out.println("******* Student Details *************");
        System.out.println("Roll No     :"+rollNumber);
        System.out.println("Name        :"+name);
        System.out.println("Course      :"+course);
        System.out.println("Total Marks :"+total);
        System.out.println("*************************************");
	}
}
