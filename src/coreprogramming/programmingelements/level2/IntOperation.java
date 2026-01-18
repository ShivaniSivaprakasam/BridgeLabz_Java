package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program performs different arithmetic
 * operations using integer values.
 */
public class IntOperation {

    public static void main(String[] args) {

        // Taking integer input values from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        // Performing arithmetic operations
        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;

        // Displaying the results
        System.out.println("The results of the Int Operations are " +
                operation1 + " , " + operation2 + " , " +
                operation3 + " and " + operation4 + ".");
    }
}
