package coreprogramming.stringfunction.level1;

import java.util.Scanner;

/*
 * This program demonstrates handling of exceptions
 * when using the substring() method on a string.
 */
public class ArgumentException {

    /*
     * This method attempts to extract a substring
     * with invalid indices and may throw an exception.
     */
    public static void exceptionMethod(String text) {
        String result = text.substring(5, 2); // This will throw IllegalArgumentException
        System.out.println(result);
    }

    /*
     * This method handles exceptions that occur
     * when using substring() with invalid indices.
     */
    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2); // May throw exception
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            // Handling specific IllegalArgumentException
            System.out.println("Exception caught: IllegalArgumentException");
            System.out.println("Start index cannot be greater than end index");
        } catch (RuntimeException e) {
            // Handling any other RuntimeException
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        // Taking string input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = input.nextLine();

        // Calling method that may throw an exception
        exceptionMethod(text);

        // Calling method with proper exception handling
        handleException(text);
    }
}

