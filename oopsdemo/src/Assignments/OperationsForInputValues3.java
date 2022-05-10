package Assignments;

import java.util.Scanner;

public class OperationsForInputValues3 {
	public static void main(String[] args) {
		int number2,number1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two integer values");
		System.out.print("Integer1: ");
		number1 = sc.nextInt(); 
		System.out.println();
		System.out.print("Integer2: ");
		number2 = sc.nextInt();
		
		System.out.println("The sum of "+number1+" and "+number2+" is "+(number1+number2));
		System.out.println("The product of "+number1+" and "+number2+" is "+(number1*number2));
		System.out.println("The subratction of "+number1+" and "+number2+" is "+(number1-number2));
		System.out.println("The quotient of "+number1+" and "+number2+" is "+((float)number1/number2));
		
	}

}
