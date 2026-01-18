package objectorientedprogramming.classobjects.level1;
/*
 * This program demonstrates a simple use of classes and objects in Java.
 * 
 * 1. The Book class stores details about a book: title, author, and price.
 *    It has a constructor, getters, and setters to access and modify these fields.
 *
 * 2. The BookDemo class gets input from the user to create a Book object
 *    and displays its details using the displayDetails method.
 */

import java.util.Scanner;
// Created a book class
class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public double getPrice() {
        return this.price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
// Created a main class called book demo
public class BookDemo {
    public void displayDetails(Book book) {
        System.out.println("Title  : " + book.getTitle());
        System.out.println("Author : " + book.getAuthor());
        System.out.println("Price  : " + book.getPrice());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter book title: ");
        String title = input.nextLine();
        System.out.print("Enter author name: ");
        String author = input.nextLine();
        System.out.print("Enter book price: ");
        double price = input.nextDouble();
        Book book = new Book(title, author, price);
        BookDemo demo = new BookDemo();
        // Calling methid
        demo.displayDetails(book);
    }
}



