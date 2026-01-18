package coreprogramming.stringfunction.level3;

import java.util.Scanner;

public class DeckOfCards {

    /**
     * Initializes a deck of cards using provided suits and ranks.
     * 
     * suits Array of suits (e.g., Hearts, Diamonds)
     *  ranks Array of ranks (e.g., 2, 3, Jack, Ace)
     *  Array of strings representing the full deck of cards
     */
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length; // Total number of cards
        String[] deck = new String[numOfCards];       // Array to store deck
        int index = 0;

        // Combine each rank with each suit to create the deck
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit; // Store card in deck
            }
        }
        return deck; // Return the initialized deck
    }

    /**
     * Shuffles the deck of cards using Fisher-Yates algorithm.
     * 
     *  deck Array of cards to shuffle
     *  Shuffled deck of cards
     */
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        // Loop through each card and swap it with a random card
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i)); // Generate random index
            String temp = deck[i];       // Temporary variable for swapping
            deck[i] = deck[randomCardNumber]; 
            deck[randomCardNumber] = temp;
        }
        return deck; // Return shuffled deck
    }

    /**
     * Distributes a specified number of cards evenly among players.
     * 
     *  deck Array of cards
     * n Number of cards to distribute
     *  players Number of players
     *  2D array containing cards for each player, or null if distribution is not possible
     */
    public static String[][] distributeCards(String[] deck, int n, int players) {

        // Check if cards can be evenly distributed
        if (n % players != 0) {
            System.out.println("Cards cannot be distributed equally among players.");
            return null;
        }

        int cardsPerPlayer = n / players;                  // Cards per player
        String[][] playerCards = new String[players][cardsPerPlayer]; // 2D array for players

        // Assign cards to each player
        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++]; // Distribute next card
            }
        }
        return playerCards; // Return distributed cards
    }

    /**
     * Prints the cards held by each player in a readable format.
     * 
     *  players 2D array containing cards of each player
     */
    public static void printPlayers(String[][] players) {
        if (players == null)
            return; // If distribution was not possible, do nothing

        // Loop through each player and print their cards
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]); // Print each card
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        // Define suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Initialize and shuffle the deck
        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        // Take input for number of cards and players
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        // Check if there are enough cards in the deck
        if (n > deck.length) {
            System.out.println("Not enough cards in the deck.");
            sc.close();
            return;
        }

        // Distribute cards among players and print
        String[][] playerCards = distributeCards(deck, n, players);
        printPlayers(playerCards);

        sc.close(); // Close scanner to free resources
    }
}


