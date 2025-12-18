package CoreProgramming.JavaMethods.Level2;
import java.util.Scanner;
public class UnitCalculator2 {
    public static double convertYardsToFeet(double yards){
        double feetConversion = yards*3;
        return feetConversion;
    }
    public static double convertFeetToYards(double feet){
        double yardsConversion = feet*0.333333;
        return yardsConversion;
    }
    public static double convertMeterToInches(double meter){
        double inchConversion = meter*39.3701;
        return inchConversion;
    }
    public static double convertInchesToMeter(double inch){
        double meterConversion = inch*0.0254;
        return meterConversion;
    }
    public static double convertInchesToCm(double inch ){
        double cmConversion = inch*2.54;
        return cmConversion;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in yards: ");
        double yards = input.nextDouble();
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter distance in meters: ");
        double meter = input.nextDouble();
        System.out.print("Enter distance in inch: ");
        double inch = input.nextDouble();
        double result1 = convertYardsToFeet(yards);
        double result2 = convertFeetToYards(feet);
        double result3 = convertMeterToInches(meter);
        double result4 = convertInchesToMeter(inch);
        double result5 = convertInchesToCm(inch);
        System.out.println("The distance unit conversion results are: " +result1 +" , " +result2 +" ,  " +result3 +" , " +result4 +" and " +result5 +".");
    }
}
