/**
 * Program Name: Integers
 *
 * Description:
 * This program reads an integer input from the user and determines whether
 * the number is positive, negative, or zero. It then displays the result.
 *
 * Steps:
 * 1. Input an integer from the user.
 * 2. Use if-else statements to determine the sign of the number.
 * 3. Display whether the number is Positive, Negative, or Zero.
 *
 * Concepts Used:
 * - Conditional statements (if-else)
 * - Scanner for user input
 */

package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class Integers {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting integer input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Determine the sign of the number
        if (number > 0) {
            System.out.println("Positive.");
        } else if (number < 0) {
            System.out.println("Negative.");
        } else {
            System.out.println("Zero.");
        }
    }
}
