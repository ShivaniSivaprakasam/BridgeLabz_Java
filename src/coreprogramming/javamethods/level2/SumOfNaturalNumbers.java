package coreprogramming.javamethods.level2;

import java.util.Scanner;

/*
 * SumOfNaturalNumbers class
 * -------------------------
 * This class demonstrates two ways to calculate the sum of first N natural numbers:
 * 1. recursionSum(int N) - Calculates the sum recursively.
 * 2. sumNumber(int N) - Calculates the sum using the arithmetic formula: N*(N+1)/2.
 * The main method reads a number from the user, calculates the sum using both methods,
 * and compares the results to ensure they match.
 */
public class SumOfNaturalNumbers {

    // Recursive method to calculate sum of first N natural numbers
    public static int recursionSum(int N) {
        if (N == 0) { // Base case: sum of 0 is 0
            return 0;
        }
        return N + recursionSum(N - 1); // Recursive call: sum of N = N + sum of (N-1)
    }

    // Formula-based method to calculate sum of first N natural numbers
    public static int sumNumber(int N) {
        int sum = N * (N + 1) / 2; // Using arithmetic progression formula
        return sum;
    }

    // Main method to demonstrate both sum calculation methods
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object to read user input
        System.out.print("Enter number: ");
        int N = input.nextInt(); // Read number from user

        int result1 = recursionSum(N); // Calculate sum using recursion
        int result2 = sumNumber(N);    // Calculate sum using formula

        // Compare results and print whether both methods match
        if (result1 == result2) {
            System.out.println("Both methods provide the same output.");
        } else {
            System.out.println("They provide different output.");
        }
    }
}
