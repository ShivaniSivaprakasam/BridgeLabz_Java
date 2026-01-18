package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class LargestNumber {

    /*
     * This program determines the largest of three numbers entered by the user.
     * It also handles the case where two or more numbers are equal.
     * The program demonstrates user input, conditional statements (if-else), and comparison operators in Java.
     */

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Compare the numbers to determine the largest
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number " + number1 + " the largest? Yes");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number " + number2 + " the largest? Yes");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number " + number3 + " the largest? Yes");
        } else {
            // Handles cases where two or more numbers are equal
            System.out.println("Out of the three entered numbers, more than one number are equal.");
        }
    }
}
