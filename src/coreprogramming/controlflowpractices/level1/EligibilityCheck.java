package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter age: ");
        int age = input.nextInt();
        // While loop to prevent user from entering invalid age
        while ( age <= 0 ){
            System.out.print("Please enter a valid age: ");
            age = input.nextInt();
        }
        // Setting if loop to check voting age
        if ( age >= 18 ){
            System.out.print("The person\'s age is " +age +" and can vote.");
        }
        else{
            System.out.print("The person\'s age is " +age +" and cannot vote.");
        }
    }
}
