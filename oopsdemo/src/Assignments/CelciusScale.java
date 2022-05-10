package Assignments;

import java.util.Scanner;

public class CelciusScale {

	public static void main(String[] args) {
		float fahrenheit,celcius;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature value in Fahrenheit degree: ");
		fahrenheit  = sc.nextFloat();
		celcius = ((fahrenheit-32)*5)/9;
		System.out.println(celcius);
		System.out.format("Conversion of temperature from Fahrenheit "
				+ "to Celcius degree is %.3f",celcius);
		sc.close();

	}

}
