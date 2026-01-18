/**
 * Program Name: CountingNumbers
 *
 * Description:
 * This program calculates the sum of the first N natural numbers entered by the user.
 * It also checks if the input number is equal to the sum of numbers from 1 to that number.
 *
 * Steps:
 * 1. Input a number from the user.
 * 2. Validate that the number is greater than 0.
 * 3. Calculate the sum using the formula: sum = n * (n + 1) / 2.
 * 4. Display the sum.
 * 5. Check if the input number is equal to the sum.
 *    - Display appropriate message based on the check.
 *
 * Concepts Used:
 * - Loops (while loop)
 * - Conditional statements (if-else)
 * - Input validation
 * - Arithmetic operations
 * - Scanner for user input
 */
package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class CountingNumbers {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting number input from user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Input validation: number must be greater than 0
        while (number <= 0) {
            System.out.print("Enter a number greater than zero: ");
            number = input.nextInt();
        }

        int sum = 0;

        // Calculate sum of first N natural numbers using formula
        while (number > 0) {
            sum = number * (number + 1) / 2;
            break; // exit loop after calculation
        }

        // Display the sum
        System.out.println("The sum of " + number + " numbers is: " + sum + ".");

        // Check if the number is equal to the sum
        if (number == sum) {
            System.out.println("The number is equal to the sum of " + number + " numbers");
        } else {
            System.out.println("The number is not equal to the sum of " + number + " numbers");
        }
    }
}

