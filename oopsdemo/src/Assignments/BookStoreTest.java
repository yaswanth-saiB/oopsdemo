package Assignments;

public class BookStoreTest {
	public static void main(String[] args) {
		BookStore book1 = new BookStore();
		BookStore book2 = new BookStore();
		BookStore book3 = new BookStore();
		
		book1.setBookDetails();
		book1.showBookDetails();
		
		book2.setBookDetails();
		book2.showBookDetails();
		
		book3.setBookDetails();
		book3.showBookDetails();
	}
}
