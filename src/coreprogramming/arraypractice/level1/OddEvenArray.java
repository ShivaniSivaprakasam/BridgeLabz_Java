/**
 * Program Name: OddEvenArray
 *
 * Description:
 * This program accepts a natural number from the user and separates
 * all numbers from 1 to the entered number into two arrays:
 * one for odd numbers and one for even numbers.
 *
 * The program validates the input, stores values accordingly,
 * and then displays the odd and even numbers separately.
 *
 * Concepts Used:
 * - Arrays
 * - for loop
 * - Conditional statements
 * - User input using Scanner
 */

package coreprogramming.arraypractice.level1;

import java.util.Scanner;

public class OddEvenArray {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a natural number
        System.out.print("Enter a natural number: ");

        // Reading the number entered by the user
        int number = input.nextInt();

        // Validating the input to ensure it is a natural number
        if (number <= 0) {

            // Displaying error message for invalid input
            System.out.println("Error: Please enter a natural number.");

            // Terminating the program execution
            return;
        }

        // Declaring array to store even numbers
        int[] even = new int[number / 2 + 1];

        // Declaring array to store odd numbers
        int[] odd = new int[number / 2 + 1];

        // Index to track the position in the even array
        int evenIndex = 0;

        // Index to track the position in the odd array
        int oddIndex = 0;

        // Loop to separate numbers into even and odd arrays
        for (int i = 1; i <= number; i++) {

            // Checking if the current number is even
            if (i % 2 == 0) {

                // Storing even number in the even array
                even[evenIndex] = i;

                // Incrementing even array index
                evenIndex++;
            }
            else {

                // Storing odd number in the odd array
                odd[oddIndex] = i;

                // Incrementing odd array index
                oddIndex++;
            }
        }

        // Displaying all odd numbers
        System.out.println("\nOdd numbers:");

        // Loop to print odd numbers from the array
        for (int i = 0; i < oddIndex; i++) {

            // Printing odd number
            System.out.print(odd[i] + " ");
        }

        // Displaying all even numbers
        System.out.println("\n\nEven numbers:");

        // Loop to print even numbers from the array
        for (int i = 0; i < evenIndex; i++) {

            // Printing even number
            System.out.print(even[i] + " ");
        }
    }
}
