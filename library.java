// Library
package library;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been added to the library.");
    }

    public void displayBooks() {
        System.out.println("\nAvailable Books in Library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
