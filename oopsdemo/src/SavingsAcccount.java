import java.util.Scanner;

public class SavingsAcccount {
	double balance;
	int interestRate;
	int accountNo;
	
	Scanner sc = new Scanner(System.in);
	
	public SavingsAcccount() {
		System.out.print("Enter your account number ");
		accountNo = sc.nextInt();
		
		System.out.print("rate of interest ");
		interestRate = sc.nextInt();
		
		System.out.print("Balance ");
		balance = sc.nextDouble();
	}



	public SavingsAcccount(double balance, int interestRate, int accountNo) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}



	public double getbalance() {
		return balance;
	}



	public int getinterestRate() {
		return interestRate;
	}



	public int getAccountNo() {
		return accountNo;
	}

		void withdraw(double amount) {
			if (amount > balance)
				System.out.println("Error");
			else {
				balance -= amount;
				System.out.println("Sucessfully withdrawn "+amount);
			}
		}
		void calculateInterest() {
			System.out.println("simple interest for one year is");
			double simpleInterest = (balance*interestRate*1)/100;
			System.out.print(simpleInterest);
		}
	
}
