package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program performs different arithmetic
 * operations using double values.
 */
public class DoubleOpt {

    public static void main(String[] args) {

        // Taking input values from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        System.out.print("Enter third number: ");
        double c = input.nextDouble();

        // Performing arithmetic operations
        double operation1 = a + b * c;
        double operation2 = a * b + c;
        double operation3 = c + a / b;
        double operation4 = a % b + c;

        // Displaying the results
        System.out.println("The results of the Int Operations are " +
                operation1 + " , " + operation2 + " , " +
                operation3 + " and " + operation4 + ".");
    }
}

