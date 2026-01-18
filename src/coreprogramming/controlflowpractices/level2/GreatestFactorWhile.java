package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class GreatestFactorWhile {

    /*
     * This program finds the greatest factor of a number (other than itself) using a while loop.
     * Steps:
     * 1. Take a positive integer input from the user.
     * 2. Start checking from number-1 down to 1.
     * 3. The first number that divides the input evenly is the greatest factor.
     * 4. Print the greatest factor.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner for user input

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int greatestFactor = 1; // Initialize greatest factor
        int counter = number - 1; // Start checking from number-1

        // Loop until counter reaches 1
        while (counter >= 1) {
            if (number % counter == 0) { // Check if counter is a factor
                greatestFactor = counter; // Update greatest factor
                break; // Exit loop once the largest factor is found
            }
            counter--; // Decrement counter
        }

        // Display the result
        System.out.println("Greatest factor: " + greatestFactor);
    }
}
