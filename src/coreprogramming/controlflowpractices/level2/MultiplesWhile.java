package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class MultiplesWhile {

    /*
     * This program finds all divisors (factors) of a number entered by the user
     * using a while loop.
     * Steps:
     * 1. Take a positive number input less than or equal to 100.
     * 2. Use a while loop to check all numbers less than the input for divisibility.
     * 3. Print all numbers that divide the input evenly.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner for user input

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Input validation: number must be positive and ≤ 100
        while (number < 0 || number > 100) {
            System.out.print("Enter a number less than 100 and positive: ");
            number = input.nextInt();
        }

        System.out.println("The divisors of " + number + " are:");

        int counter = number; // Start from the number itself

        // Loop to find all divisors using while
        while (counter >= 1) { // Include 1 as a factor
            if (number % counter == 0) { // Check divisibility
                System.out.println(counter);
            }
            counter--; // Decrement counter
        }
    }
}
