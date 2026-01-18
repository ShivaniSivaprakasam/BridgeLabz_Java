package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program demonstrates how to trim leading and trailing spaces
 * from a string manually using charAt() and compares it with the built-in trim() method.
 */
public class TrimUsingCharAt {

    /*
     * Finds the start and end indices of the string after trimming leading and trailing spaces
     */
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Move start forward until a non-space character is found
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Move end backward until a non-space character is found
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    /*
     * Creates a substring manually from start to end indices using charAt()
     */
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    /*
     * Compares two strings character by character
     */
    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string with leading and trailing spaces
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        // Find trim indices and create trimmed string manually
        int[] indices = findTrimIndices(input);
        String trimmedUsingCharAt = substringUsingCharAt(input, indices[0], indices[1]);

        // Trim string using built-in method
        String trimmedUsingBuiltIn = input.trim();

        // Compare both results
        boolean isSame = compareStringsUsingCharAt(trimmedUsingCharAt, trimmedUsingBuiltIn);

        // Display results
        System.out.println("Trimmed using charAt(): " + trimmedUsingCharAt);
        System.out.println("Trimmed using built-in trim(): " + trimmedUsingBuiltIn);
        System.out.println("Are both strings equal? " + isSame);
    }
}

