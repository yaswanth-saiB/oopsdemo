package exception.demo;

public class ThrowsDemo {

	void division() throws ArithmeticException{
		int a = 45,b=0,rs;
		rs = a/b;
		System.out.println("\n\tThe result is : "+rs);
	}
	public static void main(String[] args) {
		ThrowsDemo T = new ThrowsDemo();
        try
        {
            T.division();
        }
        catch(ArithmeticException Ex)
        {
            System.err.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");

	}

}
