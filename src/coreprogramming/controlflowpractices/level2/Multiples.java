package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class Multiples {

    /*
     * This program finds all divisors (factors) of a number entered by the user.
     * Steps:
     * 1. Take a number input less than or equal to 100 from the user.
     * 2. Use a for loop to check divisibility from 1 to 100.
     * 3. Print all numbers that divide the input evenly.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner for user input

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Ensure the number is <= 100
        while (number > 100) {
            System.out.print("Enter a number less than or equal to 100: ");
            number = input.nextInt();
        }

        System.out.println("The divisors of " + number + " are:");

        // Loop to find all divisors
        for (int i = 1; i <= 100; i++) {
            if (number % i == 0) { // Check if i divides the number
                System.out.println(i);
            }
        }
    }
}
