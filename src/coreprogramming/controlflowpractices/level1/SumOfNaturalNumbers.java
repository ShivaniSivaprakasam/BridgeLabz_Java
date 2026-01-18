/**
 * Program Name: SumOfNaturalNumbers
 *
 * Description:
 * This program calculates the sum of the first N natural numbers,
 * where N is provided by the user. It also checks if the entered
 * number is equal to the calculated sum.
 *
 * Steps:
 * 1. Input a natural number from the user.
 * 2. Validate that the number is positive.
 * 3. Use the formula sum = n*(n+1)/2 to calculate the sum.
 * 4. Display the sum and check the condition.
 *
 * Concepts Used:
 * - Loops (for loop)
 * - Conditional statements (if-else)
 * - Arithmetic operations
 * - Scanner for user input
 */
package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        // Creating Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // Getting number input from user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Checking if the entered number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
            return; // Exit the program if not natural
        }

        int sum = 0;

        // Using formula to get the sum of first N natural numbers
        for (int i = 1; i <= number; i++) {
            sum = number * (number + 1) / 2;
        }

        // Displaying the sum
        System.out.println("The sum of " + number + " natural numbers is " + sum + ".");

        // Checking if the number is equal to its sum
        if (number == sum) {
            System.out.println("The number is equal to the sum of " + number + " numbers");
        } else {
            System.out.println("The number is not equal to the sum of " + number + " numbers");
        }
    }
}
