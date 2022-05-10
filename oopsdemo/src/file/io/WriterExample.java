package file.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Writer class used to write String/text data into a text file
public class WriterExample {

	public static void main(String[] args) {
		
		try {
			Writer w = new FileWriter("c:demo/data.txt");
			 String content = "She sells sea shells in the sea yash";
			 
			 w.write(content);
			 w.close();
			 
			 System.out.println("Data written to a file");
			 
		}catch(IOException e){
			System.err.println("Error occured");
			e.printStackTrace();
			
		}
	}

}
