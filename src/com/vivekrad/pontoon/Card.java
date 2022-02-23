package com.vivekrad.pontoon;

// Vivek Radhakrishna 2060838

import java.util.ArrayList;

public class Card {	
	private Value value;
	private Suit suit;
	
	public Card(Suit suit, Value value) {
		this.value = value;
		this.suit = suit;
	}
	
	public static enum Suit {
		CLUBS,
		HEARTS,
		DIAMONDS,
		SPADES;
	}
	
	
	public void setSuit(Suit suit){
		this.suit = suit;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public static enum Value {
		
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING;
		
	}
	
	public void setValue(Value value) {
		this.value = value;
	}
	
	public Value getValue() {
		return this.value;
	}
	
	public ArrayList<Integer> getNumericalValue(){
		ArrayList<Integer> Num = new ArrayList<Integer>(); 
		Value val = this.value;
		
		switch(val) {
			case ACE:
				Num.add(1);
				Num.add(11);
				return Num;
			case TWO:
				Num.add(2);
				return Num;
			case THREE:
				Num.add(3);
				return Num;
			case FOUR:
				Num.add(4);
				return Num;
			case FIVE:
				Num.add(5);
				return Num;
			case SIX:
				Num.add(6);
				return Num;
			case SEVEN:
				Num.add(7);
				return Num;
			case EIGHT:
				Num.add(8);
				return Num;
			case NINE:
				Num.add(9);
				return Num;
			case TEN:
				Num.add(10);
				return Num;
			case JACK:
				Num.add(10);
				return Num;
			case QUEEN:
				Num.add(10);
				return Num;
			case KING:
				Num.add(10);
				return Num;
		} 
		return Num;
	}
}
