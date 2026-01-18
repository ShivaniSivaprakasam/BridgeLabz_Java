package coreprogramming.programmingelements.level1;

/**
 * This program calculates the discount and final fee after applying a discount.
 * It uses a fixed fee amount and a discount percentage to compute and display the results.
 */
public class FeeDiscount {

    public static void main(String[] args) {
        final double FEE = 125000;             // Original fee
        final double DISCOUNT_PERCENT = 0.10;  // 10% discount

        // Calculate discount and final fee
        double discountAmount = FEE * DISCOUNT_PERCENT;
        double finalFee = FEE - discountAmount;

        // Display results in formatted output
        System.out.printf(
            "The discount amount is INR %.2f and the final discounted fee is INR %.2f.%n",
            discountAmount, finalFee
        );
    }
}
