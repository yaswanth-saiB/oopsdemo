package file.io;

import java.io.BufferedReader;
import java.io.FileReader;

//mark() reset()
public class BufferReaderDemo2 {

	public static void main(String[] args) {
		
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader("c:demo/names.txt");
			br = new BufferedReader(fr);
			
			//check whether InputStream supports mark/reset or not
            if(!br.markSupported()){
                  System.out.println("mark/reset not supported");
                  System.exit(0);
            }
            System.out.println(br.readLine()); // Print -> Line 1
            
            br.mark(0);//marks from here
            System.out.println(br.readLine());//line2
            System.out.println(br.readLine());//line 3
            
            
            br.reset();//come back to line 1
            br.mark(0);//marks from 1
            System.out.println(br.readLine());//line 2
            System.out.println(br.readLine());//line3
            System.out.println(br.readLine());//line4
            
            br.reset();
            System.out.println("-------------------------------");
            System.out.println(br.readLine());
            br.close();
	    }
	        catch(Exception ex)
	        {
	            ex.printStackTrace();
	        }

	}

}
