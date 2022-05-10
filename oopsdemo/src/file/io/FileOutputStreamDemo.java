package file.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		String fName = "c:demo/data1.txt";
		try {
			FileOutputStream fos = new FileOutputStream(fName,true);
			String text = "\nIts a barus day";
			
			byte[] myBytes = text.getBytes();
			fos.write(myBytes);
			System.out.println("Data written in binary file");
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
