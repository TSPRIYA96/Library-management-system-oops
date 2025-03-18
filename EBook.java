// EBook
package library;

public class EBook extends Book {
    private String downloadLink;

    public EBook(String title, String author, String downloadLink) {
        super(title, author);
        this.downloadLink = downloadLink;
    }

    public void displayDownloadLink() {
        System.out.println("Download link for " + title + ": " + downloadLink);
    }
}
