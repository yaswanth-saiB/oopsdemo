package file.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			 
            BufferedOutputStream stream = new BufferedOutputStream(

               new FileOutputStream("c:demo/textfile.txt"));

               stream.write("Hello, World!".getBytes());
               stream.write(System.lineSeparator().getBytes());
               stream.write("I am writting into a file using BufferedOutputStream".getBytes());
               stream.write(System.lineSeparator().getBytes());
               stream.close();
               System.out.println("Data written");

           } catch (IOException ex) {

               ex.printStackTrace();

           }

	}

}
