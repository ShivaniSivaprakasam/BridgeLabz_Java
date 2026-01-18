package coreprogramming.programmingelements.level1;

/*
 * This program calculates the profit and profit percentage
 * based on the cost price and selling price.
 */
public class Profit {

    public static void main(String[] args) {

        // Cost Price
        double CP = 129;

        // Selling Price
        double SP = 191;

        // Calculating profit
        double profit = SP - CP;

        // Calculating profit percentage
        double profitPercentage = (profit / CP) * 100;

        // Displaying cost price and selling price
        System.out.println("The Cost price is INR " + CP +
                " and the Selling Price is INR " + SP + ".");

        // Displaying profit and profit percentage
        System.out.println("The profit is INR " + profit +
                " and the Profit Percentage is: " + profitPercentage + "%.");
    }
}
