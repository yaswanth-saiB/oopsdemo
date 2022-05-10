package oopsdemo3;
class SofwareEngineer{
	protected String name,tech;
    protected double salary;
    
	public SofwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
    final void display() {
    	System.out.println(name+" "+tech+" "+salary);
    }
    void work() {
    	System.out.println("Coding and testing");
    }
}
class Developer extends SofwareEngineer{

	public Developer(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}void work(){//overridden method
		System.out.println("Coding using"+tech);
	}
	
}
class Tester extends SofwareEngineer{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}void work(){//overridden method
		System.out.println("Testing using"+tech);
	}
	
}
public class OverrideDemo {
	public static void main(String[] args) {
		Developer d1 = new Developer("Yaswanth", "Java", 150000);
		Tester t1 = new Tester("Bharath", "Jmeter", 120000);
		
		d1.display();
		d1.work();
		
		t1.display();
		t1.work();
	}
}
