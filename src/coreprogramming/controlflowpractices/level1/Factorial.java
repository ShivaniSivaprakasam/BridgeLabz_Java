/**
 * Program Name: Factorial
 *
 * Description:
 * This program calculates the factorial of a positive non-zero number entered by the user.
 * The program uses a while loop to ensure the input number is valid and another while loop to calculate the factorial.
 *
 * Steps:
 * 1. Input a number from the user.
 * 2. Validate that the number is positive and non-zero.
 * 3. Use a while loop to calculate the factorial of the number.
 * 4. Display the factorial.
 *
 * Concepts Used:
 * - Loops (while loop)
 * - Input validation
 * - Arithmetic operations
 * - Scanner for user input
 */

package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class Factorial {

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
        int i = 1;

        // Calculate factorial using while loop
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }

        // Display factorial
        System.out.println(factorial);
    }
}
