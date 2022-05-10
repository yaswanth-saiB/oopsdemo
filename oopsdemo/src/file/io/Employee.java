package file.io;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public String name;
    public String address;
    public transient int SSN;//will not be serialized
    public int number;
 
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
