package coreprogramming.controlflowpractices.level2;
import  java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting uer input
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        double years = input.nextDouble();
        // Setting loop condition if bonus is possibel
        if ( years > 5 ){
            double bonus = (salary * 5)/100;
            System.out.println("The bonus received is: " +bonus);
        }
        else{
            System.out.println("No bonus.");
        }
    }
}
