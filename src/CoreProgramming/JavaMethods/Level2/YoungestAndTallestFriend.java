package CoreProgramming.JavaMethods.Level2;
import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static String youngestFriend(int amarAge, int akbarAge, int anthonyAge) {
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            return "Amar";
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            return "Akbar";
        } else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            return "Anthony";
        } else {
            return "Same age";
        }
    }

    public static String tallestFriend(float amarHeight, float akbarHeight, float anthonyHeight) {
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            return "Amar";
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            return "Akbar";
        } else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            return "Anthony";
        } else {
            return "Same height";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        System.out.print("Enter Amar's height: ");
        float amarHeight = input.nextFloat();
        System.out.print("Enter Akbar's height: ");
        float akbarHeight = input.nextFloat();
        System.out.print("Enter Anthony's height: ");
        float anthonyHeight = input.nextFloat();

        String youngest = youngestFriend(amarAge, akbarAge, anthonyAge);
        String tallest = tallestFriend(amarHeight, akbarHeight, anthonyHeight);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

    }
}
