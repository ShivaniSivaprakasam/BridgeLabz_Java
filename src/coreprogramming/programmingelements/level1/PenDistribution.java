package coreprogramming.programmingelements.level1;

/*
 * This program calculates how many pens each student gets
 * and how many pens remain undistributed.
 */
public class PenDistribution {

    public static void main(String[] args) {

        // Total number of pens available
        int totalPens = 14;

        // Total number of students
        int totalStudents = 3;

        // Calculating pens per student using integer division
        int penDistribution = totalPens / totalStudents;

        // Calculating remaining pens using modulus operator
        int remainder = totalPens % totalStudents;

        // Displaying the result
        System.out.println("The Pen per student is " + penDistribution +
                " and the remaining pen not distributed is " + remainder + ".");
    }
}
