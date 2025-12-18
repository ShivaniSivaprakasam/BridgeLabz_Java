package CoreProgramming.ControlFlowPractices.Level2;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int table = 0;
        for ( int i = 6; i <= 9; i++ ){
            table = number * i;
            System.out.println("The multiplication table for the number " +number +" from 6 to 9 is: " +table);
        }
    }
}
