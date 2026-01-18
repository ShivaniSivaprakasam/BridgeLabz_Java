/**
 * Program Name: FactorialForLoop
 *
 * Description:
 * This program calculates the factorial of a positive non-zero number entered by the user.
 * It uses a for loop to calculate the factorial, after validating the input.
 *
 * Steps:
 * 1. Input a number from the user.
 * 2. Validate that the number is positive and non-zero using a while loop.
 * 3. Use a for loop to calculate the factorial.
 * 4. Display the factorial.
 *
 * Concepts Used:
 * - Loops (for loop, while loop for input validation)
 * - Input validation
 * - Arithmetic operations
 * - Scanner for user input
 */

package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class FactorialForLoop {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate that number is positive and non-zero
        while (number <= 0) {
            System.out.print("Enter a positive non-zero number: ");
            number = input.nextInt();
        }

        // Initialize factorial variable
        int factorial = 1;

        // Calculate factorial using for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display factorial
        System.out.println(factorial);;
    }
}
