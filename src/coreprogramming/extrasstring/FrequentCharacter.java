package coreprogramming.extrasstring;

import java.util.Scanner;

public class FrequentCharacter {

    /*
     * This program finds the most frequent character in a given string entered by the user.
     * It demonstrates string manipulation, loops, and counting techniques in Java.
     * Example: Input "programming" → Most frequent character: 'g'
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int maxCount = 0;       // Tracks the highest frequency of any character
        char mostFrequent = ' '; // Stores the most frequent character

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int count = 0; // Frequency of current character

            // Count occurrences of ch in the entire string
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            // Update maxCount and mostFrequent if current character has higher frequency
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ch;
            }
        }

        // Display the most frequent character
        System.out.println("Most frequent character: '" + mostFrequent + "'");
    }
}
