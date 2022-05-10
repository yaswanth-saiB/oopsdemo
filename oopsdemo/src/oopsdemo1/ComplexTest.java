package oopsdemo1;

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 = new Complex(10.3, 67.4);
		Complex c2 = new Complex(0.7,3.6);
		
		c1.add(c2);//calls method add() by passing obj2
		System.out.println("The addition of 2 complex numbers is ");
		c1.display();
	}
}
