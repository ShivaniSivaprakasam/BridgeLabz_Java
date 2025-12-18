package CoreProgramming.JavaMethods.Level2;
import java.util.Scanner;
public class UnitCalculator1 {
    public static double convertKmToMiles(double km){
        double milesConversion = km * 0.621371;
        return milesConversion;
    }
    public static double convertMilesTokm(double miles){
        double kmConversion = miles * 1.60934;
        return kmConversion;
    }
    public static double convertMeterToFeet(double meter){
        double feetConversion = meter * 3.28084;
        return feetConversion;
    }
    public static double convertFeetToMeter(double feet){
        double meterConversion = feet * 0.3048;
        return meterConversion;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter km: ");
        double km = input.nextDouble();
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        System.out.print("Enter meter: ");
        double meter = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        double result1 = convertKmToMiles(km);
        double result2 = convertMilesTokm(miles);
        double result3 = convertMeterToFeet(meter);
        double result4 = convertFeetToMeter(feet);
        System.out.println("The km to miles conversion: " +result1);
        System.out.println("The miles to km conversion: " +result2);
        System.out.println("The meter to feet conversion: " +result3);
        System.out.println("The feet to meter conversion: " +result4);
    }

}
