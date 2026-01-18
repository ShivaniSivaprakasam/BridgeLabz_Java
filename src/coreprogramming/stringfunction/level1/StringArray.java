package coreprogramming.stringfunction.level1;

import java.util.Scanner;

/*
 * This program demonstrates converting a string to a character array
 * using two methods and comparing the results.
 */
public class StringArray {

    /*
     * Method 1: Converts a string to a char array manually
     * by iterating through each character
     */
    public static char[] stringArrayCheck(String text) {
        char[] array = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            array[i] = text.charAt(i);
        }
        return array;
    }

    /*
     * Method 2: Converts a string to a char array
     * using the built-in toCharArray() method
     */
    public static char[] stringArrayCheck2(String text) {
        char[] charArray = text.toCharArray();
        return charArray;
    }

    /*
     * This method compares two char arrays
     * and returns true if they are equal
     */
    public static boolean stringArrayResult(char[] array, char[] array2) {
        if (array.length != array2.length) {
            System.out.println("Does not have the same length.");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Taking input string from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = scan.nextLine();

        // Converting string to char arrays using two methods
        char[] array1 = stringArrayCheck(text);
        char[] array2 = stringArrayCheck2(text);

        // Displaying both arrays
        System.out.println("The array by method1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nThe array by method2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        // Comparing both arrays and displaying result
        if (stringArrayResult(array1, array2)) {
            System.out.println("\nBoth arrays are equal.");
        } else {
            System.out.println("\nBoth arrays are not equal.");
        }
    }
}

