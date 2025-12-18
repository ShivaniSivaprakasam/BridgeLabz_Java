package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class Season {
    public static boolean isSpring(int month, int day) {
        if (month < 3 || month > 6) {
            return false;
        }
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

    }
}
