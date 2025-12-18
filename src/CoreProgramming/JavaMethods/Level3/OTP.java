package CoreProgramming.JavaMethods.Level3;
public class OTP {
    public static int otpNumber() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean areUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = otpNumber();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        if (areUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique. Regenerate!");
        }
    }
}
