/**
 * Program Name: CountDown
 *
 * Description:
 * This program takes a number from the user and performs a countdown from that number to 1.
 * It ensures that the input number is greater than 0 before starting the countdown.
 * After reaching 1, it prints a message indicating the launch of a rocket.
 *
 * Steps:
 * 1. Input a number from the user.
 * 2. Validate that the number is greater than 0.
 * 3. Perform a countdown using a while loop.
 * 4. Print each number during the countdown.
 * 5. Display "Launch the rocket" after countdown reaches 0.
 *
 * Concepts Used:
 * - Loops (while loop)
 * - Input validation
 * - Scanner for user input
 * - Decrementing a number
 */

package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class CountDown {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting number input from user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Ensure the number is greater than 0
        while (number < 1) {
            System.out.print("Enter a number greater than 1: ");
            number = input.nextInt();
        }

        // Countdown loop
        while (number >= 1) {
            System.out.println("The countdown: " + number);
            number--; // Decrement the number
        }

        // Printing final message
        System.out.println("Launch the rocket");
    }
}

