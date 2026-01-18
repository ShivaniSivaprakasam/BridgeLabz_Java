package coreprogramming.javamethods.level2;

import java.util.Scanner;

/*
 * YoungestAndTallestFriend class
 * -------------------------------
 * This class determines:
 * 1. The youngest friend among Amar, Akbar, and Anthony based on age.
 * 2. The tallest friend among Amar, Akbar, and Anthony based on height.
 * 
 * It contains two methods:
 * - youngestFriend(int, int, int): Returns the name of the youngest friend.
 * - tallestFriend(float, float, float): Returns the name of the tallest friend.
 * 
 * The main method reads ages and heights from the user and prints the results.
 */
public class YoungestAndTallestFriend {

    // Method to find the youngest friend based on age
    public static String youngestFriend(int amarAge, int akbarAge, int anthonyAge) {
        if (amarAge < akbarAge && amarAge < anthonyAge) { // Amar is younger than both
            return "Amar";
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) { // Akbar is younger than both
            return "Akbar";
        } else if (anthonyAge < amarAge && anthonyAge < akbarAge) { // Anthony is younger than both
            return "Anthony";
        } else { // If two or more friends have the same youngest age
            return "Same age";
        }
    }

    // Method to find the tallest friend based on height
    public static String tallestFriend(float amarHeight, float akbarHeight, float anthonyHeight) {
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) { // Amar is taller than both
            return "Amar";
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) { // Akbar is taller than both
            return "Akbar";
        } else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) { // Anthony is taller than both
            return "Anthony";
        } else { // If two or more friends have the same tallest height
            return "Same height";
        }
    }

    // Main method to read ages and heights from user and display results
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object for input

        // Read ages of the three friends
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Read heights of the three friends
        System.out.print("Enter Amar's height: ");
        float amarHeight = input.nextFloat();

        System.out.print("Enter Akbar's height: ");
        float akbarHeight = input.nextFloat();

        System.out.print("Enter Anthony's height: ");
        float anthonyHeight = input.nextFloat();

        // Find youngest and tallest friends using the methods
        String youngest = youngestFriend(amarAge, akbarAge, anthonyAge);
        String tallest = tallestFriend(amarHeight, akbarHeight, anthonyHeight);

        // Print the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
