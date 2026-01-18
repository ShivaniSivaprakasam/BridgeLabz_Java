package coreprogramming.stringfunction.level1;

import java.util.Scanner;

/*
 * This program converts a string to uppercase
 * using both a manual method and the built-in toUpperCase() method.
 * It also compares the results of both methods.
 */
public class UpperCase {

    /*
     * Method 1: Converts a string to uppercase manually
     * by subtracting 32 from lowercase ASCII characters
     */
    public static String manual(String text) {
        String result = " ";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

    /*
     * Method 2: Converts a string to uppercase
     * using the built-in toUpperCase() method
     */
    public static String inBult(String text) {
        return text.toUpperCase();
    }

    /*
     * Compares two strings character by character
     * and returns true if they are equal
     */
    public static boolean compare(String text1, String text2) {
        if (text1.length() == text2.length()) {
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Taking string input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Converting string to uppercase using both methods
        String text1 = manual(text);
        String text2 = inBult(text);

        // Displaying results
        System.out.println("Upper case by manual method is: " + text1);
        System.out.println("Upper case by inBult method is: " + text2);

        // Comparing results of both methods
        if (compare(text1, text2)) {
            System.out.println("\nThe conversion from lower to upper in both methods is not the same.");
        } else {
            System.out.println("\nThe conversion from lower to upper in both methods is the same.");
        }
    }
}


