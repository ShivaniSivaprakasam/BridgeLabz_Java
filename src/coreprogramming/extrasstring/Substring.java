package coreprogramming.extrasstring;

import java.util.Scanner;

public class Substring {

    /*
     * This program counts the number of occurrences of a specific substring in a string entered by the user.
     * Example:
     *   Input string: "banana"
     *   Substring to search: "an"
     *   Output: 2
     * The program demonstrates string searching, loops, and the use of indexOf method in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the main string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Prompt user to enter the substring to search for
        System.out.print("Enter the substring to search: ");
        String substring = input.nextLine();

        int count = 0; // Counter for occurrences
        int index = 0; // Starting index for search

        // Loop to find all occurrences of the substring
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;                 // Increment count for each occurrence
            index += substring.length(); // Move index forward to continue searching
        }

        // Display the total number of occurrences
        System.out.println("Occurrence of substring: " + count);
    }
}
