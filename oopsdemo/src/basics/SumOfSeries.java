package basics;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		int limit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit ");
		limit = sc.nextInt();
		int i = 1,sum = 0;
		sc.close();
		
		while(i<=limit) {
			sum += i;
			i++;
		}System.out.println("The sum of series of numbers upto "+limit+" is "+sum);
	}
}
