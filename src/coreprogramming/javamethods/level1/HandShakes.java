package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class HandShakes {

    /*
     * This method calculates the total number of possible handshakes
     * among 'n' students.
     *
     * Formula:
     * Handshakes = n × (n − 1) / 2
     *
     * Parameter:
     * - n : number of students
     *
     * Returns:
     * - total number of handshakes
     */
    public static float handShake(int n) {

        // Apply handshake formula
        float combination = (n * (n - 1)) / 2;

        return combination;
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read number of students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // Calculate handshakes
        float handShakes = handShake(n);

        // Display result
        System.out.println("The number of possible handshakes is: " + handShakes);
    }
}
