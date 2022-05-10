package oops.assignments;
class Rect{
	float length,breadth;

	public Rect(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	float area() {
		float a = length*breadth;
		return a;
	}
}
public class Rectangle {
	public static void main(String[] args) {
		Rect r1 = new Rect(4, 5);
		Rect r2 = new Rect(5, 8);
		
		System.out.println("The area of the rectangle is "+r1.area());
		System.out.println("The area of the rectangle is "+r2.area());
	}
}
