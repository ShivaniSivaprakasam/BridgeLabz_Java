package coreprogramming.controlflowpractices.level2;
import  java.util.Scanner;
public class GreatestFactor {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                // Getting uer input
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int greatestFactor = 1;
                // Loop set to find the greatest factor
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
                // Displaying result
            System.out.println("Greatest factor: " + greatestFactor);
        }
}

