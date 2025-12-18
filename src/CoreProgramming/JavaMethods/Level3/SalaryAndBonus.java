package CoreProgramming.JavaMethods.Level3;
import java.util.Random;
public class SalaryAndBonus {

    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] data = new int[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = rand.nextInt(90000) + 10000;
            data[i][1] = rand.nextInt(10) + 1;
        }

        return data;
    }

    public static double[][] calculateBonus(int[][] employeeData) {
        int n = employeeData.length;
        double[][] newData = new double[n][2];

        for (int i = 0; i < n; i++) {
            double salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;
            newData[i][0] = salary + bonus;
            newData[i][1] = bonus;
        }

        return newData;
    }

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

            System.out.println("Employee " + emp + ":");
            System.out.println("  Old Salary: " + oldSalary);
            System.out.println("  Years of Service: " + years);
            System.out.println("  Bonus: " + bonus);
            System.out.println("  New Salary: " + newSalary);
            System.out.println();
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] newData = calculateBonus(employeeData);
        printResults(employeeData, newData);
    }
}

