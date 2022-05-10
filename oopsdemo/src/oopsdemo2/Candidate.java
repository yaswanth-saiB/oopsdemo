package oopsdemo2;
//Hierarchical inheritance
public class Candidate {
	private int id;
    private String name;
    protected double salary;
    
	public Candidate(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
    void display() {
    	System.out.println(">>>>>>>>>>>Candidate details<<<<<<<<<<<<");
    	System.out.println(this.id+" "+this.name+" "+this.salary);
    	
    }
}
