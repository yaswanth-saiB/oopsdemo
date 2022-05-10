package oopsdemo2;

/* Multi Level Inheritance  
 *  Account  --- > SavingsBank ---> AccountDetails
 */
 
//child class of Savings Bank
public class AccountDetails extends SavingsBank {
	int withdrawl,deposit,finalBalance;
	
	public AccountDetails(int empId, String name, int mb, int b,int w,int d) {
		super(empId, name, mb, b);
		this.withdrawl = w;
		this.deposit = d;
	
	}
	void display()
    {
            super.display(); // invokes savings bank display()method
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalBalance=(balance+deposit)-withdrawl;
            System.out.println("Final Balance:" + finalBalance);
    }
}
