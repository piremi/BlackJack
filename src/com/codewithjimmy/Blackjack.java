package com.codewithjimmy;

import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to BlackJack");
        Deck playingCards = new Deck();
        playingCards.createFullDeck();
        playingCards.shuffle();
        //Create a deck for the player
        Deck playerDeck = new Deck();
        Deck dealerDeck = new Deck();

        double playerMoney = 100.00;

        Scanner userInput = new Scanner(System.in);

        //Game Loop
        while(playerMoney > 0){
            //Play on!
            //Take the Players bet
            System.out.println("You have $" + playerMoney + ", how much would you like to bet?");
            double playerBet = userInput.nextDouble();
            if(playerBet > playerMoney){
                System.out.println("You cannot bet more than you have. Please leave.");
                break;
            }

            //Start Dealing //might change playingCards to 'playingDeck' after merging to master.

            //Player gets two cards
            playerDeck.draw(playingCards);
            playerDeck.draw(playingCards);

            //dealer gets two cards
            dealerDeck.draw(playingCards);
            dealerDeck.draw(playingCards);

            while(true){
                System.out.println("Your hand:");
                System.out.println(playerDeck.toString());
            }
        }
        System.out.println("Game Over! You are out of money. @.@");
    }
}
