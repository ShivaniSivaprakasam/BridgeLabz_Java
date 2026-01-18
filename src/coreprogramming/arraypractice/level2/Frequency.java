/**
 * Program Name: Frequency
 *
 * Description:
 * This program calculates the frequency of each digit (0-9) in a given number.
 *
 * Steps:
 * 1. Input a number from the user.
 * 2. Count the number of digits in the number.
 * 3. Store each digit in an array.
 * 4. Create a frequency array of size 10 (for digits 0-9).
 * 5. Loop through the digits array and increment the corresponding frequency.
 * 6. Display the frequency of each digit that occurs at least once.
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

public class Frequency {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Temporary variable to count digits
        int temp = number;
        int count = 0;

        // Handle special case when number is 0
        if (temp == 0) {
            count = 1;
        } else {
            // Count the number of digits
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        // Array to store digits of the number
        int[] digits = new int[count];
        temp = number;

        // Extract digits and store in array from right to left
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Frequency array for digits 0-9
        int[] frequency = new int[10];

        // Calculate frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of digits
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        // Close the scanner object
        input.close();
    }
}
