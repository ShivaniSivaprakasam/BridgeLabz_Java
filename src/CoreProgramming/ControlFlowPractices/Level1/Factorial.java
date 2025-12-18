package CoreProgramming.ControlFlowPractices.Level1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while (number <= 0){
            System.out.print("Enter a positive non-zero number: ");
            number = input.nextInt();
        }
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }
}
