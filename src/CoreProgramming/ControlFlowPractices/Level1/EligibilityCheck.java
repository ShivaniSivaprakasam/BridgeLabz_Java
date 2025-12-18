package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        while ( age <= 0 ){
            System.out.print("Please enter a valid age: ");
            age = input.nextInt();
        }
        if ( age >= 18 ){
            System.out.print("The person\'s age is " +age +" and can vote.");
        }
        else{
            System.out.print("The person\'s age is " +age +" and cannot vote.");
        }
    }
}
