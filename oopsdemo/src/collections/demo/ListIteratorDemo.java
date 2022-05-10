package collections.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Program to traverse list in forward & backward direction
//using ListIterator
public class ListIteratorDemo {

	public static void main(String[] args) {
	
		// Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();

        // Add elements to LinkedList
        linkedlist.add("Delhi");
        linkedlist.add("Agra");
        linkedlist.add("Mysore");
        linkedlist.add("Chennai");
        linkedlist.add("Pune");

        // Obtaining ListIterator
        ListIterator<String> listIt = linkedlist.listIterator();

        // Iterating the list in forward direction
        System.out.println("Forward iteration:");
        while(listIt.hasNext()){
           System.out.println(listIt.next());
        }
 
        // Iterating the list in backward direction
        System.out.println("\nBackward iteration:");
        while(listIt.hasPrevious()){
           System.out.println(listIt.previous());
        }
        
        System.out.println("------------SouthCities----------------");
        System.out.println("Using sublist() method to extract data from list");
        
       List<String> sCties =linkedlist.subList(2, 4);
       System.out.println(sCties);
	}
}