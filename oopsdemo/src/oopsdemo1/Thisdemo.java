package oopsdemo1;

public class Thisdemo {
	int age;
	
	//instance method
	//this keyword is used in instance method to access object
	
	void init(int age) {
		this.age = age;//this keyword refers to the current object which invokes the method
	}
	
	public static void main(String[] args) {
		Thisdemo td1 = new Thisdemo();
		td1.init(20);
		System.out.println("The value of the age is "+td1.age);
		
		
	}
}
