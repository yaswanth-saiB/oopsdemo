package oopsdemo2;

//Java program to implement Hierarchical Inheritance
class Doctor{
	int idNumber;
    String name;
    String address;
    
	public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}
	void display() {
        System.out.println("********* Doctor Details ***********");
        System.out.println("The name is :" + name);
        System.out.println("The number is :" + idNumber);
        System.out.println("The address is :" + address);
   }   
}
class Specialist extends Doctor{
	String speciality;
	
	public Specialist(int idNumber, String name, String address,String sp) {
		super(idNumber, name, address);
		this.speciality = sp;
	}
	void display() {
        super.display(); // call base class method
        System.out.println("The speciality is :" + speciality);
        }
}
class NonSpecialist extends Doctor{

	public NonSpecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);
		
	}
	
}
public class TestMethod {
	public static void main(String[] args) {
		//invoke child class Specialist constructor
        Specialist spObj=new Specialist(1001,"Mary","New York","Cardiologist");

        spObj.display(); // invoke child class Specialist display() method

        //invoke child class NonSpecialist constructor
        NonSpecialist nspObj=new NonSpecialist(1005,"John","Sydney");

        nspObj.display();// invoke base class Doctor display() method
	}
}
