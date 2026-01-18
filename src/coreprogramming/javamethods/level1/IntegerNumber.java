package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class IntegerNumber {

    /*
     * This method checks whether the given number is
     * positive, negative, or zero.
     *
     * Parameter:
     * - number : an integer value entered by the user
     */
    public static void integerNum(int number) {

        if (number > 0) {
            System.out.println("The number entered is positive.");
        } 
        else if (number < 0) {
            System.out.println("The number entered is negative.");
        } 
        else {
            System.out.println("The number entered is zero.");
        }
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Read integer from user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check the number type
        integerNum(number);
    }
}
