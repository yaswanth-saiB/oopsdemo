package collections.demo;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		/* Linked List Declaration */
	       LinkedList<String> linkedlist = new LinkedList<String>();

	       /*add(String Element) is used for adding 
	        * the elements to the linked list*/
	       linkedlist.add("Item1");
	       linkedlist.add("Item5");
	       linkedlist.add("Item3");
	       linkedlist.add("Item6");
	       linkedlist.add("Item2");

	       /*Display Linked List Content*/
	       System.out.println("Linked List Content: " +linkedlist);
	       
		linkedlist.offer("Item100");
		System.out.println("Linked List Content: " +linkedlist);
	       /*Add First and Last Element*/
	       linkedlist.addFirst("First Item");
	       linkedlist.addLast("Last Item");
	       System.out.println("LinkedList Content after addition: " +linkedlist);/* Linked List Declaration */
	       LinkedList<String> linkedlist1 = new LinkedList<String>();

	       /*add(String Element) is used for adding 
	        * the elements to the linked list*/
	       linkedlist1.add("Item1");
	       linkedlist1.add("Item5");
	       linkedlist1.add("Item3");
	       linkedlist1.add("Item6");
	       linkedlist1.add("Item2");

	       /*Display Linked List Content*/
	       System.out.println("Linked List Content: " +linkedlist1);
	       
		linkedlist1.offer("Item100");
		System.out.println("Linked List Content: " +linkedlist1);
	       /*Add First and Last Element*/
	       linkedlist1.addFirst("First Item");
	       linkedlist1.addLast("Last Item");
	       System.out.println("LinkedList Content after addition: " +linkedlist1);

	       /*This is how to get and set Values*/
	       Object firstvar = linkedlist1.get(0);
	       System.out.println("First element: " +firstvar);
	       linkedlist1.set(0, "Changed first item");
	       Object firstvar2 = linkedlist1.get(0);
	       String s=linkedlist1.get(0);// Auto unboxing
	       System.out.println("First element after update by set method: " +firstvar2);
	       System.out.println("Hi "+s);
	       
	       /*Remove first and last element*/
	       linkedlist1.removeFirst();
	       linkedlist1.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +linkedlist1);

	       /* Add to a Position and remove from a position*/
	       linkedlist1.add(0, "Newly added item");
	       linkedlist1.remove(2);
	       System.out.println("Final Content: " +linkedlist1);

	       /*This is how to get and set Values*/
	       Object firstvar1 = linkedlist1.get(0);
	       System.out.println("First element: " +firstvar1);
	       linkedlist1.set(0, "Changed first item");
	       Object firstvar21 = linkedlist1.get(0);
	       String s1=linkedlist1.get(0);// Auto unboxing
	       System.out.println("First element after update by set method: " +firstvar21);
	       System.out.println("Hi "+s1);
	       
	       /*Remove first and last element*/
	       linkedlist1.removeFirst();
	       linkedlist1.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +linkedlist1);

	       /* Add to a Position and remove from a position*/
	       linkedlist1.add(0, "Newly added item");
	       linkedlist1.remove(2);
	       System.out.println("Final Content: " +linkedlist1);


	}

}
