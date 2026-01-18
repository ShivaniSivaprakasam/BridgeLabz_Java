package coreprogramming.extrasstring;

import java.util.Scanner;

public class LongestWord {

    /*
     * This program finds the longest word in a sentence entered by the user.
     * A word is considered as a sequence of letters (ignoring spaces and punctuation).
     * The program demonstrates string manipulation, loops, character checking, and comparison in Java.
     * Example:
     *   Input: "Java programming is fun"
     *   Output: "programming"
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String longestWord = "";   // To store the longest word found
        String currentWord = "";   // To store the current word being processed

        // Iterate through each character of the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                // Append letter to current word
                currentWord += ch;
            } else {
                // If non-letter found, compare current word with longest word
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = ""; // Reset current word
            }
        }

        // Check last word in case sentence ends with a letter
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        // Display the longest word
        System.out.println("Longest word: " + longestWord);
    }
}
