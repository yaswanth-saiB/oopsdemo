package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Trainee t1 = new Marks("Yash","India",1001,35);
		
		t1.show();
		double marks = t1.calculateMarks();
		System.out.println(t1+" "+marks);

	}

}
