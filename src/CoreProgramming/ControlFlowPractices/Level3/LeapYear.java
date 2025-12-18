package CoreProgramming.ControlFlowPractices.Level3;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        int length = (int) Math.log10(year) + 1;
        while (length != 4 || year < 1582) {
            System.out.println("Please enter a valid year: ");
            year = input.nextInt();
            length = (int) Math.log10(year) + 1;
        }
        if (year % 400 == 0) {
            System.out.println("Leap year");
        }
        else if  (year % 100 == 0) {
            System.out.println("Not Leap year");
        }
        else if (year % 4 == 0) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not Leap year");
        }
    }
}

