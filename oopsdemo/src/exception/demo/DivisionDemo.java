package exception.demo;

import java.util.Scanner;

public class DivisionDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, result;
        System.out.println("Input two integers");
        a = input.nextInt();
        b = input.nextInt();  // enter 0

       result = a / b;  // Throws Arithmetic exception

       System.out.println("Result = " + result);
       input.close();
       try // statements to be monitored which may throw exception
       {
     	  result=a/b;
     	  System.out.println("Result = " + result);
       }
       catch(ArithmeticException e) 
       {
     	System.out.println("Division by Zero Error");
     	System.out.println("Exception Description : "+e.getMessage());
     	System.out.println("Exception Name & description : "+e.toString());

     	e.printStackTrace();
       }
      finally
      {
     	 input.close();
     	 System.out.println("In Finally Block - program excution ended");
      }
      result = a / b;  // Throws Arithmetic exception
     
      System.out.println("Result = " + result);
      input.close();
	}
}
