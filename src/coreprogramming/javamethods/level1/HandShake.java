package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class HandShake {

    /*
     * This method calculates the total number of possible handshakes
     * when 'n' people are present.
     *
     * Formula used:
     * Handshakes = n * (n - 1) / 2
     *
     * Parameter:
     * - n : number of students
     *
     * Returns:
     * - total number of possible handshakes
     */
    public static float handShake(int n) {

        // Calculate combinations using handshake formula
        float combination = (n * (n - 1)) / 2;

        return combination;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Take number of students as input
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // Call the handshake method
        float handShakes = handShake(n);

        // Display result
        System.out.println("The number of possible handshakes is: " + handShakes);
    }
}
