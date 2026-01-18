package coreprogramming.stringfunction.level3;

import java.util.Scanner;

public class UniqueCharacters {

    /**
     * Calculates the length of a string without using the built-in length() method.
     * Uses try-catch to detect when the index goes out of bounds.
     *
     * @param str Input string
     * @return Length of the string
     */
    public static int stringLength(String str) {
        int length = 0; // Counter for length

        // Loop until IndexOutOfBoundsException occurs
        try {
            while (true) {
                str.charAt(length); // Access character at current index
                length++;           // Increment length counter
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length; do nothing
        }

        return length; // Return calculated length
    }

    /**
     * Finds all unique characters in a string in the order they appear.
     *
     * @param str Input string
     * @return Array of unique characters
     */
    public static char[] findUniqueChars(String str) {
        int len = stringLength(str);       // Get string length
        char[] unique = new char[len];     // Temporary array to store unique characters
        int count = 0;                      // Counter for unique characters

        // Loop through each character in the string
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;       // Flag to check if character is unique

            // Check if character already exists in the unique array
            for (int j = 0; j < count; j++) {
                if (unique[j] == ch) {
                    isUnique = false; // Character is not unique
                    break;            // Exit inner loop
                }
            }

            // If character is unique, add it to the array
            if (isUnique) {
                unique[count] = ch;
                count++; // Increment unique character counter
            }
        }

        // Create result array of exact size to store unique characters
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i]; // Copy unique characters
        }

        return result; // Return array of unique characters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter a string: "); // Prompt user
        String input = sc.nextLine();         // Read input

        // Find unique characters in the string
        char[] uniqueChars = findUniqueChars(input);

        // Display unique characters
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " "); // Print each unique character
        }

        sc.close(); // Close scanner to free resources
    }
}

