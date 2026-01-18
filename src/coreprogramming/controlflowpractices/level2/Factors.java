package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class Factors {

    /*
     * This program finds all the factors of a given positive integer.
     * It prompts the user for input if a negative number is entered.
     * Each factor is printed on a new line.
     */

    // Method to find and print factors of a number
    public static void findingFactors(int N) {

        // Loop to ensure N is positive
        while (N < 0) {

            // Asking user for a positive integer
            System.out.print("Enter a positive integer: ");
            N = new Scanner(System.in).nextInt();
        }

        // Loop from 1 to N to check for factors
        for (int i = 1; i <= N; i++) {

            // If i divides N completely, it is a factor
            if (N % i == 0) {
                System.out.println(i); // Print the factor
            }
        }
    }

    public static void main(String[] args) {

        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompting user to enter a number
        System.out.print("Enter a number: ");
        int N = input.nextInt();

        // Calling the method to find and display factors
        findingFactors(N);

        // Closing the Scanner
        input.close();
    }
}
