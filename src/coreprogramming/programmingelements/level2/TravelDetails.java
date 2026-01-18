package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program calculates the total distance traveled
 * and average speed based on travel details provided by the user.
 */
public class TravelDetails {

    public static void main(String[] args) {

        // Taking input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter to city: ");
        String toCity = input.nextLine();

        // Taking distances between cities
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        float fromToVia = input.nextFloat();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        float viaToFinalCity = input.nextFloat();

        // Taking total time taken
        System.out.print("Enter total time taken (in hours): ");
        float time = input.nextFloat();

        // Calculating total distance and average speed
        float totalDistance = fromToVia + viaToFinalCity;
        float speed = totalDistance / time;

        // Displaying the results
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + speed + " miles/hour");
        System.out.println("The results of Int Operations are " + totalDistance + " and " + speed);
    }
}


