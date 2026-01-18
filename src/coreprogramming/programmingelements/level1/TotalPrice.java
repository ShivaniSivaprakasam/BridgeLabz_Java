package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/*
 * This program calculates the total purchase price
 * based on unit price and quantity.
 */
public class TotalPrice {

    public static void main(String[] args) {

        // Taking unit price input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price in INR: ");
        float unitPrice = input.nextFloat();

        // Taking quantity input from the user
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculating total price
        float price = unitPrice * quantity;

        // Displaying the total purchase price
        System.out.println("The total purchase price is INR " + price +
                " if the quantity is " + quantity +
                " and the unit price is INR " + unitPrice);
    }
}
