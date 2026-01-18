package coreprogramming.extrasstring;

import java.util.Scanner;

public class VowelsConsonants {

    /*
     * This program counts the number of vowels and consonants in a string entered by the user.
     * Vowels are considered as 'a', 'e', 'i', 'o', 'u' (lowercase only in this implementation).
     * Consonants are all other alphabetic characters.
     * Non-alphabetic characters are considered consonants in this basic version.
     * Example:
     *   Input: "hello"
     *   Output: Vowels = 2, Consonants = 3
     * This demonstrates character iteration, condition checking, and string processing in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int vowels = 0;     // Counter for vowels
        int consonants = 0; // Counter for consonants

        // Iterate through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is a vowel (lowercase)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } 
            // All other characters counted as consonants
            else {
                consonants++;
            }
        }

        // Display the counts
        System.out.println("The number of vowels in the given string is: " + vowels);
        System.out.println("The number of consonants in the given string is: " + consonants);
    }
}
