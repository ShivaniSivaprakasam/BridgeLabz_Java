/**
 * Program Name: RocketLaunch
 *
 * Description:
 * This program simulates a countdown for a rocket launch. It asks the user
 * to enter a starting number greater than 1 and then counts down to 1, 
 * displaying each number. Once the countdown reaches 1, it prints a launch message.
 *
 * Steps:
 * 1. Input a number greater than 1 from the user.
 * 2. Validate the input to ensure it is greater than 1.
 * 3. Use a for loop to count down from the entered number to 1.
 * 4. Display each countdown number.
 * 5. Print "Launch the rocket" after countdown completes.
 *
 * Concepts Used:
 * - Loops (for and while)
 * - Conditional validation
 * - Scanner for user input
 */

package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class RocketLaunch {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Validate input to ensure it is greater than 1
        while (number < 1) {
            System.out.print("Enter a number greater than 1: ");
            number = input.nextInt();
        }

        // Loop to perform countdown from the entered number to 1
        for (int i = number; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }

        // Printing rocket launch message
        System.out.println("Launch the rocket");
    }
}
