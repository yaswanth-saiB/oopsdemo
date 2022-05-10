package Assignments;

import java.util.Scanner;

public class CheckMultiples {

	public static void main(String[] args) {
	int number1,number2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two integers");
	
	System.out.print("Integer1 ");
	number1  = sc.nextInt();
	System.out.println();
	
	System.out.println("Integer2 ");
	number2 = sc.nextInt();
	
	if(number1%number2 == 0) {
		System.out.println("Given integer "+number1+" is a multiple of "+number2);
	}else {
		System.out.println("Given integer "+number1+" is not a multiple of "+number2);
	}
	
	}

}
