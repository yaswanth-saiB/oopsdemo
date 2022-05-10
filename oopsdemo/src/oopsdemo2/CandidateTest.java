package oopsdemo2;

public class CandidateTest {

	public static void main(String[] args) {
		System.out.println(">>>>>>>>>>candidate details<<<<<<<<<<<");
		
		JavaCandidate jc1 = new JavaCandidate(101, "Yaswanth", 35000, "java");
		jc1.display();
		jc1.getPerks();
		
		AccountsCandidate ac1 = new AccountsCandidate(102, "Sudhakar", 25000);
		ac1.display();
		ac1.getPerks();

	}

}
