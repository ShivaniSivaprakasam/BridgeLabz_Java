package coreprogramming.stringfunction.level3;

import java.util.Scanner;

public class PalindromeCheck {

    /**
     * Checks if a string is a palindrome using an iterative approach.
     * Compares characters from start and end moving towards the center.
     * 
     * @param text Input string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeIterative(String text) {
        int start = 0;              // Start pointer
        int end = text.length() - 1; // End pointer

        // Loop until pointers meet in the middle
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Characters don't match, not a palindrome
            }
            start++; // Move start forward
            end--;   // Move end backward
        }
        return true; // All characters matched
    }

    /**
     * Checks if a string is a palindrome using recursion.
     * 
     * @param text Input string
     * @param start Start index
     * @param end End index
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: crossed pointers
        if (start >= end) {
            return true;
        }

        // If characters at current indices don't match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call moving towards the center
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    /**
     * Reverses a string and returns it as a character array.
     * 
     * @param text Input string
     * @return Character array of reversed string
     */
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reverse = new char[len];

        // Copy characters in reverse order
        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }
        return reverse;
    }

    /**
     * Checks if a string is a palindrome by converting it to an array
     * and comparing with its reversed array.
     * 
     * @param text Input string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();  // Original character array
        char[] reverse = reverseString(text);  // Reversed array

        // Compare each character
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false; // Mismatch found, not a palindrome
            }
        }
        return true; // All characters match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter a string: "); // Prompt user
        String input = sc.nextLine();         // Read input

        // Check palindrome using three different methods
        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeUsingArray(input);

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + result1);
        System.out.println("Logic 2 (Recursive): " + result2);
        System.out.println("Logic 3 (Array): " + result3);

        sc.close(); // Close scanner to free resources
    }
}

