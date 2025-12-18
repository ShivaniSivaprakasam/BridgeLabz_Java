package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class SimpleInterest {
    public static double interest(double principle, double rate, double time){
        double SI = ( principle * rate * time ) / 100;
        return SI;
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter principle: ");
       double principle = input.nextDouble();
      System.out.print("Enter rate: ");
       double rate = input.nextDouble();
       System.out.print("Enter time: ");
      double time = input.nextDouble();
       double simpleInterest = interest(principle,rate,time);
       System.out.println("The simple interest is " +simpleInterest + " for the principle " +principle +" rate of interest " +rate +" and time " +time);
  }

}
