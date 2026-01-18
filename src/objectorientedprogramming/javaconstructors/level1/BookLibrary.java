package objectorientedprogramming.javaconstructors.level1;
package objectorientedprogramming.javaconstructors.level1;
// Single-line comment: Book class for Library Book System

/*
Book class demonstrates:
1. Attributes: title, author, price, availability
2. Default and parameterized constructors
3. Method to borrow a book (changes availability)
4. Method to display book details
*/

class BookLibrary {
    String title;
    String author;
    double price;
    boolean available;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Method to borrow the book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available for borrowing.");
        }
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : $" + price);
        System.out.println("Available  : " + (available ? "Yes" : "No"));
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayBook();

        System.out.println();

        // Using parameterized constructor
        Book myBook = new Book("1984", "George Orwell", 15.99);
        System.out.println("Library Book:");
        myBook.displayBook();

        System.out.println();

        // Borrow the book
        myBook.borrowBook();
        myBook.displayBook();

        System.out.println();

        // Try borrowing again
        myBook.borrowBook();
    }
}
