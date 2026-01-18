package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class PowerWhile {

    /*
     * This program calculates the power of a number using a while loop.
     * Steps:
     * 1. Take user input for a base number and exponent (power).
     * 2. Validate that the base number is positive.
     * 3. Use a while loop to multiply the base number by itself 'power' times.
     * 4. Display the final result.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Scanner for user input

        // Get base number
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // Get exponent
        System.out.print("Enter a power: ");
        int power = scan.nextInt();

        // Validate base number to ensure it's positive
        while (number < 0) {
            System.out.print("Enter a positive number: ");
            number = scan.nextInt();
        }

        int result = 1;
        int counter = 0;

        // Loop to calculate power using while
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Display result
        System.out.println(number + " raised to the power " + power + " is: " + result);

    }
}
