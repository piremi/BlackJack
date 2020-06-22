package com.codewithjimmy;

import java.util.ArrayList;
import java.util.Random;

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

    public void shuffle(){
        ArrayList<Card> tmpDeck = new ArrayList<Card>();
        //user Random
        Random rand = new Random();
        int randomCardIndex = 0;
        int originalSize = this.cards.size();
        for(int i = 0; i < originalSize; i++){
            //Generate Random Index
            randomCardIndex = rand.nextInt((this.cards.size()-1 - 0) + 1) + 0;
            tmpDeck.add(this.cards.get(randomCardIndex));
            //Remove from original deck
            this.cards.remove(randomCardIndex);
        }
        this.cards = tmpDeck;
    }
    public String toString(){
        String cardListOutput = "";

        for (Card aCard: this.cards){
            cardListOutput += "\n" + aCard.toString();
        }
        return cardListOutput;
    }

    public void removeCard(int i){
        this.cards.remove(i);
    }
    public Card getCard(int i){
        return this.cards.get(i);
    }
    public void addCard(Card addCard){
        this.cards.add(addCard);
    }
    //Draws from the deck
    public void draw(Deck comingFrom){
        this.cards.add(comingFrom.getCard(0));
        comingFrom.removeCard(0);
    }
}
