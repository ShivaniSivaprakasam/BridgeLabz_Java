package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class ArmstrongNumber {

    /* 
     * This program checks whether a given number is an Armstrong number or not.
     * An Armstrong number (also known as narcissistic number) is a number 
     * that is equal to the sum of its digits each raised to the power 
     * of the number of digits in the number.
     * Example: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153
     */
     
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter number: ");
        
        // Read the integer entered by the user
        int N = input.nextInt();
        
        // Calculate the number of digits in the given number
        int length = (int) Math.log10(N) + 1;
        System.out.println("The length of the given number is: " + length);
        
        // Store the original number in a separate variable for comparison
        int original = N;
        System.out.println("The original number is: " + original);
        
        // Initialize sum to store the sum of digits raised to the power of length
        int sum = 0;
        
        // Loop through each digit of the number
        while (N > 0) {
            // Extract the last digit of the number
            int digit = N % 10;
            
            // Raise the digit to the power of length and add it to sum
            sum += Math.pow(digit, length);
            
            // Remove the last digit from the number
            N = N / 10;
        }
        
        // Print the calculated sum
        System.out.println("The sum of the digits raised to power " + length + " is: " + sum);
        
        // Compare sum with the original number to check Armstrong condition
        if (original == sum) {
            System.out.println("The given number is an Armstrong number.");
        } else {
            System.out.println("The given number is not an Armstrong number.");
        }
    }
}
