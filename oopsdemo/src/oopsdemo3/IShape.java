package oopsdemo3;

public interface IShape {
	
	//implicitly public, static and final
    public String LABLE="Shape";

    //interface methods are implicitly abstract and public
    void draw();

    double getArea();
}
