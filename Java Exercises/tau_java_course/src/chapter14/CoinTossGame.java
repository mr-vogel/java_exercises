package chapter14;

import java.util.Scanner;

public class CoinTossGame {


    private static Scanner scanner = new Scanner(System.in);


    public static boolean valid = false;


    public static void main(String args[]){

        Player player1 = new Player("Xao");
        Player player2 = new Player("Mike");
        String player1guess;

        do {
            player1guess = getPlayer1Guess(player1);
            isValid(player1guess);

        } while (!valid);

        scanner.close();

        player1.setGuess(player1guess.toLowerCase());
        setPlayer2Guess(player1guess, player2);

        System.out.println(player1.getName() + "'s guess: " + player1.getGuess());
        System.out.println(player2.getName() + "'s guess: " + player2.getGuess());

        Coin coin = new Coin();
        coin.flip();

        findWinner(player1, player2, coin);
    }

    public static void isValid(String guess){
        if (guess.toLowerCase().equals("heads") || guess.toLowerCase().equals("tails")){
            valid = true;
        } else {
            System.out.println("Your guess was invalid, please try again.");
            valid = false;
        }
    }

    public static String getPlayer1Guess(Player player){

        prompt(player);
        var guess = scanner.next();
        return guess;
    }

    public static void setPlayer2Guess(String player1guess, Player player2){
        if (player1guess.toLowerCase().equals("heads")){
            player2.setGuess("tails");
        }else{
            player2.setGuess("heads");
        }
    }

    public static void findWinner(Player player1, Player player2, Coin coin){
        System.out.println("The coin landed " + coin.getSide() + " side up!");
        System.out.println("");

        if (player1.getGuess().equals(coin.getSide())){
            System.out.println("Congrats, " + player1.getName() + " You win!");
        } else {
            System.out.println("Congrats, " + player2.getName() + " You win!");
        }
    }

    public static void prompt(Player player){
        System.out.println("Hey " + player.getName() + "! Heads or tails?");
    }
}


/*
1. It asks player 1 to choose heads or tails, and ensures that player 1’s guess is valid.
2. Don't move on until player 1 actually has a valid guess.
3. Then, automatically assign player 2’s guess to the opposite of what player 1 chose.
4. You're going to flip the coin in this class to determine which side it landed on. Then you're going to determine a winner based on what the coin landed on.
5. Also, be sure to use methods appropriately in this class.
*/