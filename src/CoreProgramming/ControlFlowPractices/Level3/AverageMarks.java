package CoreProgramming.ControlFlowPractices.Level3;
import  java.util.Scanner;
public class AverageMarks{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter physics marks: ");
        float physics = input.nextFloat();
        System.out.print("Enter chemistry marks: ");
        float chemistry = input.nextFloat();
        System.out.print("Enter maths marks: ");
        float math = input.nextFloat();
        float average = (physics + chemistry + math)/3;
        if ( average >= 80 ){
            System.out.println("Grade: A; Level 4, above agency-normalized standards");
        }
        else if ( average >= 70 && average <= 79 ){
            System.out.println("Grade: B; Level 3, at agency-normalized standards");
        }
        else if ( average >= 60 && average <= 69 ){
            System.out.println("Grade: C; Level 2, below, but approaching agency-normalized standards");
        }
        else if ( average >= 50 && average <= 59 ){
            System.out.println("Grade: D; Level 1, well below agency-normalized standards");
        }
        else if ( average >= 40 && average <= 49 ){
            System.out.println("Grade: E; Level 1-, too below agency-normalized standards");
        }
        else{
            System.out.println("Grade: R; Remedial standards");
        }

    }
}

