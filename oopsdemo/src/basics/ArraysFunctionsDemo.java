package basics;

import java.util.Arrays;

//* Program to demonstrate various in-built Array Functions*
public class ArraysFunctionsDemo {
	public static void main(String[] args) {
		int[] n1= {2,3,4,12,12,-2};
	    int[] n3=new int[5];
	    int[] n2=new int[n1.length];
	    
	    System.out.println("Display Array contents without Loop:");
	    System.out.println("n1 = "+Arrays.toString(n1));
	    
	    System.out.println("Display Array contents with Enhanced For Loop:");

        for(int i:n1)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        
        System.arraycopy(n1, 0, n2, 0, n1.length);

        // convert array to string and print
        System.out.println("n2 = "+Arrays.toString(n2));

        // Copy partial array contents
        System.arraycopy(n1, 2, n3, 1, 4);
        System.out.println("n3 = "+Arrays.toString(n3));
        
     // sort an Array
        Arrays.sort(n2);
        System.out.println("Sorted n2 Array:"+Arrays.toString(n2));

        n2[1]=77;
        n2[5]=100;
        System.out.println("Sorted n2 Array:"+Arrays.toString(n2));
	}
	
}
