package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program simulates a Rock-Paper-Scissors game
 * between the user and the computer for multiple rounds.
 * It calculates the winner of each game and final statistics.
 */
public class RockPaperScissors {

    /*
     * Generates a random choice for the computer
     * Returns "Rock", "Paper", or "Scissors"
     */
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // Random number: 0,1,2
        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    /*
     * Determines the winner of a single round
     * Returns "User", "Computer", or "Draw"
     */
    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }
        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    /*
     * Calculates final statistics: wins and win percentage
     * Returns a 2D array with stats for User and Computer
     */
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent) + "%";

        return stats;
    }

    /*
     * Displays results of all games and final statistics
     */
    public static void displayResults(String[][] games, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" +
                    games[i][0] + "\t" +
                    games[i][1] + "\t\t" +
                    games[i][2]);
        }

        System.out.println("\nFinal Statistics:");
        System.out.println("Player\tWins\tWin Percentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of games as input
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        String[][] gameResults = new String[n][3]; // Stores user choice, computer choice, winner

        int userWins = 0;
        int computerWins = 0;

        // Play n games
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            // Update wins
            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            // Store game results
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        // Calculate statistics and display results
        String[][] stats = calculateStats(userWins, computerWins, n);
        displayResults(gameResults, stats);
    }
}

