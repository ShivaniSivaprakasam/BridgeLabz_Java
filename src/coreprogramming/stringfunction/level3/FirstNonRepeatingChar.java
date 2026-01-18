package coreprogramming.stringfunction.level3;

import java.util.Scanner;

public class FirstNonRepeatingChar {

    /**
     * Finds the first non-repeating character in a given string.
     * Uses an ASCII-based frequency array for counting occurrences.
     *
     * str The input string
     *  The first non-repeating character, or '\0' if none found
     */
    public static char findFirstNonRepeating(String str) {
        int[] freq = new int[256]; // Array to store frequency of ASCII characters
        int length = 0;            // Variable to hold string length

        // Calculate string length manually using try-catch on IndexOutOfBoundsException
        try {
            while (true) {
                str.charAt(length); // Access character at index
                length++;           // Increment length counter
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length; stop counting
        }

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            freq[(int) ch]++; // Increment frequency based on ASCII value
        }

        // Find the first character with frequency 1
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (freq[(int) ch] == 1) {
                return ch; // Return first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character exists
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter a string: "); // Prompt user to enter string
        String input = sc.nextLine();         // Read input

        // Find the first non-repeating character
        char result = findFirstNonRepeating(input);

        // Display the result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close(); // Close scanner to free resources
    }
}


