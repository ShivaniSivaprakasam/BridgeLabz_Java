package coreprogramming.extrasstring;

import java.util.Scanner;

public class Anagrams {

    /*
     * This program checks whether two strings entered by the user are anagrams.
     * Anagrams are words or phrases formed by rearranging the letters of another,
     * ignoring spaces and letter case.
     * Example: "Listen" and "Silent" are anagrams.
     * The program demonstrates string manipulation, loops, and nested iteration in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the first string
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();

        // Prompt user to enter the second string
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        // Remove spaces and convert to lowercase for case-insensitive comparison
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("The strings are NOT anagrams.");
            input.close(); // Close Scanner before exiting
            return;
        }

        int count = 0; // Counter to track matching character frequencies

        // Loop through each character of the first string
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int freq1 = 0; // Frequency of character in first string
            int freq2 = 0; // Frequency of character in second string

            // Count occurrences of ch in both strings
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == ch)
                    freq1++;
                if (s2.charAt(j) == ch)
                    freq2++;
            }

            // If frequencies match, increment count
            if (freq1 == freq2) {
                count++;
            }
        }

        // If all character frequencies match, strings are anagrams
        if (count == s1.length()) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
