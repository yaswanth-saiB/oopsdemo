package oopsdemo1;
// program to demonstrate the cnstructors
public class Trainee {
	private int id;
	private String name,tech;
	private double stipend;
	
	public Trainee() {
		this.id = 360;
		this.name= "yash";
		this.stipend = 5000;
		this.tech = "java";
		
	}

	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
	void display(){
		System.out.println(">>>>>>>>>>Trainee Details<<<<<<<<<<<");
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
		System.out.println("....................................................");
	}
}
