package coreprogramming.stringfunction.level1;

import java.util.Scanner;

/*
 * This program demonstrates handling of ArrayIndexOutOfBoundsException
 * when accessing elements outside the bounds of an array.
 */
public class ArrayIndexOutOfBoundsExceptionDemo {

    /*
     * This method intentionally generates an ArrayIndexOutOfBoundsException
     * by accessing an index equal to the array length.
     */
    public static void generateException(String[] names) {
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        String name = names[names.length]; // This will throw exception
        System.out.println(name);
    }

    /*
     * This method handles the ArrayIndexOutOfBoundsException
     * and prints appropriate messages.
     */
    public static void handleException(String[] names) {
        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");
        try {
            String name = names[names.length]; // May throw exception
            System.out.println(name);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling specific ArrayIndexOutOfBoundsException
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
            System.out.println("Array index accessed is out of range");
        } catch (RuntimeException e) {
            // Handling any other RuntimeException
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        // Taking input for array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = scan.nextInt();
        scan.nextLine(); // Consume newline

        // Creating array and taking names input
        String[] names = new String[size];
        System.out.print("Enter the names: ");
        for (int i = 0; i < size; i++) {
            names[i] = scan.nextLine();
        }

        // Generating exception intentionally
        generateException(names);

        // Handling exception properly
        handleException(names);
    }
}


