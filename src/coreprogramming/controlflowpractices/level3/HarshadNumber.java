package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class HarshadNumber {

    /*
     * This program checks whether a given number is a Harshad (Niven) number.
     * A Harshad number is an integer that is divisible by the sum of its digits.
     * Example: 18 → 1 + 8 = 9, and 18 % 9 == 0, so 18 is a Harshad number.
     * The program demonstrates user input, loops, arithmetic operations, and conditional statements in Java.
     */

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter number: ");
        int N = input.nextInt();

        // Store the original number for later comparison
        int original = N;

        // Initialize sum variable to store the sum of digits
        int sum = 0;

        // Loop through each digit of the number
        while (N > 0) {
            // Extract the last digit of the number
            int digit = N % 10;

            // Add the digit to sum
            sum += digit;

            // Remove the last digit from the number
            N = N / 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (original % sum == 0) {
            System.out.println("The given number is a Harshad number");
        } else {
            System.out.println("The given number is not a Harshad number");
        }
    }
}
