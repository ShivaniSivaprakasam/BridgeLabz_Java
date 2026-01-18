package objectorientedprogramming.classobjects.level2;
/*
This program simulates a movie ticket booking system.
It allows a user to:
1. Enter a movie name.
2. Book a ticket by providing seat number and price.
3. Display the booked ticket details.
The MovieTicket class stores ticket information and BookingSystem handles user interaction.
*/

import java.util.Scanner;
// Created a class called movie ticket
class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }
    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicketDetails() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : " + price);
    }
}
// Created a main class called booking system
public class BookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = input.nextLine();

        System.out.print("Enter seat number: ");
        int seatNumber = input.nextInt();

        System.out.print("Enter ticket price: ");
        double price = input.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName);
        ticket.bookTicket(seatNumber, price);
        // Calling method
        ticket.displayTicketDetails();
    }
}

