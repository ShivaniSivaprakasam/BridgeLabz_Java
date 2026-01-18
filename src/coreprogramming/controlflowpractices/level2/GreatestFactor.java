package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class GreatestFactor {

    /*
     * This program finds the greatest factor of a number other than itself.
     * Steps:
     * 1. Take a positive integer input from the user.
     * 2. Loop from number-1 down to 1 to find the largest factor.
     * 3. Print the greatest factor found.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner for user input

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int greatestFactor = 1; // Initialize greatest factor

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if i is a factor
                greatestFactor = i; // Update greatest factor
                break; // Stop loop once the first (largest) factor is found
            }
        }

        // Display the result
        System.out.println("Greatest factor: " + greatestFactor);

        input.close(); // Close scanner
    }
}
