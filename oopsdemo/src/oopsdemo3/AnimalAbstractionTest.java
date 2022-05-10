package oopsdemo3;
abstract class Animal{
	public void eat() {
		System.out.println("I can eat");
	}abstract void makeSound();//abstract method - without body 
}
class Dog extends Animal{

	@Override
	void makeSound() {
		System.out.println("Bark Bark");
		
	}
	
}
class Cat extends Animal{

	@Override
	void makeSound() {
		System.out.println("Meow meow");
		
	}
	
}
public class AnimalAbstractionTest {

	public static void main(String[] args) {
		
		// compile error-cannot create instance of Abstract class
		//Animal a = new Animal();
		
		Dog d1 = new Dog();
		d1.eat();
		d1.makeSound();
		
		Cat c1 = new Cat();
		c1.eat();
		c1.makeSound();

	}

}
