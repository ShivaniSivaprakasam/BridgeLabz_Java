// Single-line comment: Book class with attributes and constructors

/*
This Book class demonstrates:
1. Three attributes: title, author, and price.
2. A default constructor initializing default values.
3. A parameterized constructor allowing custom initialization.
4. A method to display book details.
*/

class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
    }

    // Main method to test constructors
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Book customBook = new Book("The Alchemist", "Paulo Coelho", 12.99);
        customBook.displayDetails();
    }
}
