package coreprogramming.javamethods.level3;

import java.util.Random;

/*
 * SalaryAndBonus class
 * -------------------
 * This class simulates salary and bonus calculation for employees.
 * Features:
 * 1. Generate random employee data: salary and years of service.
 * 2. Calculate bonus based on years of service:
 *    - >5 years: 5% of salary
 *    - ≤5 years: 2% of salary
 * 3. Compute new salary (salary + bonus) and display results.
 * 4. Display total old salary, total bonus, and total new salary.
 */
public class SalaryAndBonus {

    // Generate random salary and years of service for given number of employees
    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] data = new int[numEmployees][2]; // [salary, years]

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; // Salary: 10,000 – 99,999
            data[i][1] = rand.nextInt(10) + 1;        // Years of service: 1 – 10
        }

        return data;
    }

    // Calculate bonus and new salary for each employee
    public static double[][] calculateBonus(int[][] employeeData) {
        int n = employeeData.length;
        double[][] newData = new double[n][2]; // [newSalary, bonus]

        for (int i = 0; i < n; i++) {
            double salary = employeeData[i][0];
            int years = employeeData[i][1];

            // Bonus calculation: 5% if years > 5, else 2%
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;

            newData[i][0] = salary + bonus; // New salary
            newData[i][1] = bonus;          // Bonus
        }

        return newData;
    }

    // Print employee data and summary of salaries and bonuses
    public static void printResults(int[][] employeeData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < employeeData.length; i++) {
            int emp = i + 1;
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            // Display individual employee data
            System.out.println("Employee " + emp + ":");
            System.out.println("  Old Salary: " + oldSalary);
            System.out.println("  Years of Service: " + years);
            System.out.println("  Bonus: " + bonus);
            System.out.println("  New Salary: " + newSalary);
            System.out.println();
        }

        // Display totals
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int numEmployees = 10;                   // Number of employees
        int[][] employeeData = generateEmployeeData(numEmployees); // Generate data
        double[][] newData = calculateBonus(employeeData);         // Calculate bonus & new salary
        printResults(employeeData, newData);                        // Display results
    }
}
