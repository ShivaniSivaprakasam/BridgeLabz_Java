package coreprogramming.practiceproblems.selfproblem;

import java.util.Scanner;

/**
 * This program calculates the power of a number.
 * It prompts the user to enter a base and an exponent,
 * computes base^exponent using Math.pow, and displays the result.
 */
public class Power {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble(); // Base number

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble(); // Exponent

        double result = Math.pow(base, exponent); // Calculate base^exponent

        System.out.printf("The power of the given number is: %.2f%n", result); // Display result
    }
}
