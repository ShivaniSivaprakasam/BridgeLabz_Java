package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program finds the shortest and longest words in a given sentence.
 * It demonstrates manual string operations without using built-in split() method.
 */
public class ShortestLongestWord {

    /*
     * Finds the length of a string manually
     */
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access each character until exception
                count++;
            }
        } catch (Exception e) {
            // Reached the end of the string
        }
        return count;
    }

    /*
     * Splits a string into words manually
     * Returns an array of words
     */
    public static String[] customSplit(String text) {

        int length = findLength(text); // Total length of string
        int wordCount = 0;

        // Count number of words
        for (int i = 0; i < length; i++) {
            if ((i == 0 && text.charAt(i) != ' ') ||
                    (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        // Extract words from string
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }

        if (!word.equals("")) {
            words[index] = word; // Add last word
        }

        return words;
    }

    /*
     * Creates a table with each word and its length
     */
    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i]; // Word
            table[i][1] = String.valueOf(findLength(words[i])); // Length
        }

        return table;
    }

    /*
     * Finds the indices of shortest and longest words
     * Returns an array: [shortestIndex, longestIndex]
     */
    public static int[] findShortestAndLongest(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLength = Integer.parseInt(table[0][1]);
        int longestLength = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a sentence
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Split sentence into words and create word-length table
        String[] words = customSplit(input);
        String[][] table = createWordLengthTable(words);

        // Find shortest and longest word indices
        int[] result = findShortestAndLongest(table);

        // Display word-length table
        System.out.println("\nWord \t Length");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " \t " + Integer.parseInt(table[i][1]));
        }

        // Display shortest and longest words
        System.out.println("\nShortest Word: " + table[result[0]][0]);
        System.out.println("Longest Word: " + table[result[1]][0]);
    }
}

