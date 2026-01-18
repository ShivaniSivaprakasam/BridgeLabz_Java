/**
 * Program Name: Digits
 *
 * Description:
 * This program extracts digits from a given number, stores them
 * in an array, and finds the largest and second largest digits.
 *
 * Steps:
 * 1. Take a number as input.
 * 2. Extract digits using modulus (%) and division (/), store in an array.
 * 3. The array has a fixed size of 10 digits.
 * 4. Loop through the array to find the largest and second largest digits.
 * 5. Display the results.
 *
 * Concepts Used:
 * - Arrays
 * - Loops
 * - Conditional statements
 * - Modulus and division for digit extraction
 * - Input using Scanner
 */

package coreprogramming.arraypractice.level2;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Maximum size of the array to store digits
        int maxDigit = 10;
        int[] digit = new int[maxDigit];

        // Index to keep track of number of digits stored
        int index = 0;

        // Loop to extract digits from the number
        while (number != 0) {

            // Store the last digit in the array
            digit[index] = number % 10;

            // Remove the last digit from the number
            number = number / 10;

            // Increment index
            index++;

            // Stop if array reaches its maximum size
            if (index == maxDigit) {
                break;
            }
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through the stored digits to find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digit[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digit[i];      // Update largest
            } else if (digit[i] > secondLargest && digit[i] != largest) {
                secondLargest = digit[i]; // Update second largest if unique
            }
        }

        // Display the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
