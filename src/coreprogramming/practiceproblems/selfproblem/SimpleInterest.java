package coreprogramming.practiceproblems.selfproblem;

import java.util.Scanner;

/**
 * This program calculates the simple interest.
 * It prompts the user to enter the principal amount, interest rate, and time (in years),
 * then computes the simple interest using the formula (P * R * T) / 100 and displays the result.
 */
public class SimpleInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter principal amount (Rupees): ");
        double principal = scanner.nextDouble(); // Principal amount

        System.out.print("Enter interest rate (% per annum): ");
        double rate = scanner.nextDouble(); // Annual interest rate

        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble(); // Time period in years

        double simpleInterest = (principal * rate * time) / 100; // Calculate simple interest

        System.out.printf("Simple interest is: Rupees %.2f%n", simpleInterest); // Display result
    }
}
