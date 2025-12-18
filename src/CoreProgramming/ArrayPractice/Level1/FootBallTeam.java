package CoreProgramming.ArrayPractice.Level1;
import java.util.Scanner;
public class FootBallTeam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        System.out.print("Enter height of 11 players: ");
        for ( int i = 0; i < 11; i++ ){
            heights[i] = input.nextDouble();
        }
        System.out.print("The entered heights are: ");
        for ( int i = 0; i < 11; i++ ){
            System.out.println(heights[i] + " ");
        }
        int sum = 0;
        for ( int i = 0; i < 11; i++ ){
            sum += heights[i];
        }
        System.out.println("The sum of heights is: " +sum);
        double meanHeight = sum/11;
        System.out.println("The mean height of 11 football players is: " + meanHeight);
    }
}
