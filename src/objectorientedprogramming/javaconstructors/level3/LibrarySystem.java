package objectorientedprogramming.javaconstructors.level3;
// Single-line comment: Book and EBook demonstration

/*
Book Library System:
1. Book class with:
   - public ISBN
   - protected title
   - private author
2. Public methods to set/get author
3. EBook subclass demonstrates access to public and protected members
*/

class Book {
    public String ISBN;       // Public: accessible anywhere
    protected String title;   // Protected: accessible in subclass
    private String author;    // Private: accessible only in this class

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

// Subclass demonstrating access to public and protected members
class EBook extends Book {
    private double fileSize; // in MB

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display ebook details
    public void displayEBookDetails() {
        System.out.println("\n--- EBook Details ---");
        System.out.println("ISBN      : " + ISBN);      // public
        System.out.println("Title     : " + title);     // protected
        System.out.println("Author    : " + getAuthor()); // via public getter
        System.out.println("File Size : " + fileSize + " MB");
    }
}

// Main class to test
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating Book object
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayBookDetails();

        // Updating author using setter
        b1.setAuthor("J. Bloch");
        b1.displayBookDetails();

        // Creating EBook object
        EBook eb1 = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.2);
        eb1.displayEBookDetails();
    }
}
