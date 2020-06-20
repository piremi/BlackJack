package com.codewithjimmy;

public class Blackjack {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to BlackJack");
        Deck playingCards = new Deck();
        playingCards.createFullDeck();

        System.out.println(playingCards);
    }
}
