package practice.core.java;


public class FordTruck implements Truck{

	private int noOfAxles;
	private int totalWeightOfTruck;
	
	
	public FordTruck(int noOfAxles, int totalWeightOfTruck) {
		this.noOfAxles = noOfAxles;
		this.totalWeightOfTruck = totalWeightOfTruck;
		
		
	}
	public int getNoOfAxles() {
		return this.noOfAxles;
	}
	public int getTotalWeightOfTruck() {
		return this.totalWeightOfTruck;
	}
	
	@Override
	public int noOfAxels() {
		
		return this.noOfAxles;
	}
	@Override
	public int totalTruckWeight() {
		
		return this.totalWeightOfTruck;
	}
	
	
}
