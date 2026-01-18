package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Setting loop to check for divisibility
        if ( number % 5 == 0){
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        }
        else{
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
    }
}
