package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class FactorialCalculator {

    /*
     * This program calculates the factorial of a non-negative integer entered by the user.
     * Factorial of n (n!) is the product of all positive integers less than or equal to n.
     * The program demonstrates recursion, methods, user input, and validation in Java.
     * 
     * Example:
     *  5! = 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {
        // Get user input
        int number = getInput();

        // Calculate factorial recursively
        long factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);
    }

    /**
     * Prompts the user to enter a non-negative integer and validates input.
     *
     *  the integer entered by the user
     */
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a non-negative integer
        System.out.print("Enter a non-negative integer to calculate factorial: ");
        int num = scanner.nextInt();

        // Check for negative input and exit if invalid
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers. Exiting.");
            scanner.close();
            System.exit(0);
        }

        // Close the scanner before returning
        scanner.close();
        return num;
    }

    /**
     * Recursively calculates factorial of a number.
     *
     *  n The number to calculate factorial for
     *  Factorial value of n
     */
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * calculateFactorial(n - 1);
        }
    }

    /**
     * Displays the factorial result.
     *
     *  num       The original number
     *  factorial The calculated factorial
     */
    public static void displayResult(int num, long factorial) {
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
