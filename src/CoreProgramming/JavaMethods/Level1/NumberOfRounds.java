package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class NumberOfRounds {
    public static float rounds( float side1, float side2, float side3){
       float perimerter = side1 + side2 + side3;
       float rounds = 5 / perimerter;
       return rounds;
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter frst side: ");
       float side1 = input.nextFloat();
       System.out.print("Enter second side: ");
       float side2 = input.nextFloat();
       System.out.print("Enter third side: ");
       float side3 = input.nextFloat();
       float runningRounds = rounds(side1,side2,side3);
       System.out.println("The number of rounds needed to do to complete a 5 km round: " +runningRounds);
    }
}
