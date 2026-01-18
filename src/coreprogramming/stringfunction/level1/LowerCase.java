package coreprogramming.stringfunction.level1;

import java.util.Scanner;

/*
 * This program converts a string to lowercase
 * using both a manual method and the in-built toLowerCase() method.
 * It also compares the results of both methods.
 */
public class LowerCase {

    /*
     * This method converts a string to lowercase manually
     * by adding 32 to uppercase ASCII characters.
     */
    public static String manual(String text) {
        String result = " ";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    /*
     * This method converts a string to lowercase
     * using the built-in toLowerCase() method
     */
    public static String inBuilt(String text) {
        return text.toLowerCase();
    }

    /*
     * This method checks if two strings are equal
     * by comparing characters one by one
     */
    public static boolean check(String text1, String text2) {
        if (text1.length() != text2.length()) {
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

        // Converting string to lowercase using both methods
        String text1 = manual(text);
        String text2 = inBuilt(text);

        // Displaying results
        System.out.println("Lower case by manual method: " + text1);
        System.out.println("Lower case by inbuilt method: " + text2);

        // Comparing results of both methods
        if (check(text1, text2)) {
            System.out.println("\nThe lower case strings provided by both methods are the same.");
        } else {
            System.out.println("\nThe lower case strings provided by both methods are not the same.");
        }
    }
}

