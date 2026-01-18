package coreprogramming.extrasstring;

import java.util.Scanner;

public class ToggleCase {

    /*
     * This program toggles the case of each character in a string entered by the user.
     * Lowercase letters are converted to uppercase and vice versa.
     * Non-alphabetic characters remain unchanged.
     * Example:
     *   Input: "Hello World!"
     *   Output: "hELLO wORLD!"
     * This demonstrates string manipulation and ASCII value operations in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String result = ""; // Store the resulting toggled string

        // Iterate through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if the character is lowercase and convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } 
            // Check if the character is uppercase and convert to lowercase
            else if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } 
            // Leave non-alphabetic characters unchanged
            else {
                result += ch;
            }
        }

        // Display the string with toggled cases
        System.out.println("The toggled cases are: " + result);
    }
}
