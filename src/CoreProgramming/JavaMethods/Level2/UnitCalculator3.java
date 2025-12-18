package CoreProgramming.JavaMethods.Level2;
import java.util.Scanner;
public class UnitCalculator3 {
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double celsiusConversion = (farhenheit - 32) * 5 / 9;
        return celsiusConversion;
    }
    public static double convertCelsiusToFarhenheit(double celsius) {
        double farhenheitConversion = (celsius * 9 / 5) + 32;
        return farhenheitConversion;
    }
    public static double convertPondsToKilograms(double pound){
        double kilogramConversion = pound*0.453592;
        return kilogramConversion;
    }
    public static double convertKilogramsToPounds(double km){
        double poundsConversion = km*2.20462;
        return poundsConversion;
    }
    public static double convertGallonsToLiters(double gallon ){
        double literConversion = gallon*3.78541;
        return literConversion;
    }
    public static double convertLitersToGallon(double liters){
        double gallonConversion = liters*0.264172;
        return gallonConversion;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in farhenheit: ");
        double farhenheit = input.nextDouble();
        System.out.print("Enter temperature in celsius: ");
        double celsius = input.nextDouble();
        System.out.print("Enter wight in pound: ");
        double pound = input.nextDouble();
        System.out.print("Enter weight in km: ");
        double km = input.nextDouble();
        System.out.print("Enter quantity in gallon: ");
        double gallon = input.nextDouble();
        System.out.print("Enter quantity in liters: ");
        double liters = input.nextDouble();
        double result1 = convertFarhenheitToCelsius(farhenheit);
        double result2 = convertCelsiusToFarhenheit(celsius);
        double result3 = convertPondsToKilograms(pound);
        double result4 = convertKilogramsToPounds(km);
        double result5 = convertGallonsToLiters(gallon );
        double result6 = convertLitersToGallon(liters);
        System.out.println("The distance unit conversion results are: " +result1 +" , " +result2 +" ,  " +result3 +" , " +result4 +" , " +result5 +" and " +result6 +".");
    }
}