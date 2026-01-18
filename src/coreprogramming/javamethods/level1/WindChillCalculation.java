package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class WindChillCalculation {

    /*
     * This method calculates the wind chill temperature
     * using the standard wind chill formula.
     *
     * Parameters:
     * - temperature : air temperature in Fahrenheit
     * - windSpeed   : wind speed in miles per hour
     *
     * Returns:
     * - calculated wind chill value
     */
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74
                + (0.6215 * temperature)
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Read temperature and wind speed from user
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = input.nextDouble();

        // Calculate wind chill
        double result = calculateWindChill(temperature, windSpeed);

        // Display result
        System.out.println("The calculated wind chill is: " + result);
    }
}
