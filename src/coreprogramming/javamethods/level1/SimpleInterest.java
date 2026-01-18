package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class SimpleInterest {

    /*
     * This method calculates Simple Interest using the formula:
     *
     * Simple Interest (SI) = (Principal × Rate × Time) / 100
     *
     * Parameters:
     * - principal : the initial amount of money
     * - rate      : rate of interest (in percentage)
     * - time      : time period (in years)
     *
     * Returns:
     * - calculated simple interest value
     */
    public static double interest(double principal, double rate, double time) {

        // Apply simple interest formula
        double simpleInterest = (principal * rate * time) / 100;

        // Return calculated interest
        return simpleInterest;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read principal amount
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();

        // Read rate of interest
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();

        // Read time period
        System.out.print("Enter time: ");
        double time = input.nextDouble();

        // Calculate simple interest
        double simpleInterest = interest(principal, rate, time);

        // Display the result
        System.out.println(
                "The simple interest is " + simpleInterest +
                " for the principal " + principal +
                ", rate of interest " + rate +
                " and time " + time
        );
    }
}
