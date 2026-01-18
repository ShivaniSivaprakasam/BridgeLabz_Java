package coreprogramming.controlflowpractices.level2;
import  java.util.Scanner;
public class YoungestFriend {
    // Creating method to find the youngest friend
    public static int youngestFriend(int amarAge,int akbarAge,int anthonyAge){
        // Coundition to find the youngest friend
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
    // Creating a method to find the tallest friend
    public static float tallestFriend(float amarHeight,float akbarHeight,float anthonyHeight){
        // Condition to find the tallest friend
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
        // Getting user input
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
        // Calling method
        int age = youngestFriend(amarAge,akbarAge,anthonyAge);
        float height = tallestFriend(amarHeight,akbarHeight,anthonyHeight);
        // Displaying method
        System.out.println("The youngest friend is "+age);
        System.out.println("The tallest friend is "+height);
    }
}
