package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor){
       int quotient = number / divisor;
       int remainder = number % divisor;
       return new int[]{quotient,remainder};
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number: ");
       int number = input.nextInt();
       System.out.print("Enter divisor: ");
       int divisor = input.nextInt();
       int[] outPut = findRemainderAndQuotient(number,divisor);
       System.out.println("The quotient and remainder are: " +outPut[0] +" and " +outPut[1]);
   }

}
