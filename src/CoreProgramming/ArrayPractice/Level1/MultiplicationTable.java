package CoreProgramming.ArrayPractice.Level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for which the multiplication table array is needed: ");
        int number = input.nextInt();
        int[] multiplicationResult = new int[10];
        for ( int i = 1; i <= 10; i++ ) {
            multiplicationResult[i - 1] = number * i;
        }
       for ( int i = 1; i <= 10; i++ ){
           System.out.print(multiplicationResult[i - 1] + " ");
       }
    }
}
