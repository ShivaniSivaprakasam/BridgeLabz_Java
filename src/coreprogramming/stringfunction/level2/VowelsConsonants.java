package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program counts the number of vowels and consonants in a given string.
 */
public class VowelsConsonants {

    /*
     * Method to count vowels and consonants
     *  text Input string
     *  int array where [0] = vowels, [1] = consonants
     */
    public static int[] vowelConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        String lower = text.toLowerCase(); // Convert to lowercase for easy comparison

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } 
            // Check for consonants (letters excluding vowels)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            // Ignore non-letter characters
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scan.nextLine();

        int[] count = vowelConsonants(text);

        System.out.println("The count of vowels in the string: " + count[0]);
        System.out.println("The count of consonants in the string: " + count[1]);
    }
}


