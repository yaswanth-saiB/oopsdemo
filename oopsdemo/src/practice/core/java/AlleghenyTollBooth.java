package practice.core.java;

import java.sql.Date;
import java.time.LocalTime;

public class AlleghenyTollBooth implements TollBooth{
	
	
	private int noOfAxeles, totalWeightOfTruck,tollDue;
	private static int totalReciepts,noOfVechilesPassed;
	
	
	
	public AlleghenyTollBooth() {
		
	}

	@Override
	public void displayData() {
		System.out.println(">>>>>>>>Collection details<<<<<<<<<<<");
		System.out.println("Truck arrived");
		System.out.println("Axles = "+this.noOfAxeles+"	Truck weight = "+this.totalWeightOfTruck);
		System.out.println("Toll due = "+this.tollDue);
		
	}

	@Override
	public void resetData() {
		
		LocalTime t=LocalTime.now();
		System.out.println("Total trucks passed till now are "+this.noOfVechilesPassed);
		System.out.println("Total reciepts collected till now are "+this.totalReciepts);
		
		if (t.equals(00)) {
			this.noOfVechilesPassed = 0;
			this.totalReciepts = 0;
		}
		else {
			System.out.println("Data will be resets at 12 Am everyday.");
		}
	}
	
	@Override
	public void calculateToll(int axles, int weight) {
		
			noOfAxeles = axles;
			totalWeightOfTruck = weight;
			tollDue = (5*noOfAxeles)+(10*totalWeightOfTruck)/1000;
			this.totalReciepts += this.tollDue;
			this.noOfVechilesPassed +=1;
	}
}
