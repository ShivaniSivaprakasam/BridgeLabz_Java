package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    /*
     * This method calculates the sum of the first N natural numbers.
     *
     * Parameter:
     * - N : a positive integer
     *
     * Returns:
     * - sum of natural numbers from 1 to N
     */
    public static int naturalSum(int N) {

        int sum = 0;

        // Loop from 1 to N and add each number
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter number: ");
        int N = input.nextInt();

        // Calculate the sum of natural numbers
        int sumNumber = naturalSum(N);

        // Display the result
        System.out.println("The sum of " + N + " natural numbers is: " + sumNumber);
    }
}
