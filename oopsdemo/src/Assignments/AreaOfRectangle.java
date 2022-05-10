package Assignments;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		int area;
		double length,breadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of a rectangle");
		
		System.out.print("Length ");
		length = sc.nextDouble();
		System.out.println();
		
		System.out.print("breadth ");
		breadth = sc.nextDouble();
		
		area = (int)(length*breadth);
		System.out.println("The area of a rectangle for given dimensions length "+length+" "
				+ "  and breadth"+breadth+" is "+area);
		

	}

}
