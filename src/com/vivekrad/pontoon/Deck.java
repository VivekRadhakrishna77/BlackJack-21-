package com.vivekrad.pontoon;

//Vivek Radhakrishna 2060838

import java.util.ArrayList;
import java.util.Random;

import com.vivekrad.pontoon.Card.Suit;
import com.vivekrad.pontoon.Card.Value;


public class Deck {
	
	private ArrayList<Card> deck;
	private final Random random = new Random();
	
	public Deck() {
		this.deck = new ArrayList<Card>();
		reset();
		shuffle();
	}
	
	public void reset() {
		deck.clear();
		for(Suit s : Card.Suit.values()) {
			for(Value v : Card.Value.values()) {
				deck.add(new Card(s,v));
			}
		}	
	}
	
	public void shuffle() {
		for (int i = deck.size()-1; i > 0; i-- ) {
            int rand = random.nextInt(i);
            Card temp = deck.get(i);
            deck.set(i, deck.get(rand));
            deck.set(rand, temp);
        }
	}
	
	public Card getCard(int i) {
		return deck.get(i);
	}
	
	public Card dealRandomCard() {
		Card randCard;
		int rand = random.nextInt(deck.size()-1);
		randCard = deck.get(rand);
		deck.remove(rand);
		
		return randCard;
	}
	
	public int size() {
		return deck.size();
	}
	
}
