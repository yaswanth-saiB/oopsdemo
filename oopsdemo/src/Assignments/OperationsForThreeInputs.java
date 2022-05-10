package Assignments;

import java.util.Scanner;

public class OperationsForThreeInputs {
	public static void main(String[] args) {
		int number1,number2,number3,sum,product,maxValue,minValue;
		float average;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three integers");
		System.out.print("Integer1 :");
		number1 = sc.nextInt();
		System.out.println();
		
		System.out.print("Integer2 :");
		number2 = sc.nextInt();
		System.out.println();
		
		System.out.print("Integer3 :");
		number3 = sc.nextInt();
		
		sum = number1+number2+number3;
		product = number1*number2*number3;
		average = (float)(number1+number2+number3)/3;
		int maxIn1_2 = Math.max(number1, number2);
		maxValue = Math.max(maxIn1_2, number3);
		int min1_2 = Math.min(number1, number2);
		minValue = Math.min(min1_2, number3);
		
		System.out.println("The sum of "+number1+", "+number2+" and "+number3+" is "+sum);
		System.out.println("The product of "+number1+", "+number2+" and "+number3+" is "+product);
		System.out.println("The average of "+number1+", "+number2+" and "+number3+" is "+average);
		System.out.println("The maximum of "+number1+", "+number2+" and "+number3+" is "+maxValue);
		System.out.println("The minimum of "+number1+", "+number2+" and "+number3+" is "+minValue);
	}
}
