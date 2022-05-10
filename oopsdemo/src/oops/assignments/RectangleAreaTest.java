package oops.assignments;

import java.util.Scanner;

class RectangleArea{
	float length,breadth;
	Scanner sc = new Scanner(System.in);
	
	void getDimensions() {
		System.out.println("Enter the dimensions of the rectangle in meters");
		System.out.print("Length ");
		length = sc.nextFloat();
		System.out.print("Breadth ");
		breadth = sc.nextFloat();
	}
	float area() {
		float a = (length)*(breadth);
		return a;
	}
	
}

public class RectangleAreaTest {
	public static void main(String[] args) {
		RectangleArea r1 = new RectangleArea();
		r1.getDimensions();
		System.out.println("Area square meters is "+r1.area());
	}
}
