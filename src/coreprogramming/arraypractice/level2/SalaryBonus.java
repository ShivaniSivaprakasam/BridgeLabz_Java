/**
 * Program Name: SalaryBonus
 *
 * Description:
 * This program calculates bonuses for 10 employees based on their years of service.
 * It computes the new salary for each employee, and also calculates total old salary,
 * total bonus payout, and total new salary.
 *
 * Steps:
 * 1. Input salary and years of service for 10 employees.
 * 2. Validate input (salary must be positive, service cannot be negative).
 * 3. Compute bonus:
 *    - If years of service > 5, bonus = 5% of salary
 *    - Else, bonus = 2% of salary
 * 4. Calculate new salary = old salary + bonus.
 * 5. Accumulate totals for old salary, bonus payout, and new salary.
 * 6. Display total old salary, total bonus, and total new salary.
 *
 * Concepts Used:
 * - Arrays
 * - Loops
 * - Conditional statements
 * - Accumulation of totals
 * - Input validation
 * - Scanner for user input
 */

package coreprogramming.arraypractice.level2;

import java.util.Scanner;

public class SalaryBonus {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Number of employees
        int n = 10;

        // Arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[n];
        double[] service = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input salary and service for each employee
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            // Input salary
            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            // Input years of service
            System.out.print("Enter years of service: ");
            service[i] = sc.nextDouble();

            // Validate input
            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // Repeat input for this employee
                continue;
            }
        }

        // Calculate bonus and new salary for each employee
        for (int i = 0; i < n; i++) {

            // Bonus calculation based on service
            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Accumulate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display totals
        System.out.println("Total Old Salary: ₹" + totalOldSalary);
        System.out.println("Total Bonus Payout: ₹" + totalBonus);
        System.out.println("Total New Salary: ₹" + totalNewSalary);

        // Close the scanner
        sc.close();
    }
}
