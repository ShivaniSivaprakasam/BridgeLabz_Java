package coreprogramming.programmingelements.level1;

/*
 * This program calculates the volume of the Earth
 * in cubic kilometers and cubic miles.
 */
public class VolumeOfEarth {

    public static void main(String[] args) {

        // Constant value of PI
        final double PI = 3.14;

        // Radius of Earth in kilometers
        double radiusKm = 6378;

        // Converting radius from kilometers to miles
        double radiusMi = 6378 * 1.6;

        /*
         * Calculating volume of Earth in
         * cubic kilometers and cubic miles
         */
        double volumeKm = (4 / 3) * PI * radiusKm;
        double volumeMi = (4 / 3) * PI * radiusMi;

        // Displaying the calculated volumes
        System.out.println("The volume of earth in cubic kilometers is " +
                volumeKm + " km^3 and cubic miles is " + volumeMi + " mi^3.");
    }
}
