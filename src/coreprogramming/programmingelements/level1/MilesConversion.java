package coreprogramming.programmingelements.level1;

/*
 * This program converts a fixed distance in kilometers
 * into miles using a constant multiplier.
 */
public class MilesConversion {

    public static void main(String[] args) {

        // Distance in kilometers
        double Km = 10.8;

        // Conversion factor from kilometers to miles
        final double multiplier = 1.6;

        /*
         * Calculating the distance in miles
         * by multiplying kilometers with the multiplier
         */
        double miles = Km * multiplier;

        // Displaying the converted distance
        System.out.println("The distance of " + Km +
                " km in miles is: " + miles + " mi.");
    }
}
