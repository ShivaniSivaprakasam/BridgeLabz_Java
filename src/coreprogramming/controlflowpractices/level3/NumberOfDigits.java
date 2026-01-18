package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class NumberOfDigits {

    /*
     * This program calculates the number of digits in a given integer.
     * It reads a number from the user and counts how many digits it contains.
     * This program demonstrates user input, loops, and arithmetic operations in Java.
     */

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int N = input.nextInt();

        // Initialize count to store the number of digits
        int count = 0;

        // Loop until the number becomes 0
        while (N != 0) {
            // Remove the last digit from the number
            N = N / 10;

            // Increment the digit count
            count++;
        }

        // Print the number of digits
        System.out.println("Number of digits: " + count);
    }
}
