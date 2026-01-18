package coreprogramming.stringfunction.level3;

import java.util.Scanner;

public class CharFrequencyNestedLoops {

    /**
     * This method calculates the frequency of each unique character in the given string.
     * 
     * @param text The input string whose character frequencies are to be calculated.
     * @return An array of strings representing each character and its frequency.
     */
    public static String[] findFrequency(String text) {

        // Convert the input string into a character array for processing
        char[] chars = text.toCharArray();

        // Get the length of the character array
        int n = chars.length;

        // Array to store frequency of each character
        int[] freq = new int[n];

        // Initialize all frequency values to 1
        for (int i = 0; i < n; i++) {
            freq[i] = 1; // Single line: Initialize frequency of each character to 1
        }

        /* 
         * Nested loop to compare each character with the rest of the characters
         * and count the frequency of each character
         */
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') {
                continue; // Skip characters already counted and marked as '0'
            }

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;       // Increment frequency for duplicate character
                    chars[j] = '0';  // Mark the duplicate character as counted
                }
            }
        }

        // Count the number of unique characters (not marked as '0')
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                uniqueCount++; // Increment unique character counter
            }
        }

        // Prepare the result array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;

        // Populate the result array with character and frequency strings
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i]; // Format "char : frequency"
                index++;
            }
        }

        // Return the array containing frequencies of unique characters
        return result;
    }

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the findFrequency method to get character frequencies
        String[] frequency = findFrequency(input);

        // Display the character frequencies to the user
        System.out.println("Character Frequencies:");
        for (String s : frequency) {
            System.out.println(s); // Print each character and its frequency
        }

        sc.close(); // Close the Scanner object to avoid resource leak
    }
}
