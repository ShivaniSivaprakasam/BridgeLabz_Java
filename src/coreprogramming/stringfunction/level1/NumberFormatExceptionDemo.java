package coreprogramming.stringfunction.level1;

import java.util.Scanner;

/*
 * This program demonstrates handling of NumberFormatException
 * when attempting to convert a non-numeric string to an integer.
 */
public class NumberFormatExceptionDemo {

    /*
     * This method intentionally generates a NumberFormatException
     * by trying to parse a string that may not be a valid number
     */
    public static void generateException(String text) {
        System.out.println("\nGenerating NumberFormatException...");
        int number = Integer.parseInt(text); // May throw exception
        System.out.println("Number: " + number);
    }

    /*
     * This method handles NumberFormatException
     * and prints appropriate messages
     */
    public static void handleException(String text) {
        System.out.println("\nHandling NumberFormatException...");
        try {
            int number = Integer.parseInt(text); // May throw exception
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            // Handling specific NumberFormatException
            System.out.println("Exception caught: NumberFormatException");
            System.out.println("Input text does not contain a valid number");
        } catch (RuntimeException e) {
            // Handling any other RuntimeException
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        // Taking string input from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scan.nextLine();

        // Calling method that may generate exception
        generateException(text);

        // Calling method with proper exception handling
        handleException(text);
    }
}


