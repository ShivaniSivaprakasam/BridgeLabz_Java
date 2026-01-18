package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program checks voting eligibility of students based on their ages.
 * It takes age input from the user and determines if the student can vote (age >= 18).
 */
public class VotingEligibility {

    /*
     * Method to get the ages of students from the user
     * @param n Number of students
     * @param sc Scanner object for input
     * @return array of student ages
     */
    public static int[] getStudentAges(int n, Scanner sc) {
        int[] ages = new int[n];

        // Loop to take age input for each student
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    /*
     * Method to check voting eligibility for each student
     * @param ages Array of student ages
     * @return 2D array with age and eligibility status ("true"/"false")
     */
    public static String[][] checkVotingEligibility(int[] ages) {
        int n = ages.length;
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            result[i][0] = String.valueOf(ages[i]); // Store the age as string

            // Determine eligibility
            if (ages[i] < 0) { // Invalid age
                result[i][1] = "false";
            } else if (ages[i] >= 18) { // Eligible to vote
                result[i][1] = "true";
            } else { // Not eligible to vote
                result[i][1] = "false";
            }
        }
        return result;
    }

    /*
     * Method to display the voting eligibility table
     * @param data 2D array containing age and eligibility
     */
    public static void displayResult(String[][] data) {
        System.out.println("\nAge\tCan Vote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 10; // Total number of students

        // Get ages from user
        int[] ages = getStudentAges(numberOfStudents, sc);

        // Check voting eligibility
        String[][] votingStatus = checkVotingEligibility(ages);

        // Display the results
        displayResult(votingStatus);
    }
}


