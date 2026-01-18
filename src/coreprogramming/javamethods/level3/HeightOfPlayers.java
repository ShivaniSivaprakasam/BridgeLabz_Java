package coreprogramming.javamethods.level3;

/*
 * HeightOfPlayers class
 * ---------------------
 * This class simulates the heights of 11 players and provides methods to:
 * 1. Generate random heights between 150 cm and 250 cm.
 * 2. Find the sum of heights.
 * 3. Calculate the mean (average) height.
 * 4. Determine the shortest player.
 * 5. Determine the tallest player.
 * 
 * The main method generates random heights for 11 players and displays
 * their shortest, tallest, and mean heights.
 */
public class HeightOfPlayers {

    // Generate a random height between 150 cm and 250 cm
    public int generateHeight() {
        return (int) (Math.random() * (250 - 150 + 1)) + 150; // Random integer from 150 to 250
    }

    // Calculate the sum of all heights in the array
    public int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h; // Add each height to sum
        }
        return sum;
    }

    // Calculate the mean (average) height
    public double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length; // Sum divided by number of players
    }

    // Find the shortest height among players
    public int findShortest(int[] heights) {
        int min = heights[0]; // Initialize min with first height
        for (int h : heights) {
            min = Math.min(min, h); // Update min if current height is smaller
        }
        return min;
    }

    // Find the tallest height among players
    public int findTallest(int[] heights) {
        int max = heights[0]; // Initialize max with first height
        for (int h : heights) {
            max = Math.max(max, h); // Update max if current height is larger
        }
        return max;
    }

    // Main method to demonstrate generating heights and calculating statistics
    public static void main(String[] args) {
        HeightOfPlayers obj = new HeightOfPlayers(); // Create object to use methods
        int[] heights = new int[11]; // Array to store heights of 11 players

        // Generate and display heights
        System.out.println("Heights of players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = obj.generateHeight(); // Generate random height
            System.out.print(heights[i] + " "); // Print height
        }

        // Display shortest, tallest, and mean heights
        System.out.println("\n\nShortest height: " + obj.findShortest(heights));
        System.out.println("Tallest height: " + obj.findTallest(heights));
        System.out.println("Mean height: " + obj.findMean(heights));
    }
}
