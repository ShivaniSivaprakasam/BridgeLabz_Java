package coreprogramming.stringfunction.level3;

import java.util.Scanner;

public class CharacterFrequency {

    /**
     * Calculates the frequency of each character in the given string.
     * Uses ASCII values for counting and returns a 2D array of character and frequency.
     *
     *  str The input string
     *  A 2D array with unique characters and their frequencies
     */
    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256]; // Array to store frequency of ASCII characters
        int length = 0;            // Variable to store string length

        // Calculate string length manually using try-catch on IndexOutOfBoundsException
        try {
            while (true) {
                str.charAt(length); // Access each character
                length++;           // Increment length counter
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length, stop counting
        }

        // Count frequency of each character using ASCII values
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            freq[(int) ch]++; // Increment frequency for character
        }

        // Count number of unique characters in the string
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++; // Increment counter for unique characters
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Populate the result array with characters and their frequency
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i); // Store character
                result[index][1] = Integer.toString(freq[i]);    // Store frequency
                index++;                                        // Move to next index
            }
        }

        return result; // Return the 2D array
    }

    /**
     * Displays the character-frequency table in a formatted manner.
     *
     *  data A 2D array containing characters and their frequencies
     */
    public static void displayFrequency(String[][] data) {
        // Print table header
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");

        // Loop through each row and print character and frequency
        for (String[] row : data) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter a string: "); // Prompt user to enter string
        String input = sc.nextLine();         // Read input string

        // Get frequency data of characters in the string
        String[][] freqData = findCharFrequency(input);

        // Display character-frequency table
        displayFrequency(freqData);

        sc.close(); // Close the scanner to free resources
    }
}


