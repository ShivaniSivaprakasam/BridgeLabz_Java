package CoreProgramming.ControlFlowPractices.Level2;
import  java.util.Scanner;
public class YoungestFriend {
    public static int youngestFriend(int amarAge,int akbarAge,int anthonyAge){
        if ( amarAge < anthonyAge && amarAge < akbarAge ){
            return amarAge;
        }
        else if ( akbarAge < anthonyAge && akbarAge < amarAge ){
            return akbarAge;
        }
        else if ( anthonyAge < amarAge && anthonyAge < akbarAge ){
            return anthonyAge;
        }
        else{
            return 0;
        }
    }
    public static float tallestFriend(float amarHeight,float akbarHeight,float anthonyHeight){
        if ( amarHeight > anthonyHeight && amarHeight > akbarHeight ){
            return amarHeight;
        }
        else if ( akbarHeight > anthonyHeight && akbarHeight > amarHeight ){
            return akbarHeight;
        }
        else if ( anthonyHeight > amarHeight && anthonyHeight > akbarHeight ){
            return anthonyHeight;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amar\'s age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter akbar\'s age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter anthony\'s age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter amar\'s height: ");
        float amarHeight = input.nextFloat();
        System.out.print("Enter akbar\'s height: ");
        float akbarHeight = input.nextFloat();
        System.out.print("Enter anthony\'s height: ");
        float anthonyHeight = input.nextFloat();
        int age = youngestFriend(amarAge,akbarAge,anthonyAge);
        float height = tallestFriend(amarHeight,akbarHeight,anthonyHeight);
        System.out.println("The youngest friend is "+age);
        System.out.println("The tallest friend is "+height);
    }
}
