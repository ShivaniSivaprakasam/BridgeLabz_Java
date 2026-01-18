package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program checks each character in a given string
 * and determines whether it is a vowel, consonant, or not a letter.
 */
public class VowelConsonantChecker {

    /*
     * Method to check the type of a character
     *  ch Character to check
     * "Vowel", "Consonant", or "Not a Letter"
     */
    public static String checkCharacterType(char ch) {
        // Convert uppercase letters to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter"; // For digits, spaces, symbols
    }

    /*
     * Method to check each character in the string
     *  text Input string
     *  2D array containing character and its type
     */
    public static String[][] findVowelsAndConsonants(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);       // Store the character
            result[i][1] = checkCharacterType(ch);   // Store its type
        }

        return result;
    }

    /*
     * Method to display the character and type table
     * data 2D array containing characters and their type
     */
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find character types
        String[][] result = findVowelsAndConsonants(input);

        // Display the results
        displayTable(result);
    }
}


