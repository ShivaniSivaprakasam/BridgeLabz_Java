package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program takes a sentence from the user
 * and displays each word along with its length.
 */
public class WordLengthTable {

    // Method to find length of a string without using in-built length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return count;
    }

    // Custom method to split a sentence into words
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;

        // Count words
        for (int i = 0; i < length; i++) {
            if ((i == 0 && text.charAt(i) != ' ') || 
                (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String word = "";

        // Extract words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else if (!word.equals("")) {
                words[wordIndex++] = word;
                word = "";
            }
        }

        if (!word.equals("")) {
            words[wordIndex] = word;
        }

        return words;
    }

    // Create a table of words and their lengths
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = createWordLengthTable(words);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + length);
        }
    }
}

