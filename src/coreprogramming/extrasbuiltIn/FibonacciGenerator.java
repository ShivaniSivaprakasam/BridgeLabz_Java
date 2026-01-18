package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class FibonacciGenerator {

    /*
     * This program generates the Fibonacci sequence up to a user-specified number of terms.
     * The Fibonacci sequence is a series where each number is the sum of the two preceding ones:
     * Example: 0, 1, 1, 2, 3, 5, 8, ...
     * The program demonstrates user input, loops, and method usage in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of terms in the Fibonacci sequence
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Validate input: number of terms must be positive
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Print the Fibonacci sequence up to the specified number of terms
            System.out.println("Fibonacci sequence up to " + terms + " terms:");
            printFibonacci(terms);
        }

        // Close the Scanner object to free resources
        scanner.close();
    }

    /**
     * Prints the Fibonacci sequence up to n terms.
     *
     * @param n The number of terms to print
     */
    public static void printFibonacci(int n) {
        // Initialize the first two terms of the Fibonacci sequence
        int first = 0;
        int second = 1;

        // Generate and print the sequence iteratively
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second; // Calculate next term
            first = second;            // Update first term
            second = next;             // Update second term
        }

        // Print a new line at the end
        System.out.println();
    }
}
