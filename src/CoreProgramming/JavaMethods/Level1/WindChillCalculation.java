package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class WindChillCalculation {
    public static double calculateWindChill(double temperature, double windSpeed){
       double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16);
       return windChill;
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter temperature: ");
       double temperature = input.nextDouble();
       System.out.print("Enter windspeed: ");
       double windSpeed = input.nextDouble();
       double result = calculateWindChill(temperature,windSpeed);
       System.out.println("The wind chill was calculated to be: " +result);
   }
}
