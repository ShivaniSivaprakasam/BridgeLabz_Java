package CoreProgramming.ControlFlowPractices.Level2;
import  java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        double years = input.nextDouble();
        if ( years > 5 ){
            double bonus = (salary * 5)/100;
            System.out.println("The bonus received is: " +bonus);
        }
        else{
            System.out.println("No bonus.");
        }
    }
}
