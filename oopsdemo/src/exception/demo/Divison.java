package exception.demo;

import java.util.Scanner;

public class Divison {

	public static void main(String[] args) {
		 int a, b, result;
         Scanner input = new Scanner(System.in);

          System.out.println("Input two integers");
          a = input.nextInt();
          b = input.nextInt();  // enter 0

         result = a / b;  // Throws SArithmetic exception

         System.out.println("Result = " + result);
         input.close();

	}
}

