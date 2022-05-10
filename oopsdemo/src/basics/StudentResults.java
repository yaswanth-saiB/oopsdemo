package basics;

import java.util.Scanner;

public class StudentResults {
	public static void main(String[] args) {
		/* Program to enter RollNumber, Name & Marks of 5 Subjects  of a Student
		 * & calculate the aggregate marks & Display Result
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("************ Enter Student Details ***********");

		System.out.println("Enter Student Roll No     : ");
		int roll=scan.nextInt();
		System.out.println("Enter Student Name        : ");
		String name=scan.next();

		System.out.println("Enter Marks of 5 Subjects :");
		float m1=scan.nextFloat();
		float m2=scan.nextFloat();
		float m3=scan.nextFloat();
		float m4=scan.nextFloat();
		float m5=scan.nextFloat();
		scan.close();

		float total=(m1+m2+m3+m4+m5);
		float agg=(10 *total)/500;
		
		System.out.println("********** Student Result ********");
		System.out.println("Roll Number  : "+roll);
		System.out.println("Student Name : "+name);
		System.out.println("Total Marks  : "+total);
		System.out.println("Aggregate    : "+agg);
		
		if(agg> 8.5)
		{
			System.out.println("Result : Distinction");
		}
		else if(agg >=7  && agg <8.5 )
		{
			System.out.println("Result : First Class");
		}
		
		else if(agg >=5  && agg <7 )
		{
			System.out.println("Result : Second Class");
		}
		else if(agg >=4  && agg <5)
		{
			System.out.println("Result : Pass Class");
		}
		else
		{
			System.out.println("Result : Fail");
		}
		
		System.out.println("************************************");

	}
}
