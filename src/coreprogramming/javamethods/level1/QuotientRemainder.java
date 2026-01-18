package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class QuotientRemainder {

    /*
     * This method calculates the quotient and remainder
     * when a number is divided by a divisor.
     *
     * Parameters:
     * - number  : the dividend
     * - divisor : the divisor
     *
     * Returns:
     * - an integer array where:
     *   index 0 -> quotient
     *   index 1 -> remainder
     */
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        // Calculate quotient using integer division
        int quotient = number / divisor;

        // Calculate remainder using modulus operator
        int remainder = number % divisor;

        // Return quotient and remainder as an array
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read the dividend from user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Read the divisor from user
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        // Call method to find quotient and remainder
        int[] output = findRemainderAndQuotient(number, divisor);

        // Display the results
        System.out.println(
                "The quotient and remainder are: " + output[0] + " and " + output[1]
        );
    }
}
