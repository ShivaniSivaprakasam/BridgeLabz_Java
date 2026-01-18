package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class Palindrome {

    /*
     * This program checks whether a given string is a palindrome.
     * A palindrome is a word, phrase, or sequence that reads the same forwards and backwards.
     * Example: "radar", "level", "madam"
     * The program demonstrates string manipulation, loops, and conditional statements in Java.
     */

    /**
     * Checks if a string is a palindrome.
     *
     *  text The string to check
     *  true if the string is a palindrome, false otherwise
     */
    public static boolean checkPalindrome(String text) {
        int start = 0;                // Start index
        int end = text.length() - 1;  // End index

        // Compare characters from both ends moving towards the center
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;         // If mismatch found, not a palindrome
            }
            start++;                  // Move start index forward
            end--;                    // Move end index backward
        }

        return true;                  // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Check if the entered string is a palindrome
        boolean check = checkPalindrome(text);

        // Print the result
        if (check) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
