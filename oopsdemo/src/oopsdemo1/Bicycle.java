package oopsdemo1;

public class Bicycle {
	int gear;

    void applyBrake()
    {
        System.out.println("Applying Brakes.... ");
    }

    public void startCycling()
    {
        gear=gear+1;
        System.out.println("Cycling in Gear No :"+gear);
    }
    public static void main(String[] args) {
		Bicycle sportsBicycle = new Bicycle();
		
		sportsBicycle.startCycling();
		sportsBicycle.startCycling();
		
		sportsBicycle.applyBrake();
	}
}
