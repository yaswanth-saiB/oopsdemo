package exception.demo;

public class CheckingAccount {
	private double balance;
    private int number;
    
	public CheckingAccount(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
    
	public void deposit(double amount) {
        balance += amount;
     }
  // method may throw user defined exception - InSufficientFundsException
  public void withdraw(double amount) throws InsufficientFunds{
        if(amount <= balance) {
           balance -= amount;
        }else {
           double needs = amount - balance;
           throw new InsufficientFunds(needs);
        }
     }
}
