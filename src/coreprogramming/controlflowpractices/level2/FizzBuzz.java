package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class FizzBuzz {

    /*
     * This program implements the FizzBuzz logic for a single number input by the user.
     * - If the number is divisible by 3 and 5, it prints "FizzBuzz".
     * - If divisible only by 3, it prints "Fizz".
     * - If divisible only by 5, it prints "Buzz".
     * - Otherwise, it reports whether the number is positive, negative, or zero.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object to get user input

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {

            // Check divisibility conditions
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz"); // Divisible by both 3 and 5
            } else if (number % 3 == 0) {
                System.out.println("Fizz"); // Divisible only by 3
            } else if (number % 5 == 0) {
                System.out.println("Buzz"); // Divisible only by 5
            } else {
                System.out.println(number + " is positive."); // Not divisible by 3 or 5
            }

        } else if (number < 0) {
            System.out.println(number + " is negative."); // Negative number

        } else {
            System.out.println(number + " is zero."); // Number is zero
        }
    }
}

