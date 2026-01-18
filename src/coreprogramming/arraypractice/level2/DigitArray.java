/**
 * Program Name: DigitArray
 *
 * Description:
 * This program extracts all digits from a given number and stores them
 * in an array. It then finds the largest and second largest digits
 * from the number.
 *
 * Steps:
 * 1. Take a number as input.
 * 2. Extract digits using modulus and division, store them in a dynamic array.
 * 3. Resize the array if more than initial capacity is needed.
 * 4. Loop through the digits to find the largest and second largest.
 * 5. Display the largest and second largest digits.
 *
 * Concepts Used:
 * - Arrays (dynamic resizing)
 * - Loops
 * - Conditional statements
 * - Modulus and division for digit extraction
 * - Input using Scanner
 */
package coreprogramming.arraypractice.level2;

import java.util.Scanner;

public class DigitArray {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting user to enter a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Initial maximum size of the digits array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Index to keep track of number of digits stored
        int index = 0;

        // Loop to extract digits from the number
        while (number != 0) {

            // Check if the array is full, resize if needed
            if (index == maxDigit) {
                maxDigit += 10; // Increase size by 10
                int[] temp = new int[maxDigit];

                // Copy old digits to the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the resized array to digits
                digits = temp;
            }

            // Extract the last digit and store in array
            digits[index] = number % 10;

            // Remove the last digit from the number
            number = number / 10;

            // Increment index
            index++;
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through all digits to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i];     // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest if unique
            }
        }

        // Display the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the scanner object
        input.close();
    }
}
