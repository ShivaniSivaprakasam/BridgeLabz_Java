package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class ChocolateAndChildren {
    public static int[] childrenAndChocolate(int numberOfChocolates, int  numberOfChildren ){
       int get = numberOfChocolates / numberOfChildren;
       int left = numberOfChocolates % numberOfChildren;
       return new int[]{get,left};
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number of children: ");
       int numberOfChildren = input.nextInt();
       System.out.print("Enter number of chocolate: ");
       int numberOfChocolates = input.nextInt();
       int[] outPut = childrenAndChocolate(numberOfChocolates,numberOfChildren);
       System.out.println("The number of chocolates received and remaining are: " +outPut[1] +" and " +outPut[0]);
   }

}
