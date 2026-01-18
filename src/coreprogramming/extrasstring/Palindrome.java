package coreprogramming.extrasstring;

import java.util.Scanner;

public class Palindrome {

    /*
     * This program checks whether a given string is a palindrome or not.
     * A palindrome is a word, phrase, or sequence that reads the same forwards and backwards.
     * Example:
     *   Input: "level" → Output: The string is a palindrome.
     *   Input: "hello" → Output: The string is not a palindrome.
     * The program demonstrates string manipulation, loops, and conditional checking in Java.
     */

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String text) {
        int start = 0;               // Start index of string
        int end = text.length() - 1; // End index of string

        // Compare characters from start and end moving towards the center
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If mismatch found, string is not a palindrome
            }
            start++; // Move start index forward
            end--;   // Move end index backward
        }
        return true; // All characters matched, string is a palindrome
    }

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call method to check for palindrome
        boolean check = checkPalindrome(text);

        // Display the result
        if (check) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
