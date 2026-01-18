/**
 * Program Name: FizzBuzz
 *
 * Description:
 * This program implements the classic FizzBuzz logic using an array.
 * It takes a number as input from the user and stores results from
 * 1 to that number in a String array.
 *
 * Rules:
 * - If a number is divisible by both 3 and 5, store "FizzBuzz"
 * - If divisible only by 3, store "Fizz"
 * - If divisible only by 5, store "Buzz"
 * - Otherwise, store the number itself as a String
 *
 * The program then prints the result position-wise and as a full array.
 */

package coreprogramming.arraypractice.level1;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");

        // Reading the input number
        int number = input.nextInt();

        // Creating a String array to store FizzBuzz results
        // Size is number + 1 to match index with number position
        String[] fizzBuzz = new String[number + 1];

        // Looping from 1 to the entered number
        for (int i = 1; i <= number; i++) {

            // Checking if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {

                // Assigning "FizzBuzz" for numbers divisible by 3 and 5
                fizzBuzz[i] = "FizzBuzz";
            }
            // Checking if the number is divisible only by 3
            else if (i % 3 == 0) {

                // Assigning "Fizz" for numbers divisible by 3
                fizzBuzz[i] = "Fizz";
            }
            // Checking if the number is divisible only by 5
            else if (i % 5 == 0) {

                // Assigning "Buzz" for numbers divisible by 5
                fizzBuzz[i] = "Buzz";
            }
            else {

                // Converting the number to String and storing it
                fizzBuzz[i] = String.valueOf(i);
            }
        }

        // Printing the FizzBuzz result with position information
        System.out.print("The result is: ");

        // Loop to display each position and its corresponding value
        for (int i = 1; i <= number; i++) {

            // Displaying index position and stored value
            System.out.println("Position " + i + " = " + fizzBuzz[i]);
        }

        // Printing the complete result array in a single line
        System.out.print("The result array is: ");

        // Loop to print all elements of the array
        for (int i = 1; i <= number; i++) {

            // Printing array element
            System.out.print(fizzBuzz[i] + " ");
        }

    }
}
