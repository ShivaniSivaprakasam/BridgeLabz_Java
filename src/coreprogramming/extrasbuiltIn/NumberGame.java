package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class NumberGame {

    /*
     * This program plays a number guessing game using a binary search strategy.
     * The user thinks of a number between 1 and 100, and the program attempts to guess it.
     * After each guess, the user provides feedback:
     *  - "high" if the guess is too high
     *  - "low" if the guess is too low
     *  - "correct" if the guess is correct
     * 
     * The program demonstrates user input, loops, conditionals, switch-case, and basic algorithmic logic in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to think of a number
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Press Enter when you're ready: ");
        scanner.nextLine(); // Wait for user to press Enter

        // Initialize binary search boundaries
        int low = 1;
        int high = 100;
        boolean correct = false;

        // Continue guessing until correct or boundaries are invalid
        while (!correct && low <= high) {
            // Calculate the midpoint as the guess
            int guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "? (high/low/correct): ");
            
            // Read and normalize user feedback
            String feedback = scanner.nextLine().toLowerCase();

            // Update boundaries based on feedback
            switch (feedback) {
                case "high":
                    high = guess - 1; // Adjust upper boundary
                    break;
                case "low":
                    low = guess + 1;  // Adjust lower boundary
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number " + guess + "!");
                    correct = true;   // Stop the loop
                    break;
                default:
                    System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }
        }

        // If the loop ends without a correct guess
        if (!correct) {
            System.out.println("Please provide proper feedback.");
        }
    }
}
