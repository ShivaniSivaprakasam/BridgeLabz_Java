package coreprogramming.stringfunction.level1;

import java.util.Scanner;

/*
 * This program demonstrates extracting a substring from a string
 * using two methods: a manual method and the built-in substring() method.
 */
public class SubString {

    /*
     * Method 1: Extracts substring manually by iterating through the string
     * Validates indices before extraction
     */
    public static String checkSubString(String text, int start, int end) {

        // Checking if indices are valid
        if (start < 0 || end > text.length() || start >= end) {
            return "Invalid index values";
        }

        String result = "";

        // Extracting substring character by character
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    /*
     * Method 2: Extracts substring using built-in substring() method
     */
    public static String checkSubString2(String text, int start, int end) {
        return text.substring(start, end);
    }

    public static void main(String[] args) {

        // Taking input from the user
        Scanner inout = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = inout.nextLine();

        System.out.print("Enter the starting index for the substring: ");
        int start = inout.nextInt();

        System.out.print("Enter the ending index for the substring: ");
        int end = inout.nextInt();

        // Extracting substring using both methods
        String check1 = checkSubString(text, start, end);
        String check2 = checkSubString2(text, start, end);

        // Displaying results
        System.out.println("Substring from method 1: " + check1);
        System.out.println("Substring from method 2: " + check2);

        // Comparing the results
        if (check1.equals(check2)) {
            System.out.println("The substrings from both methods are correct.");
        } else {
            System.out.println("The substrings are not correct from both methods.");
        }
    }
}

