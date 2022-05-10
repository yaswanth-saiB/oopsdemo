
public class SavingsAccountTest {

	public static void main(String[] args) {
		
		SavingsAcccount s1 = new SavingsAcccount();
		
		s1.withdraw(5000);
		s1.calculateInterest();
		
		System.out.println("----------------------------------------------");
		SavingsAcccount s2 = new SavingsAcccount(50000, 2, 99999999);
		
		s2.withdraw(10000);
		s2.calculateInterest();
	}

}
