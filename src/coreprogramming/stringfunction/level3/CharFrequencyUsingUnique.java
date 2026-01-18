package coreprogramming.stringfunction.level3;

import java.util.Scanner;

public class CharFrequencyUsingUnique {

    /**
     * Calculates the length of a string without using the length() method.
     * Uses a try-catch approach to detect the end of the string.
     * 
     *  str The input string
     *  The length of the string
     */
    public static int stringLength(String str) {
        int len = 0;
        try {
            // Loop through the string until IndexOutOfBoundsException occurs
            while (true) {
                str.charAt(len); // Access character at index
                len++;           // Increment length counter
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when len exceeds string length; do nothing
        }
        return len; // Return the calculated length
    }

    /**
     * Finds all unique characters in the given string in the order they appear.
     * 
     *  str The input string
     *  Array of unique characters
     */
    public static char[] uniqueCharacters(String str) {
        int len = stringLength(str); // Get the length of the string
        char[] temp = new char[len]; // Temporary array to store unique characters
        int count = 0;               // Counter for unique characters

        // Loop through each character in the string
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true; // Flag to check uniqueness

            // Check if character is already in temp array
            for (int j = 0; j < count; j++) {
                if (temp[j] == ch) {
                    isUnique = false; // Character is not unique
                    break;
                }
            }

            // If character is unique, add it to temp
            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        // Create array of exact size to store unique characters
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i]; // Copy unique characters
        }

        return unique; // Return unique characters
    }

    /**
     * Finds frequency of each unique character in the string.
     * Uses ASCII-based frequency counting for efficiency.
     * 
     * str The input string
     *  A 2D array containing character and its frequency
     */
    public static String[][] findFrequency(String str) {
        int[] freq = new int[256];        // Array to store frequency for all ASCII characters
        int len = stringLength(str);      // Get length of the string

        // Count frequency of each character in the string
        for (int i = 0; i < len; i++) {
            freq[(int) str.charAt(i)]++; // Increment frequency based on ASCII value
        }

        char[] unique = uniqueCharacters(str); // Get unique characters

        // Create result array: column 0 = character, column 1 = frequency
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = Character.toString(unique[i]);        // Character
            result[i][1] = Integer.toString(freq[(int) unique[i]]); // Frequency
        }

        return result; // Return 2D array with character frequencies
    }

    /**
     * Displays the character-frequency table in a formatted manner.
     * 
     *  data 2D array containing characters and their frequencies
     */
    public static void display(String[][] data) {
        // Print table header with formatted spacing
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");

        // Loop through each row and print character and frequency
        for (String[] row : data) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter a string: "); // Prompt for input
        String input = sc.nextLine();         // Read user input

        String[][] frequencyData = findFrequency(input); // Get character frequencies
        display(frequencyData);                          // Display the table

        sc.close(); // Close the scanner to free resources
    }
}

