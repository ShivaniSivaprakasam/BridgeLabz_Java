/**
 * Program Name: MultiplicationTable
 *
 * Description:
 * This program generates a multiplication table for a user-entered number.
 * The results of multiplying the number from 1 to 10 are stored in an array.
 * The contents of the array are then displayed using a loop.
 *
 * Concepts Used:
 * - Arrays
 * - for loop
 * - User input using Scanner
 * - Basic arithmetic operations
 */

package coreprogramming.arraypractice.level1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter the number for which the multiplication table array is needed: ");

        // Reading the number entered by the user
        int number = input.nextInt();

        // Declaring an array to store multiplication results from 1 to 10
        int[] multiplicationResult = new int[10];

        // Loop to calculate and store multiplication values in the array
        for (int i = 1; i <= 10; i++) {

            // Storing the multiplication result at index (i - 1)
            multiplicationResult[i - 1] = number * i;
        }

        // Loop to display the multiplication table stored in the array
        for (int i = 1; i <= 10; i++) {

            // Printing each element of the multiplication result array
            System.out.print(multiplicationResult[i - 1] + " ");
        }
    }
}

