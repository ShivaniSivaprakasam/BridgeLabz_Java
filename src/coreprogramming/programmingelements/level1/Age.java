package coreprogramming.programmingelements.level1;

/**
 * This program calculates a person's age based on their year of birth (DOB) and the current year.
 * It computes age as currentYear - yearOfBirth and displays the result.
 */
public class Age {

    public static void main(String[] args) {
        final int YEAR_OF_BIRTH = 2000; // Year of birth
        final int CURRENT_YEAR = 2024;  // Current year

        int age = CURRENT_YEAR - YEAR_OF_BIRTH; // Calculate age

        System.out.printf("Harry's age in %d is: %d%n", CURRENT_YEAR, age); // Display age
    }
}
