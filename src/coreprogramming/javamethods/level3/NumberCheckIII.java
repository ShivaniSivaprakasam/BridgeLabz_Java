package coreprogramming.javamethods.level3;

import java.util.Scanner;

/*
 * NumberCheckIII class
 * --------------------
 * This class provides methods to analyze a number for:
 * 1. Counting the number of digits.
 * 2. Storing the digits in an array.
 * 3. Reversing the digits.
 * 4. Checking if the number is a palindrome.
 * 5. Checking if the number is a Duck Number (contains at least one zero).
 *
 * The main method reads a number from the user and displays whether
 * it is a palindrome and whether it is a Duck Number.
 */
public class NumberCheckIII {

    // Count the number of digits in a number
    public static int digitCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;       // Increment count for each digit
            number /= 10;  // Remove last digit
        }
        return count;
    }

    // Convert the number into an array of digits
    public static int[] digitArray(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10; // Extract last digit
            number /= 10;             // Remove last digit
        }
        return digits;
    }

    // Reverse an array of digits
    public static int[] reverseArray(int[] digits) {
        int[] reverse = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i]; // Copy elements in reverse order
        }
        return reverse;
    }

    // Compare two arrays element by element
    public static boolean compareArrays(int[] a1, int[] a2) {
        if (a1.length != a2.length) return false; // Different lengths cannot be equal

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false; // Found a mismatch
            }
        }
        return true; // All elements match
    }

    // Check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits); // Reverse the digits
        return compareArrays(digits, reversed); // Compare original and reversed
    }

    // Check if a number is a Duck Number (contains at least one zero)
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) { // Found a zero digit
                return true;
            }
        }
        return false;
    }

    // Main method to demonstrate palindrome and Duck Number checks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt(); // Read number from user

        int count = digitCount(number);          // Count digits
        int[] digits = digitArray(number, count); // Convert number to array

        // Check and display results
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

    }
}
