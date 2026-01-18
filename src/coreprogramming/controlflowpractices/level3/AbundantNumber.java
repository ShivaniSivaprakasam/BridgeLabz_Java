package coreprogramming.controlflowpractices.level3;
import java.util.Scanner;
/*
 * Checks if a number is abundant:
 * 1. Input a positive number.
 * 2. Sum all its proper divisors (1 to N-1).
 * 3. If sum > number, it's abundant; else not.
 */
public class AbundantNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int N = input.nextInt();
        int original = N;
        // Setting condition to get a positive number
        while (N < 0) {
            System.out.print("Enter a positive integer: ");
            N = input.nextInt();
        }
        int sum = 0;
        // Setting loop to get sum 
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of divisors: " + sum);
        // Checking the condition
        if (sum > original) {
            System.out.println("The given number is an abundant number");
        } else {
            System.out.println("The given number is not an abundant number");
        }
    }
}



