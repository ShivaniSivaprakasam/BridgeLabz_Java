/**
 * Program Name: MultiplicationTable
 *
 * Description:
 * This program reads an integer number from the user and prints its
 * multiplication table for the multiples 6, 7, 8, and 9.
 *
 * Steps:
 * 1. Input a number from the user.
 * 2. Use a for loop to calculate multiples from 6 to 9.
 * 3. Display each result with a descriptive message.
 *
 * Concepts Used:
 * - Loops (for loop)
 * - Arithmetic operations
 * - Scanner for user input
 */
package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store multiplication result
        int table = 0;

        // Loop through 6 to 9 to calculate multiples
        for (int i = 6; i <= 9; i++) {
            table = number * i;
            System.out.println("The multiplication table for the number " + number 
                    + " from 6 to 9 is: " + table);
        }
    }
}
