package oopsdemo1;

//main class
public class StudentTest {

	public static void main(String[] args) {
		
		//Creating objects of Student class
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		// invoke methods of Student class using dot operator
		
		s1.inputDetils();
		s2.inputDetils();
		s3.inputDetils();
		
		float tot1 = s1.calculate();
		float tot2 = s2.calculate();
		float tot3 = s3.calculate();
		
		s1.displayDetails();
		System.out.println("Total displayed from main "+tot1);
		s2.displayDetails();
		System.out.println("Total displayed from main "+tot2);
		s3.displayDetails();
		System.out.println("Total displayed from main "+tot3);

	}

}
