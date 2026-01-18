package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program calculates how many chocolates
 * each child gets and how many remain undistributed.
 */
public class Chocolate {

    /*
     * This method divides chocolates among children
     * and prints the result.
     */
    public static void divideChocolates(int numberOfChocolates, int numberOfChildren) {

        // Calculating chocolates each child gets
        int eachChildGets = numberOfChocolates / numberOfChildren;

        // Calculating remaining chocolates
        int remaining = numberOfChocolates % numberOfChildren;

        // Displaying the result
        System.out.println("The number of chocolates each child gets is " +
                eachChildGets + " and the number of remaining chocolates are " +
                remaining + ".");
    }

    public static void main(String[] args) {

        // Taking input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Calling method to divide chocolates
        divideChocolates(numberOfChocolates, numberOfChildren);
    }
}
