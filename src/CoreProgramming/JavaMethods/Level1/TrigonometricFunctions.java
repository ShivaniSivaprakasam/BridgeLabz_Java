package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle){
       double rad = Math.toRadians(angle);
       double sine = Math.sin(rad);
       double cosine = Math.cos(rad);
       double tangent = Math.tan(rad);
       return new double[]{sine,cosine,tangent};
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter angle in degrees: ");
       double angle = input.nextDouble();
       double[] result = calculateTrigonometricFunctions(angle);
       System.out.println("The sine angle: " +result[0]);
       System.out.println("The cosine angle: " +result[1]);
       System.out.println("The tangent angle: " +result[2]);
   }
}
