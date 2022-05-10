package Assignments;

import java.util.Scanner;

public class RobertMarks {
	public static void main(String[] args) {
		int subject1, subject2,subject3,totalMarks;
		float percentage;
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the marks obtained in three subjects");
		System.out.print("Marks in subject1 ");
		subject1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Marks in subject2 ");
		subject2 = sc.nextInt();
		System.out.println();
		
		System.out.println("Marks in subject3 ");
		subject3 = sc.nextInt();
		
		if(subject1 <= 100 && subject2 <= 100 && subject3 <= 100) {
			totalMarks = subject1+subject2+subject3;
			percentage = (float)(totalMarks*100)/300;
			
			System.out.println("Total marks scored by Robert are "+ totalMarks);
			System.out.printf("Percentage of marks obtained by Robert is %.2f",percentage);
			System.out.print("%");
		}
		else {
			System.out.println("Enter the Marks of each subject below or "
					+ "equals to 100");
		}
	}
}
