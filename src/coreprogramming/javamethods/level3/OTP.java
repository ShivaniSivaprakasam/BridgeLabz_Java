package coreprogramming.javamethods.level3;

/*
 * OTP class
 * ---------
 * This class demonstrates:
 * 1. Generating 6-digit random OTPs.
 * 2. Storing multiple OTPs in an array.
 * 3. Checking if all generated OTPs are unique.
 *
 * The main method generates 10 OTPs, displays them,
 * and validates uniqueness.
 */
public class OTP {

    // Generate a single 6-digit OTP
    public static int otpNumber() {
        return (int) (Math.random() * 900000) + 100000; // Generates number from 100000 to 999999
    }

    // Check if all OTPs in an array are unique
    public static boolean areUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) { // Duplicate found
                    return false;
                }
            }
        }
        return true; // No duplicates
    }

    // Main method to generate and validate OTPs
    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTPs

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = otpNumber();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check and display if all OTPs are unique
        if (areUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique. Regenerate!");
        }
    }
}
