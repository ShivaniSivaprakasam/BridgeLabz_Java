package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class GcdLcmCalculator {

    /*
     * This program calculates the GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
     * of two integers entered by the user. 
     * 
     * GCD is the largest integer that divides both numbers without remainder.
     * LCM is the smallest integer divisible by both numbers.
     * The program demonstrates user input, loops, arithmetic operations, and method usage in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate GCD of the two numbers
        int gcd = calculateGCD(num1, num2);

        // Calculate LCM of the two numbers using GCD
        int lcm = calculateLCM(num1, num2, gcd);

        // Display the results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        // Close the Scanner object to free resources
        scanner.close();
    }

    /**
     * Calculates the GCD of two numbers using the Euclidean algorithm.
     *
     *  a First number
     *  b Second number
     *  GCD of a and b
     */
    public static int calculateGCD(int a, int b) {
        // Use Euclidean algorithm iteratively
        while (b != 0) {
            int temp = b;
            b = a % b; // Remainder becomes new b
            a = temp;  // Previous b becomes new a
        }
        return a;
    }

    /**
     * Calculates the LCM of two numbers using their GCD.
     *
     *  a   First number
     *  b   Second number
     *  gcd GCD of a and b
     *  LCM of a and b
     */
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
