package com.codewithjimmy;

import java.util.ArrayList;

public class Deck {
    //instance vars
    private ArrayList<Card> cards;

    //construct
    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public void createFullDeck(){
        for(Suit cardSuit: Suit.values()){
            for(Value cardValue: Value.values()){
                //add a new card to the mix
                this.cards.add(new Card(cardSuit, cardValue));
            }
        }
    }

    public String toString(){
        String cardListOutput = "";
        int i = 0;
        for (Card aCard: this.cards){
            cardListOutput += "\n" + i + "-" + aCard.toString();
            i++;
        }
        return cardListOutput;
    }
}
