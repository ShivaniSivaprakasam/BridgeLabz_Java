/**
 * Program Name: ClassMarks
 *
 * Description:
 * This program records marks for Physics, Chemistry, and Maths
 * for multiple students and calculates their percentage and grade.
 *
 * Steps:
 * 1. Take number of students as input.
 * 2. Input marks for each student in Physics, Chemistry, and Maths.
 * 3. Validate marks to ensure positive values.
 * 4. Calculate total marks and percentage for each student.
 * 5. Assign grade based on percentage:
 *      >= 80 : A
 *      70-79 : B
 *      60-69 : C
 *      50-59 : D
 *      40-49 : E
 *      < 40  : R (Fail)
 * 6. Display marks, percentage, and grade for each student.
 *
 * Concepts Used:
 * - Arrays
 * - Loops
 * - Conditional statements
 * - Input validation
 * - Formatted output
 */

package coreprogramming.arraypractice.level2;

import java.util.Scanner;

public class ClassMarks {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting user to enter number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Declaring arrays to store marks in each subject, percentage, and grade
        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] maths = new int[students];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        // Loop to input marks for each student
        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            // Input Physics marks
            System.out.print("Physics: ");
            physics[i] = input.nextInt();

            // Input Chemistry marks
            System.out.print("Chemistry: ");
            chemistry[i] = input.nextInt();

            // Input Maths marks
            System.out.print("Maths: ");
            maths[i] = input.nextInt();

            // Validate that marks are positive
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--; // Repeat input for this student
            }
        }

        // Loop to calculate percentage and grade for each student
        for (int i = 0; i < students; i++) {

            // Total marks for the student
            int total = physics[i] + chemistry[i] + maths[i];

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

        // Display marks, percentage, and grade for each student
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c%n",
                    physics[i],
                    chemistry[i],
                    maths[i],
                    percentage[i],
                    grade[i]);
        }

        // Close the scanner object
        input.close();
    }
}
