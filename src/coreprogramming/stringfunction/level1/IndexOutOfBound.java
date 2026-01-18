package coreprogramming.stringfunction.level1;

import java.util.Scanner;

/*
 * This program demonstrates handling of StringIndexOutOfBoundsException
 * when accessing a character at an invalid index in a string.
 */
public class IndexOutOfBound {

    /*
     * This method intentionally accesses an invalid index
     * to generate StringIndexOutOfBoundsException
     */
    public static void exceptionMethod(String text) {
        char ch = text.charAt(text.length()); // This will throw exception
        System.out.println(ch);
    }

    /*
     * This method handles StringIndexOutOfBoundsException
     * and prints an appropriate message
     */
    public static void handleException(String text) {
        try {
            char ch = text.charAt(text.length()); // May throw exception
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            // Handling invalid index access
            System.out.println("Invalid index accessed");
        }
    }

    public static void main(String[] args) {

        // Taking string input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Calling method that may throw an exception
        exceptionMethod(text);

        // Calling method with proper exception handling
        handleException(text);
    }
}

