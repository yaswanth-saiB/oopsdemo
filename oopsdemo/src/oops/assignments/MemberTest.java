package oops.assignments;

public class MemberTest {

	public static void main(String[] args) {
		Employer e1 = new Employer("John", "49-B, las vegas", (byte) 25, 99999999, 150000, "java");
		Manager m1 = new Manager("Mike", "50-B,Sydney", (byte) 28, 88888888, 50000, "Sales");
		
		e1.display();
		m1.display();
	}

}

