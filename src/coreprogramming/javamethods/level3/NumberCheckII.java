package coreprogramming.javamethods.level3;

import java.util.Scanner;

/*
 * NumberCheckII class
 * -------------------
 * This class provides methods to analyze a number in several ways:
 * 1. Count the digits in the number.
 * 2. Convert the number into an array of its digits.
 * 3. Calculate the sum of the digits.
 * 4. Calculate the sum of squares of digits.
 * 5. Check if the number is a Harshad number (divisible by sum of its digits).
 * 6. Determine the frequency of each digit (0-9) in the number.
 *
 * The main method demonstrates these operations by reading a number from the user
 * and displaying all the calculated results.
 */
public class NumberCheckII {

    // Count the number of digits in the number
    public static int digitCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;       // Increment count for each digit
            number /= 10;  // Remove the last digit
        }
        return count;
    }

    // Convert the number into an array of digits
    public static int[] digitArray(int number, int count) {
        int[] digit = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digit[i] = number % 10; // Extract last digit
            number /= 10;            // Remove last digit
        }
        return digit;
    }

    // Calculate the sum of all digits in the array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a; // Add each digit to sum
        }
        return sum;
    }

    // Calculate the sum of squares of all digits in the array
    public static int squareArray(int[] array) {
        int squareSum = 0;
        for (int a : array) {
            squareSum += (int) Math.pow(a, 2); // Add square of each digit
        }
        return squareSum;
    }

    // Check if the number is a Harshad number (divisible by sum of its digits)
    public static boolean harshadNumber(int[] array, int number) {
        int sum = sumArray(array); // Sum of digits
        return number % sum == 0;  // True if divisible
    }

    // Determine the frequency of each digit (0-9) in the number
    public static int[][] digitFrequency(int[] array) {
        int[][] frequency = new int[10][2]; // [digit][0] = digit, [digit][1] = count

        // Initialize frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;   // Digit
            frequency[i][1] = 0;   // Count
        }

        // Count the occurrences of each digit
        for (int a : array) {
            frequency[a][1]++;
        }

        return frequency;
    }

    // Main method to demonstrate all number checks
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt(); // Read number from user

        int count = digitCount(number);        // Count digits
        int[] digit = digitArray(number, count); // Convert number to digit array

        // Check if Harshad number
        System.out.println("Is the number a Harshad number: " + harshadNumber(digit, number));

        // Display sum of squares of digits
        System.out.println("Square sum of number: " + squareArray(digit));

        // Display sum of digits
        System.out.println("Sum of number: " + sumArray(digit));

        // Calculate and display digit frequencies
        int[][] freq = digitFrequency(digit);
        System.out.println("Digit  Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) { // Display only digits present in the number
                System.out.println(freq[i][0] + "        " + freq[i][1]);
            }
        }

        input.close(); // Close scanner to free resources
    }
}
