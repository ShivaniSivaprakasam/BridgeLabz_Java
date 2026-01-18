package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/*
 * This program calculates the number of possible handshakes
 * among a given number of students.
 */
public class HandShake {

    public static void main(String[] args) {

        // Taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculating handshakes using formula n(n-1)/2
        float combination = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying the result
        System.out.println("The number of possible handshakes is: " + combination);
    }
}
