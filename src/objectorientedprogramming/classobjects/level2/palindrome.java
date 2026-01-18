package objectorientedprogramming.classobjects.level2;
/*
This program checks whether a given string is a palindrome.
It allows a user to:
1. Enter a string.
2. Verify if the string reads the same forwards and backwards.
3. Display the result to the user.
The PalindromeChecker class performs the palindrome check and displays the result.
*/

import java.util.Scanner;
// Created a class palindrome checker
class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    // Method to display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}
// Created a main class called palindrome
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a string: ");
        String userText = input.nextLine();
        PalindromeChecker checker = new PalindromeChecker(userText);
        // Calling method
        checker.displayResult();
    }
}
