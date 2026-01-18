package coreprogramming.extrasstring;

import java.util.Scanner;

public class NonDuplicateString {

    /*
     * This program removes duplicate characters from a string entered by the user.
     * Only the first occurrence of each character is kept, maintaining the original order.
     * Example:
     *   Input: "programming"
     *   Output: "progamin"
     * The program demonstrates string manipulation, loops, and conditional checking in Java.
     */

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String text) {
        String result = ""; // Stores the string without duplicates

        // Loop through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean found = false; // Flag to check if character already exists in result

            // Check if current character is already in result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    found = true; // Character already exists
                    break;
                }
            }

            // If character not found in result, append it
            if (!found) {
                result += current;
            }
        }

        return result; // Return the string with duplicates removed
    }

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String text = scan.nextLine();

        // Call method to remove duplicates
        String output = removeDuplicates(text);

        // Display the result
        System.out.println("String after removing duplicates: " + output);;
    }
}
