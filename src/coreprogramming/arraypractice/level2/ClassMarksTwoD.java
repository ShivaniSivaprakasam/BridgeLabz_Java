/**
 * Program Name: ClassMarksTwoD
 *
 * Description:
 * This program records marks for Physics, Chemistry, and Maths
 * for multiple students using a 2D array, calculates their
 * percentage, and assigns grades based on the percentage.
 *
 * Steps:
 * 1. Input the number of students.
 * 2. Input marks for Physics, Chemistry, and Maths for each student.
 * 3. Validate that all marks are positive; if not, repeat input for that student.
 * 4. Calculate total marks and percentage for each student.
 * 5. Assign grades based on percentage:
 *      >= 80 : A
 *      70-79 : B
 *      60-69 : C
 *      50-59 : D
 *      40-49 : E
 *      < 40  : R (Fail)
 * 6. Display marks, percentage, and grade for each student.
 *
 * Concepts Used:
 * - 2D Arrays
 * - Loops
 * - Conditional statements
 * - Input validation
 * - Formatted output
 */

package coreprogramming.arraypractice.level2;

import java.util.Scanner;

public class ClassMarksTwoD {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting user to enter the number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Declaring a 2D array to store marks of students
        // marks[i][0] = Physics, marks[i][1] = Chemistry, marks[i][2] = Maths
        int[][] marks = new int[students][3];

        // Arrays to store percentage and grade for each student
        double[] percentage = new double[students];
        char[] grade = new char[students];

        // Loop to input marks for each student
        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            // Input Physics marks
            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();

            // Input Chemistry marks
            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();

            // Input Maths marks
            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();

            // Validate that all marks are positive
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--; // Repeat input for this student
            }
        }

        // Loop to calculate percentage and assign grade for each student
        for (int i = 0; i < students; i++) {

            // Calculate total marks
            int total = marks[i][0] + marks[i][1] + marks[i][2];

            // Calculate percentage
            percentage[i] = (total / 300.0) * 100;

            // Assign grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R'; // Fail
            }
        }

        // Display the results for all students
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c%n",
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }

        // Close the scanner object
        input.close();
    }
}
