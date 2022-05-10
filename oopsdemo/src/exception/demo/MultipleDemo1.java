package exception.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleDemo1 {
	
	public static void main(String[] args) throws IOException{
		try {
			
			BufferedReader br =
	                 new BufferedReader (new InputStreamReader (System.in));
	                int a, b, c;
	                System.out.println ("Enter Any 2 Numbers");
	                a = Integer.parseInt (br.readLine ());
	                b = Integer.parseInt (br.readLine ());

	                c = a / b;
	                System.out.println ("C VALUE = " + c);
	                
	            }
		
	            catch (NumberFormatException nfe)
	            {
	              System.out.println ("please pass only integer values");
	            }
	            catch (ArithmeticException ae)
	            {
	              System.out.println ("please dont pass the second value as 0");
	            }
	}
}
