package coreprogramming.javamethods.level3;

import java.util.Scanner;

/*
 * NumberCheckI class
 * ------------------
 * This class provides methods to analyze a given number:
 * 1. Count the digits in the number.
 * 2. Store the digits in an array.
 * 3. Check if the number is a Duck Number (contains at least one zero, but not leading zero).
 * 4. Check if the number is an Armstrong Number (sum of its digits raised to power of digit count equals the number itself).
 * 5. Find the largest and second largest digit.
 * 6. Find the smallest and second smallest digit.
 * 
 * The main method reads a number from the user, uses the above methods,
 * and displays the results.
 */
public class NumberCheckI {

    // Count the number of digits in a number
    public static int digitCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;         // Increment count for each digit
            number /= 10;    // Remove last digit
        }
        return count;
    }

    // Convert the number into an array of its digits
    public static int[] digitArray(int count, int number) {
        int[] digit = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digit[i] = number % 10; // Extract last digit
            number /= 10;            // Remove last digit
        }
        return digit;
    }

    // Check if the number is a Duck Number (contains zero)
    public static boolean duckNumber(int[] digit) {
        for (int d : digit) {
            if (d == 0) { // If any digit is zero, it's a Duck Number
                return true;
            }
        }
        return false;
    }

    // Check if the number is an Armstrong Number
    public static boolean armstrongNumber(int[] digit, int number) {
        int sum = 0;
        int power = digit.length; // Power is the number of digits
        for (int d : digit) {
            sum += (int) Math.pow(d, power); // Sum of each digit raised to power
        }
        return sum == number; // True if sum equals original number
    }

    // Find the largest and second largest digits in the number
    public static int[] largestElement(int[] digit) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digit) {
            if (d > largest) {
                secondLargest = largest; // Previous largest becomes second largest
                largest = d;             // Update largest
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;       // Update second largest
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Find the smallest and second smallest digits in the number
    public static int[] smallestElement(int[] digit) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digit) {
            if (d < smallest) {
                secondSmallest = smallest; // Previous smallest becomes second smallest
                smallest = d;              // Update smallest
            } else if (d > smallest && d < secondSmallest) {
                secondSmallest = d;        // Update second smallest
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to demonstrate all number checks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt(); // Read number from user

        int count = digitCount(number);       // Count digits
        int[] digits = digitArray(count, number); // Convert to array

        // Check Duck Number
        System.out.println("Duck Number: " + duckNumber(digits));

        // Check Armstrong Number
        System.out.println("Armstrong Number: " + armstrongNumber(digits, number));

        // Find and display largest and second largest digits
        int[] max = largestElement(digits);
        System.out.println("Largest: " + max[0] + ", Second Largest: " + max[1]);

        // Find and display smallest and second smallest digits
        int[] min = smallestElement(digits);
        System.out.println("Smallest: " + min[0] + ", Second Smallest: " + min[1]);
    }
}
