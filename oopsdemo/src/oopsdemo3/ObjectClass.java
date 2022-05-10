package oopsdemo3;

public class ObjectClass {
	public static void main(String[] args) {
		
		Object oc=new Object();
        System.out.println(oc.hashCode());
        System.out.println(oc.toString());

        System.out.println(oc.getClass());
        Employee e1=new Manager("john",5000,"it","abc");
        System.out.println(e1.getClass());


        Object oc1=new Object();
        System.out.println(oc1.equals(oc));
        System.out.println(oc1.hashCode());
        System.out.println(oc1.toString());
	}
}
