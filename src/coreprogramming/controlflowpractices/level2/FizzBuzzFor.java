package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class FizzBuzzFor {

    /*
     * This program prints FizzBuzz for numbers from 1 to the number entered by the user.
     * Rules:
     * - If a number is divisible by 3 and 5, print "FizzBuzz".
     * - If divisible only by 3, print "Fizz".
     * - If divisible only by 5, print "Buzz".
     * - Otherwise, print the number itself.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object to get user input

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop through numbers from 1 to 'number'
        int i = 1;
        while (i <= number) {

            // Check divisibility by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // Divisible by both 3 and 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Divisible only by 3
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Divisible only by 5
            } else {
                System.out.println(i); // Not divisible by 3 or 5
            }

            i++; // Increment counter
        }
    }
}
