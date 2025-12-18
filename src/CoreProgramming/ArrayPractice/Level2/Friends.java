package CoreProgramming.ArrayPractice.Level2;
import java.util.Scanner;
public class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int size = 3;
        double[] age = new double[size];
        double[] height = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for " + names[i]);
            System.out.print("Enter age: ");
            age[i] = input.nextDouble();
            System.out.print("Enter height: ");
            height[i] = input.nextDouble();
            if ( height[i] <= 0 || age[i] <= 0 ){
                System.out.println("The age and height entered is invalid.");
                i--;
                continue;
            }
        }
        int youngestIndex = 0;
        int tallestIndex = 0;
        for ( int i = 0; i < size; i++ ) {
            if ( age[i] < age[youngestIndex] ){
                youngestIndex = i;
            }
            if ( height[i] > height[tallestIndex] ){
                tallestIndex = i;
            }
        }
        System.out.println("\nYoungest friend: " + names[youngestIndex]
                + " (Age: " + age[youngestIndex] + ")");

        System.out.println("Tallest friend: " + names[tallestIndex]
                + " (Height: " + height[tallestIndex] + ")");
    }
}