package practice.core.java;

public class TestTollBooth {

	public static void main(String[] args) {
		
		AlleghenyTollBooth nissan = new AlleghenyTollBooth();
		nissan.calculateToll(5, 12000);
		nissan.displayData();
		nissan.resetData();
		
		System.out.println("----------------------------------------------");
		
		AlleghenyTollBooth ford = new AlleghenyTollBooth();
		ford.calculateToll(2, 5000);
		ford.displayData();
		ford.resetData();
		
		System.out.println("----------------------------------------------");
		AlleghenyTollBooth Tata = new AlleghenyTollBooth();
		nissan.calculateToll(6, 17000);
		nissan.displayData();
		nissan.resetData();
		
		System.out.println("----------------------------------------------");
	}

}
