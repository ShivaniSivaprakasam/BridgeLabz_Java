package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class Bonus {

    /*
     * This program calculates a bonus for an employee based on years of service.
     * If the employee has more than 5 years of service, they receive 5% of their salary as a bonus.
     * Otherwise, no bonus is given.
     */

    public static void main(String[] args) {

        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the salary
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Prompting the user to enter years of service
        System.out.print("Enter years of service: ");
        double years = input.nextDouble();

        // Checking if the employee is eligible for a bonus
        if (years > 5) {

            // Calculating 5% of salary as bonus
            double bonus = (salary * 5) / 100;

            // Displaying the bonus
            System.out.println("The bonus received is: " + bonus);
        } else {

            // Informing that no bonus is given
            System.out.println("No bonus.");
        }
    }
}
