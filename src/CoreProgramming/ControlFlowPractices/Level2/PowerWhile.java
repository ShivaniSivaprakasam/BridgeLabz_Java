package CoreProgramming.ControlFlowPractices.Level2;
import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        System.out.print("Enter a power: ");
        int power = scan.nextInt();
        while (number < 0) {
            System.out.print("Enter a positive number: ");
            number = scan.nextInt();
        }
        int result = 1;
        int counter = 0;
        while ( counter < power ){
            result = number * result;
            counter++;
        }
        System.out.println(result);
    }
}