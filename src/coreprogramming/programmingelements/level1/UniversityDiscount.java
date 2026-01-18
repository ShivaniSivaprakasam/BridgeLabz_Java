package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/*
 * This program calculates the discount amount
 * and the final fee after applying the discount.
 */
public class UniversityDiscount {

    public static void main(String[] args) {

        // Taking fee input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee in INR: ");
        double fee = input.nextDouble();

        // Taking discount percentage input from the user
        System.out.print("Enter the discount percentage (divide by 100) : ");
        double discountPercent = input.nextDouble();

        // Calculating discount amount
        double discount = fee * discountPercent;

        // Calculating final discounted fee
        double discountedFee = fee - discount;

        // Displaying discount and final fee
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + discountedFee + ".");
    }
}
