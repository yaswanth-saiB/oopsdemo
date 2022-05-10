package file.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) {
		
		try { 
            // Creating Writer obj in Append mode -true
            FileWriter writer = new FileWriter("c:/demo/names.txt",true); 
            
            //improves efficiency while writing data
            BufferedWriter bwr = new BufferedWriter(writer);  

            bwr.write("\n");
            bwr.write("yash"); 
            bwr.write("\n"); // bwr.newLine();
            bwr.write("brama"); 
            bwr.close(); 
 
            System.out.println("succesfully written to a file"); } 
            catch (IOException ioe) { 
            ioe.printStackTrace(); 
 
            }

	}

}
