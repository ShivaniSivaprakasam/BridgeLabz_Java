package coreprogramming.javamethods.level3;

import java.util.Scanner;

/*
 * NumberCheckV class
 * ------------------
 * This class provides methods to analyze a number and its factors:
 * 1. Find all factors of a number.
 * 2. Determine the greatest factor.
 * 3. Calculate sum, product, and product of cubes of factors.
 * 4. Check if the number is Perfect, Abundant, Deficient, or Strong.
 * 5. Factorial helper method for strong number check.
 *
 * The main method reads a number from the user and displays all
 * factor-based properties and checks.
 */
public class NumberCheckV {

    // Find all factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // Count total factors
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i; // Store each factor
            }
        }
        return factors;
    }

    // Find the greatest factor from an array of factors
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) {
                max = f; // Update max if factor is greater
            }
        }
        return max;
    }

    // Calculate the sum of all factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f; // Add each factor
        }
        return sum;
    }

    // Calculate the product of all factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f; // Multiply each factor
        }
        return product;
    }

    // Calculate the product of cubes of all factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3); // Multiply cube of each factor
        }
        return product;
    }

    // Check if the number is a Perfect Number
    public static boolean perfectNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) {
                sum += f; // Sum of proper factors only
            }
        }
        return sum == number;
    }

    // Check if the number is Abundant
    public static boolean abundantNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) {
                sum += f; // Sum of proper factors
            }
        }
        return sum > number;
    }

    // Check if the number is Deficient
    public static boolean deficientNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) {
                sum += f; // Sum of proper factors
            }
        }
        return sum < number;
    }

    // Check if the number is Strong (sum of factorials of digits equals number)
    public static boolean strongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;       // Extract last digit
            sum += factorial(digit);     // Add factorial of digit
            temp /= 10;                  // Remove last digit
        }
        return sum == number;
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; // Multiply factorial iteratively
        }
        return fact;
    }

    // Main method to demonstrate all factor-related checks
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read number from user

        int[] factors = findFactors(number); // Get factors

        // Display all factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Display factor-based properties
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        // Display number type checks
        System.out.println("Is Perfect Number: " + perfectNumber(number, factors));
        System.out.println("Is Abundant Number: " + abundantNumber(number, factors));
        System.out.println("Is Deficient Number: " + deficientNumber(number, factors));
        System.out.println("Is Strong Number: " + strongNumber(number));
    }
}
