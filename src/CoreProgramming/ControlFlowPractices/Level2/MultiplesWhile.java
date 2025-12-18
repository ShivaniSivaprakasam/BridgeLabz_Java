package CoreProgramming.ControlFlowPractices.Level2;
import  java.util.Scanner;
public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while ( number > 100 || number < 0 ) {
            System.out.print("Enter a number less than 100 and should also be positive: ");
            number = input.nextInt();
        }
        int counter = number - 1;
        while (counter > 1) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
