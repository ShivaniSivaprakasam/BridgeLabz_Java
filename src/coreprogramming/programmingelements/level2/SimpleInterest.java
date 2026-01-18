package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program calculates Simple Interest
 * based on the principal amount, interest rate, and time.
 */
public class SimpleInterest {

    public static void main(String[] args) {

        // Taking input for principal amount
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        double principle = input.nextDouble();

        // Taking input for rate of interest
        System.out.print("Enter interest rate: ");
        double rate = input.nextDouble();

        // Taking input for time period
        System.out.print("Enter time:  ");
        double time = input.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principle * rate * time) / 100;

        // Displaying the result
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principle " + principle +
                ", Rate of Interest " + rate +
                " and Time " + time + ".");
    }
}

