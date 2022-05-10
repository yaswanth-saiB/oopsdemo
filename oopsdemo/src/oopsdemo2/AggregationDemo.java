package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		Address ad1 = new Address("Anantapur", "Andhra", "India", 515001);
		
		Student s1 = new Student(360, "Yaswanth", ad1);
		s1.display();

	}

}
