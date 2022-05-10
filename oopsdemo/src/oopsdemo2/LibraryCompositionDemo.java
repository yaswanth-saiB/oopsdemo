package oopsdemo2;

import java.util.ArrayList;
import java.util.List;

public class LibraryCompositionDemo {

	public static void main(String[] args) {
		Book b1 = new Book("Fluid mechanics", "Raju");
		Book b2 = new Book("Thermal", "PK nag");
		Book b3 = new Book("Heat Transfer", "Vinay");
		
		// creating the list which contains th no of books
		List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        
        Library lib = new Library(books);
        List<Book> bks = lib.getBooks();
        for(Book bk : bks){
  
            System.out.println("Title : " + bk.title + " and "
            +" Author : " + bk.author);
    }
	}

}
