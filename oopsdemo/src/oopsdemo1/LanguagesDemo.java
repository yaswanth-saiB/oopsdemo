package oopsdemo1;
// program to demonstrate constructors in java
class Language{
	private String s;
	private int version;
	
	Language(){//implicit constructor
		System.out.println("I am a implicit Constructor");
		s = "python";
		System.out.println("Hello from "+s);
	}
	Language(String l){//parameterized constructor
		System.out.println("I am a parameterized constructor");
		this.s = l;
		System.out.println("Hello from "+l);
	}
	Language(String s,int version){
		System.out.println("I am a parameterized constructor with two arguments");
		this.version = version;
		this.s = s;
		System.out.println("hello in "+s+" with version"+version);
	}
}

public class LanguagesDemo {
	public static void main(String[] args) {
		Language l1 = new Language();
		Language l2 = new Language("yash");
		Language l3 = new Language("Sai");
		Language l4 = new Language();
		Language l5 = new Language("java",20);
	}
}
