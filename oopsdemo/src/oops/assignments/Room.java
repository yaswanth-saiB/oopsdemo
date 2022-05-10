package oops.assignments;

import java.util.Scanner;

public class Room {
	private int roomNo;
	private String roomType;
	float area;
	boolean isAcMachine;
	Scanner sc = new Scanner(System.in);
	
	public void setData() {
		System.out.println(">>>>>>>>>>>Enter Room details<<<<<<<<<<<");
		System.out.println("Enter the room number");
		roomNo = sc.nextInt();
		System.out.println("Enter the room type");
		roomType = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the area of the room in square meters");
		area = sc.nextFloat();
		System.out.println("Is the room have a Ac machine");
		isAcMachine = sc.nextBoolean();
		System.out.println("...........................................");
			
		}
	public void displayData() {
		System.out.println(">>>>>>>>>>>Room Details<<<<<<<<<<<");
		System.out.println("Given Room number is "+roomNo);
		System.out.println("Room type is "+roomType);
		System.out.println("Room area is "+area);
		System.out.println("Does the room have AC machine "+isAcMachine);
		System.out.println("********************************************");
		
	}
}
