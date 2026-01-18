package coreprogramming.extrasstring;

import java.util.Scanner;

public class ReverseString {

    /*
     * This program reverses a string entered by the user and prints it.
     * Example:
     *   Input: "hello"
     *   Output: "olleh"
     * The program demonstrates string manipulation, loops, and character access in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.print("Reversed string: ");
        // Loop through the string from the end to the beginning
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i)); // Print each character in reverse order
        }

        System.out.println(); // Print a newline for neat output
    }
}
