package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class ChocolateAndChildren {

    /*
     * This method calculates:
     * 1. How many chocolates each child gets
     * 2. How many chocolates are left after equal distribution
     *
     * Parameters:
     * - numberOfChocolates : total chocolates available
     * - numberOfChildren   : total number of children
     *
     * Returns:
     * - An integer array where:
     *   index 0 -> chocolates each child gets
     *   index 1 -> remaining chocolates
     */
    public static int[] childrenAndChocolate(int numberOfChocolates, int numberOfChildren) {

        // Chocolates each child gets
        int get = numberOfChocolates / numberOfChildren;

        // Chocolates remaining after distribution
        int left = numberOfChocolates % numberOfChildren;

        // Return results as an array
        return new int[]{get, left};
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Take number of children
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Take number of chocolates
        System.out.print("Enter number of chocolate: ");
        int numberOfChocolates = input.nextInt();

        // Call method and store result
        int[] outPut = childrenAndChocolate(numberOfChocolates, numberOfChildren);

        // Display result
        System.out.println(
                "Each child gets " + outPut[0] +
                " chocolates and " + outPut[1] +
                " chocolates are remaining."
        );
    }
}

