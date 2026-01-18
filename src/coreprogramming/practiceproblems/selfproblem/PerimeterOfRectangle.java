/*
This program calculates the perimeter of a rectangle.
It asks the user to enter the length and width in cm,
computes the perimeter as 2*(length + width), and prints the result.
*/

package coreprogramming.practiceproblems.selfproblem;

import java.util.Scanner; 

public class PerimeterOfRectangle { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter length of the rectangle in cm: "); // Prompt for length
        double length = input.nextDouble(); // Read length as double
        System.out.print("Enter width of the rectangle in cm: "); // Prompt for width
        double width = input.nextDouble(); // Read width as double
        double perimeter = 2 * (length + width); // Calculate perimeter
        System.out.println("Perimeter of the rectangle is: " + perimeter + " cm."); // Display result
    }
}
