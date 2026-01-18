package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class FactorsWhile {

    /*
     * This program finds all the factors of a given positive integer using a while loop.
     * If the user enters a negative number, it prompts again until a positive integer is provided.
     * Each factor is printed on a separate line.
     */

    // Method to find and print factors using a while loop
    public static void findingFactors(int N) {

        // Loop to ensure only positive numbers are processed
        while (N < 0) {
            System.out.print("Enter a positive integer: ");
            N = new Scanner(System.in).nextInt(); // Prompt user for positive number
        }

        int count = 0; // Counter to iterate through potential factors

        // Loop from 1 to N to check for factors
        while (count < N) {
            count++; // Increment counter

            // If count divides N completely, it is a factor
            if (N % count == 0) {
                System.out.println(count); // Print the factor
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object for user input

        // Prompting user to enter a number
        System.out.print("Enter a number: ");
        int N = input.nextInt();

        // Calling the method to find and display factors
        findingFactors(N);
    }
}
