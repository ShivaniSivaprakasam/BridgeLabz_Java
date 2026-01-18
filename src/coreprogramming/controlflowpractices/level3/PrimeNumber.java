package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class PrimeNumber {

    /*
     * This program checks whether a given number is a prime number or not.
     * A prime number is a natural number greater than 1 that has no positive 
     * divisors other than 1 and itself.
     * The program reads a number from the user, checks for divisibility, 
     * and prints whether the number is prime.
     */

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Assume the number is prime initially
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number-1 to check divisibility
            for (int i = 2; i < number; i++) {
                // If number is divisible by i, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }
        }

        // Print the result based on the isPrime flag
        if (isPrime) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
    }
}
