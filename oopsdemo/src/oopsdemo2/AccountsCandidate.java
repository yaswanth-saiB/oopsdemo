package oopsdemo2;

public class AccountsCandidate extends Candidate {
	double perks;
	
	public AccountsCandidate(int id, String name, double salary) {
		super(id, name, salary);
		
	}
	void getPerks() {
		perks = salary*.05;
		System.out.println("Perk of accounts candidate is "+perks);
	}
}
