package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class YoungestFriend {

    /**
     * Method to find the youngest friend based on ages
     *  amarAge age of Amar
     *  akbarAge age of Akbar
     *  anthonyAge age of Anthony
     *  age of the youngest friend, or 0 if a tie
     */
    public static int youngestFriend(int amarAge, int akbarAge, int anthonyAge) {
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            return amarAge;
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            return akbarAge;
        } else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            return anthonyAge;
        } else {
            return 0; // Tie between two or more friends
        }
    }

    /**
     * Method to find the tallest friend based on heights
     *  amarHeight height of Amar
     *  akbarHeight height of Akbar
     * anthonyHeight height of Anthony
     *  height of the tallest friend, or 0 if a tie
     */
    public static float tallestFriend(float amarHeight, float akbarHeight, float anthonyHeight) {
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            return amarHeight;
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            return akbarHeight;
        } else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            return anthonyHeight;
        } else {
            return 0; // Tie between two or more friends
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        System.out.print("Enter Amar's height: ");
        float amarHeight = input.nextFloat();
        System.out.print("Enter Akbar's height: ");
        float akbarHeight = input.nextFloat();
        System.out.print("Enter Anthony's height: ");
        float anthonyHeight = input.nextFloat();

        // Calling methods
        int youngest = youngestFriend(amarAge, akbarAge, anthonyAge);
        float tallest = tallestFriend(amarHeight, akbarHeight, anthonyHeight);

        // Displaying results
        if (youngest != 0) {
            System.out.println("The youngest friend is: " + youngest);
        } else {
            System.out.println("There is a tie for the youngest friend.");
        }

        if (tallest != 0) {
            System.out.println("The tallest friend is: " + tallest);
        } else {
            System.out.println("There is a tie for the tallest friend.");
        }
    }
}
