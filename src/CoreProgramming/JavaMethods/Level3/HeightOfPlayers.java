package CoreProgramming.JavaMethods.Level3;
public class HeightOfPlayers {
    public int generateHeight() {
        return (int)(Math.random() * (250 - 150 + 1)) + 150;
    }
    public int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    public double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }
    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            min = Math.min(min, h);
        }
        return min;
    }
    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            max = Math.max(max, h);
        }
        return max;
    }
    public static void main(String[] args) {
        HeightOfPlayers obj = new HeightOfPlayers();
        int[] heights = new int[11];
        System.out.println("Heights of players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = obj.generateHeight();
            System.out.print(heights[i] + " ");
        }
        System.out.println("\n\nShortest height: " + obj.findShortest(heights));
        System.out.println("Tallest height: " + obj.findTallest(heights));
        System.out.println("Mean height: " + obj.findMean(heights));
    }
}

