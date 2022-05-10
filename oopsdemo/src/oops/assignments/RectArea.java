package oops.assignments;

public class RectArea {
	float length,breadth;

	public RectArea(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	float area() {
		float a = this.breadth*this.length;
		return a;
	}float perimeter(){
		float p = 2*(this.length+this.breadth);
		return p;
	}
	
}
