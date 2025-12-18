package CoreProgramming.ControlFlowPractices.Level3;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in cm: ");
        double height = input.nextDouble();
        double heightM = height/100;
        double bmi = weight / (heightM * heightM);
        if ( bmi <= 18.4 ){
            System.out.println("Your BMI is " + bmi +" hence you are underweight");
        }
        else if ( bmi >= 18.5 &&  bmi <= 24.9  ){
            System.out.println("Your BMI is " + bmi +" hence you are normal-weight");
        }
        else if ( bmi >= 25 &&  bmi <= 39.9  ){
            System.out.println("Your BMI is " + bmi +" hence you are overweight");
        }
        else{
            System.out.println("Your BMI is " + bmi +" hence you are obese");
        }
    }
}
