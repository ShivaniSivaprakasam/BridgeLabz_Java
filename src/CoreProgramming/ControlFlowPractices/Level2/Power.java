package CoreProgramming.ControlFlowPractices.Level2;
import java.util.Scanner;
public class Power {
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
        for (int i = 1; i <= power; i++) {
            result = number * result;
        }
        System.out.println(result);
    }
}
