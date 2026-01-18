package coreprogramming.extrasstring;

import java.util.Scanner;

public class LexicographicalCompare {

    /*
     * This program compares two strings lexicographically (dictionary order) without using built-in methods.
     * Lexicographical comparison checks character by character from left to right.
     * Example:
     *   "apple" comes before "banana"
     *   "cat" comes after "car"
     * The program demonstrates string manipulation, loops, and conditional statements in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the first string
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();

        // Prompt user to enter the second string
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        int i = 0; // Index to iterate through characters
        int minLength = Math.min(s1.length(), s2.length()); // Compare up to the length of shorter string

        // Compare characters one by one
        while (i < minLength) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                System.out.println("First string \"" + s1 + "\" comes before second string \"" + s2 + "\".");
                input.close(); // Close Scanner
                return;
            } else if (c1 > c2) {
                System.out.println("First string \"" + s1 + "\" comes after second string \"" + s2 + "\".");
                input.close(); // Close Scanner
                return;
            }
            i++; // Move to next character
        }

        // If all compared characters are equal, compare lengths
        if (s1.length() < s2.length()) {
            System.out.println("First string \"" + s1 + "\" comes before second string \"" + s2 + "\".");
        } else if (s1.length() > s2.length()) {
            System.out.println("First string \"" + s1 + "\" comes after second string \"" + s2 + "\".");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}
