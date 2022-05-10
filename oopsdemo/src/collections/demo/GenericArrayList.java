package collections.demo;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<String> strLst = new ArrayList<String>();

		strLst.add("alpha");   // compiler checks if argument is of type String
		strLst.add("beta");

		System.out.println(strLst);

		// Iterate using classic for loop

		for(int i=0;i<strLst.size();i++)
		{
			String str=strLst.get(i);
			System.out.println(str);
		}

		strLst.add("Gama");
		System.out.println(strLst);
		System.out.println(strLst.get(2));

	}
}
