package coreprogramming.extrasstring;

import java.util.Scanner;

public class StringReplace {

    /*
     * This program replaces all occurrences of a specified word in a sentence with a new word.
     * Example:
     *   Input sentence: "I love Java programming"
     *   Word to replace: "Java"
     *   New word: "Python"
     *   Output: "I love Python programming"
     * The program demonstrates string manipulation, loops, and conditional checking in Java.
     */

    // Method to replace a specific word in a sentence with a new word
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = ""; // Store the modified sentence
        String word = "";   // Temporary variable to store each word

        // Iterate over each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Build word character by character
            if (ch != ' ') {
                word += ch;
            } else {
                // Compare the word with oldWord and replace if needed
                if (word.equals(oldWord)) {
                    result += newWord;
                } else {
                    result += word;
                }
                result += " "; // Add space after each word
                word = "";     // Reset word for the next iteration
            }
        }

        // Handle the last word in the sentence
        if (word.equals(oldWord)) {
            result += newWord;
        } else {
            result += word;
        }

        return result;
    }

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Prompt user for the word to replace
        System.out.print("Enter the word to replace: ");
        String oldWord = input.next();

        // Prompt user for the new word
        System.out.print("Enter the new word: ");
        String newWord = input.next();

        // Call the method to replace the word
        String replacedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the modified sentence
        System.out.println("Modified sentence: " + replacedSentence);
    }
}
