package coreprogramming.stringfunction.level3;

import java.util.Scanner;

/*
 * This program calculates BMI for a team of 10 people.
 * It outputs each person's BMI along with their weight, height, and status.
 */
public class BMI {

    // Calculate BMI and return weight, height, BMI value, and status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert height to meters
        double bmi = weight / (heightM * heightM); // BMI formula
        String status;

        // Determine BMI status
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.format("%.2f", weight),
                String.format("%.2f", heightCm),
                String.format("%.2f", bmi),
                status
        };
    }

    // Process BMI for the whole team
    public static String[][] processTeam(double[][] teamData) {
        String[][] result = new String[teamData.length][4];

        for (int i = 0; i < teamData.length; i++) {
            result[i] = calculateBMI(teamData[i][0], teamData[i][1]);
        }

        return result;
    }

    // Display results in a table format
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[1], row[0], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][2];

        // Input data for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

        // Process and display results
        String[][] result = processTeam(teamData);
        displayResults(result);
    }
}

