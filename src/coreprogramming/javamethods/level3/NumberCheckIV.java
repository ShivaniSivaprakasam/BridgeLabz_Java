package coreprogramming.javamethods.level3;

import java.util.Scanner;

/*
 * NumberCheckIV class
 * -------------------
 * This class provides methods to analyze a number for various special types:
 * 1. Prime Number       - A number greater than 1 with no divisors other than 1 and itself.
 * 2. Neon Number        - A number whose square's digits sum up to the number itself.
 * 3. Spy Number         - A number where the sum of digits equals the product of digits.
 * 4. Automorphic Number - A number whose square ends with the number itself.
 * 5. Buzz Number        - A number divisible by 7 or ending with 7.
 *
 * The main method reads a number from the user and displays whether it satisfies
 * each of the above number types.
 */
public class NumberCheckIV {

    // Check if a number is prime
    public static boolean primeNumber(int number) {
        if (number <= 1) return false; // Numbers <= 1 are not prime

        // Check divisibility up to square root of number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, number is prime
    }

    // Check if a number is Neon (sum of digits of its square equals the number)
    public static boolean neonNumber(int number) {
        int square = number * number;
        int sum = 0;

        // Sum the digits of the square
        while (square > 0) {
            sum += square % 10; // Add last digit
            square /= 10;       // Remove last digit
        }
        return sum == number; // True if sum equals original number
    }

    // Check if a number is Spy (sum of digits equals product of digits)
    public static boolean spyNumber(int number) {
        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10; // Extract last digit
            sum += digit;            // Add to sum
            product *= digit;        // Multiply to product
            number /= 10;            // Remove last digit
        }
        return sum == product; // True if sum equals product
    }

    // Check if a number is Automorphic (square ends with the number itself)
    public static boolean automorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false; // Digit mismatch, not automorphic
            }
            temp /= 10;   // Remove last digit of number
            square /= 10; // Remove corresponding digit from square
        }
        return true; // All digits matched, automorphic
    }

    // Check if a number is Buzz (divisible by 7 or ends with 7)
    public static boolean buzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method to demonstrate all number checks
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read number from user

        // Display results of number type checks
        System.out.println("Is Prime Number: " + primeNumber(number));
        System.out.println("Is Neon Number: " + neonNumber(number));
        System.out.println("Is Spy Number: " + spyNumber(number));
        System.out.println("Is Automorphic Number: " + automorphicNumber(number));
        System.out.println("Is Buzz Number: " + buzzNumber(number));
    }
}
