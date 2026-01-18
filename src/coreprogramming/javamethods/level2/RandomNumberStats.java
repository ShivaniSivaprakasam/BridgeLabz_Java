package coreprogramming.javamethods.level2;

/*
 * RandomNumberStats class
 * -----------------------
 * This class demonstrates generating an array of 4-digit random numbers,
 * and calculating their average, minimum, and maximum values.
 * It includes:
 * 1. generate4DigitRandomArray(int size): Generates 'size' number of 4-digit random integers.
 * 2. findAverageMinMax(int[] numbers): Finds the average, minimum, and maximum of the given array.
 * 3. main(): Demonstrates the functionality by generating an array of 5 random numbers
 *    and printing the results.
 */
public class RandomNumberStats {

    // Generates an array of 4-digit random integers of given size
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size]; // Create an array to store random numbers

        // Loop through the array and assign a random 4-digit number to each element
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000; // Generate number between 1000 and 9999
        }

        return numbers; // Return the filled array
    }

    // Calculates average, minimum, and maximum of the given array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;          // Initialize sum of numbers
        int min = numbers[0]; // Initialize min with the first element
        int max = numbers[0]; // Initialize max with the first element

        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;               // Add current number to sum
            min = Math.min(min, num); // Update min if current number is smaller
            max = Math.max(max, num); // Update max if current number is larger
        }

        double average = (double) sum / numbers.length; // Calculate average
        return new double[]{average, min, max};        // Return results as an array
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {

        int[] randomNumbers = generate4DigitRandomArray(5); // Generate 5 random numbers

        // Print the generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " "); // Print each number separated by space
        }

        // Calculate average, min, and max
        double[] result = findAverageMinMax(randomNumbers);

        // Print the results
        System.out.println("\n\nAverage: " + result[0]); // Print average
        System.out.println("Minimum: " + result[1]);     // Print minimum
        System.out.println("Maximum: " + result[2]);     // Print maximum
    }
}
