package CoreProgramming.ControlFlowPractices.Level2;
import  java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while ( number > 100 ){
            System.out.print("Enter a number less than 100: ");
            number = input.nextInt();
        }
        for ( int i = 1; i <= 100; i++){
            if ( number % i == 0){
                System.out.println(i);
            }
        }
    }
}

