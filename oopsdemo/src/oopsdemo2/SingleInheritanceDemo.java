package oopsdemo2;

public class SingleInheritanceDemo {
	public static void main(String[] args) {
		Developer d1 = new Developer(101,"yash","java");//invokes derived class Constructor
		
		d1.display();//
		d1.display1();
	}
}