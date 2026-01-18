package coreprogramming.stringfunction.level3;

import java.util.Scanner;

/*
 * This program checks whether two input strings are anagrams.
 * Two strings are anagrams if they contain the same characters
 * with the same frequency, but possibly in a different order.
 */
public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // If lengths differ, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Frequency arrays for all ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Count frequency of each character in both strings
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // If any frequency mismatches, not an anagram
            }
        }

        return true; // All frequencies match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String text2 = sc.nextLine();

        // Output result
        if (isAnagram(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}


