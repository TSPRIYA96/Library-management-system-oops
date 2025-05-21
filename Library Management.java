// LibraryManagementSystem
package library;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("1984", "George Orwell");
        EBook ebook1 = new EBook("Java Basics", "James Gosling", "www.javabasics.com/download");

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(ebook1);

        myLibrary.displayBooks();

        book1.issueBook();
        book1.issueBook(); // Try issuing again
        book1.returnBook();
    }
}
