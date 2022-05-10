package oopsdemo2;

//parent class / base class / super class
class Animal{
	String name; // properties
	
	public void eat() { //method
		System.out.println("I can eat");
	}
}

// Inherits animal class
//child/sub/derived Class
class Dog extends Animal{
	public void display() {
		System.out.println("My name is "+name);
	}
}
public class SingleInheritanceTest {

	public static void main(String[] args) {
		// create and initialize object of sub class
		Dog labrador = new Dog();
		
		//access fields of super class
		labrador.name = "Zebra";
		
		//call method of derived class
		labrador.display();
		
		//call method of super class
		labrador.eat();

	}

}
