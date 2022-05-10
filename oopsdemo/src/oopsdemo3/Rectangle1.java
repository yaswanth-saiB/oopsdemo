package oopsdemo3;

// Rectangle class is implementing shape interfaces
public class Rectangle1 implements IShape {

	private double width;
    private double height;
    
    
	public Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");

	}

	@Override
	public double getArea() {
		
		return this.height*this.width;
	}

}
