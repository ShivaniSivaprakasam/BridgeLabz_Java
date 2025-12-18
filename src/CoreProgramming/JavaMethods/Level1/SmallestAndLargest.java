package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class SmallestAndLargest {
    public static int[] findSmallestAndLargest( int num1, int num2, int num3 ){
       int smallest = num1;
       int largest = num1;
       if (num2 < smallest) {
           smallest = num2;
       }
       if (num3 < smallest) {
           smallest = num3;
       }
       if (num2 > largest) {
           largest = num2;
       }
       if (num3 > largest) {
           largest = num3;
       }
       return new int[]{smallest, largest};
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number 1: ");
       int num1 = input.nextInt();
       System.out.print("Enter number 2: ");
       int num2 = input.nextInt();
       System.out.print("Enter number 3: ");
       int num3 = input.nextInt();
       int[] result = findSmallestAndLargest(num1,num2,num3);
       System.out.println("The largest number and smallest number are: " +result[1] +" and " +result[0]);
   }

}
