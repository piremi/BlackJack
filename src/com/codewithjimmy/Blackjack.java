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

    }
}
