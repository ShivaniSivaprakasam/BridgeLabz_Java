/**
 * Program Name: DivisibilityCheck
 *
 * Description:
 * This program checks if a number entered by the user is divisible by 5.
 * It displays a message indicating whether the number is divisible or not.
 *
 * Steps:
 * 1. Input a number from the user.
 * 2. Use the modulus operator (%) to check divisibility by 5.
 * 3. Display appropriate message based on the check.
 *
 * Concepts Used:
 * - Conditional statements (if-else)
 * - Modulus operator for divisibility
 * - Scanner for user input
 */

package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class DivisibilityCheck {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
    }
}

