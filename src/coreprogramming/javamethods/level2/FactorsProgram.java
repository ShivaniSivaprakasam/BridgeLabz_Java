package coreprogramming.javamethods.level2;

import java.util.Scanner;

public class FactorsProgram {

    /*
     * This method finds all factors of a given number
     * Returns an integer array containing the factors
     */
    public static int[] findFactors(int number) {

        int count = 0;

        // Count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    /*
     * This method calculates the sum of factors
     */
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int value : factors) {
            sum += value;
        }
        return sum;
    }

    /*
     * This method calculates the product of factors
     */
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int value : factors) {
            product *= value;
        }
        return product;
    }

    /*
     * This method calculates the sum of squares of factors
     */
    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int value : factors) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Input validation
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            input.close();
            return;
        }

        int[] factors = findFactors(number);

        System.out.println("\nFactors of " + number + ":");
        for (int value : factors) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));

        input.close();
    }
}
