package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        /*
         * This program calculates the sum of the first N natural numbers.
         * The user is prompted to enter a number.
         * If the entered number is not a natural number (less than or equal to 0),
         * the program will display an error message and exit.
         * Otherwise, it calculates the sum using the formula sum = n * (n + 1) / 2.
         * Finally, it prints the sum of the numbers.
         */

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Condition to check if the number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
            return; // Exit the program if input is invalid
        }

        int sum = 0;

        // Calculating the sum of the first N natural numbers using the formula
        for (int i = 1; i <= number; i++) {
            sum = number * (number + 1) / 2;
        }

        // Printing the result
        System.out.println("The sum of " + number + " natural numbers is " + sum + ".");
    }
}
