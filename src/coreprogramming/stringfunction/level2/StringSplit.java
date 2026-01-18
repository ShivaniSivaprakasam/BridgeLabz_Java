package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program demonstrates splitting a string into words using two methods:
 * 1. Custom method without using built-in split()
 * 2. Built-in split() method
 * It also compares both results to check if they are the same.
 */
public class StringSplit {

    /*
     * Finds the length of the string manually
     */
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access each character until exception occurs
                count++;
            }
        } catch (Exception e) {
            // Reached end of string
        }
        return count;
    }

    /*
     * Custom method to split a string into words
     */
    public static String[] customSplit(String text) {

        int length = findLength(text);
        int wordCount = 0;

        // Count number of words
        for (int i = 0; i < length; i++) {
            if ((i == 0 && text.charAt(i) != ' ') ||
                    (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        // Store indices of spaces
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1; // Start before first character

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length; // End after last character

        // Extract words based on space indices
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    /*
     * Compares two string arrays to check if they are equal
     */
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sentence from the user
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Split using custom method
        String[] customResult = customSplit(input);

        // Split using built-in method
        String[] builtInResult = input.split(" ");

        // Display custom method result
        System.out.println("\nCustom Split Result:");
        for (String word : customResult) {
            System.out.println(word);
        }

        // Display built-in method result
        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInResult) {
            System.out.println(word);
        }

        // Compare both results
        boolean isSame = compareArrays(customResult, builtInResult);
        System.out.println("\nAre both results same? " + isSame);

    }
}


