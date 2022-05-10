package oopsdemo1;
//Program to add 2 complex numbers
public class Complex {
	double real;
	double imaginary;
	
	// generate constructors using fields
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	void add(Complex obj) // method which accepts object as an argument
    {
       this.real += obj.real;
       this.imaginary += obj.imaginary;
    }

    void display()
    {
        //System.out.println("The Addition of 2 Complex Numbers is :");
        System.out.println("r"+this.real+" + i"+this.imaginary);
    }
	
}
