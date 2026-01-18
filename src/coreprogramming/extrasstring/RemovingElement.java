package coreprogramming.extrasstring;

import java.util.Scanner;

public class RemovingElement {

    /*
     * This program removes all occurrences of a specified character from a string entered by the user.
     * Example:
     *   Input: "programming", character to remove: 'g'
     *   Output: "programmin"
     * The program demonstrates string manipulation, loops, and conditional checks in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Prompt user to enter the character to remove
        System.out.print("Enter a character to remove: ");
        char character = input.next().charAt(0);

        String result = ""; // String to store result after removing specified character

        // Iterate through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Append character to result only if it is not the character to remove
            if (ch != character) {
                result += ch;
            }
        }

        // Display the resulting string
        System.out.println("String after removing '" + character + "': " + result);
    }
}
