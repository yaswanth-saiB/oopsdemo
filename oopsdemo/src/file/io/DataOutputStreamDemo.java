package file.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
�* *
�* Java DataOutputStream class allows an application to write primitive
�* Java data types to the output stream in a machine-independent way.
�*/
public class DataOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		try ( DataOutputStream dout =
                new DataOutputStream(new FileOutputStream("c:/demo/file.dat")) )
            {
                dout.writeDouble(1.1);
                dout.writeInt(55);
                dout.writeBoolean(true);
                dout.writeChar('4');
            }
            catch(FileNotFoundException ex)
            {
                System.out.println("Cannot Open the Output File");
                return;
            }

            // reading the data back using DataInputStream
            try ( DataInputStream din =
                        new DataInputStream(new FileInputStream("c:demo/file.dat")) )
            {
                double a = din.readDouble();
                int b = din.readInt();
                boolean c = din.readBoolean();
                char d=din.readChar();
                System.out.println("Values: " + a + " " + b + " " + c+" " + d);
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Cannot Open the Input File");
                return;
            }

	}

}
