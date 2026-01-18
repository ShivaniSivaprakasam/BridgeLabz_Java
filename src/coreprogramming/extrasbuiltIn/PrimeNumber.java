package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class PrimeNumber {

    /*
     * This program checks whether a given number entered by the user is a prime number.
     * A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
     * Example: 2, 3, 5, 7, 11
     * The program demonstrates user input, loops, conditionals, and boolean flags in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true; // Flag to track if number is prime

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; // Not prime if divisible by any number
                    break;           // Exit loop early
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
    }
}
