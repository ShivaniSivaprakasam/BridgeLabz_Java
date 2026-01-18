package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class SumOfNaturalNumbersWhile {

    public static void main(String[] args) {

        /*
         * This program calculates the sum of the first N natural numbers.
         * The user is prompted to enter a number.
         * If the number is not a natural number (<= 0), the program exits.
         * Otherwise, it calculates the sum using the formula sum = n*(n+1)/2.
         * The program then checks whether the entered number is equal to the sum,
         * using while loops (as per the original logic).
         */

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Checking if the entered number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
            return; // Exit the program if not natural
        }

        int sum = 0;

        // Calculating the sum of the first N natural numbers using formula
        for (int i = 1; i <= number; i++) {
            sum = number * (number + 1) / 2;
        }

        // Displaying the sum
        System.out.println("The sum of " + number + " natural numbers is " + sum + ".");

        // Checking if the number is equal to the sum using while loops
        while (number == sum) {
            System.out.println("The number is equal to the sum of " + number + " numbers");
            break; // Break after printing once
        }

        while (number != sum) {
            System.out.println("The number is not equal to the sum of " + number + " numbers");
            break; // Break after printing once
        }
    }
}

