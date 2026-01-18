package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program calculates the length of a string using two methods:
 * 1. Manually by counting characters
 * 2. Using the built-in length() method
 */
public class StringLength {

    /*
     * Calculates string length manually without using built-in methods
     */
    public static int stringLen(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count); // Access each character until exception occurs
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e){
            // Reached the end of the string
        }
        return count;
    }

    /*
     * Calculates string length using the built-in length() method
     */
    public static int stringLen2(String text){
        return text.length();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Calculate length using both methods
        int result1  = stringLen(text);
        int result2  = stringLen2(text);

        // Display results
        System.out.println("The length of string without using in-built method: " + result1);
        System.out.println("The length of string by using in-built method: " + result2);
    }
}

