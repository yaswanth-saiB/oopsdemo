package exception.demo;

//User defined Exception class
public class InsufficientFunds extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	
	public InsufficientFunds(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
	
	
}
