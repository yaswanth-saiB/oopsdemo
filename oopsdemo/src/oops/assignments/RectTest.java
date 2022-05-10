package oops.assignments;

public class RectTest {
	public static void main(String[] args) {
		RectArea r1 = new RectArea(5, 4);
		Square r2 = new Square(4, 4);
		System.out.println("The area of the rectangle is "+r1.area());
		System.out.println("The area of the perimeter is "+r1.perimeter());
		
		System.out.println("The area of the square is "+r2.area());
		System.out.println("The perimeter of the square is "+r2.perimeter());
	}
}
