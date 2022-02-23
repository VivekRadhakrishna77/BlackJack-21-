package com.vivekrad.pontoon;

import com.vivekrad.pontoon.Card.Suit;
import com.vivekrad.pontoon.Card.Value;

public class Test { 
	
	static Card card = new Card(null,null);
	static Deck deck = new Deck();
	static Player player = new Player("Player");
	static Player dealer = new Player("Dealer");
	static Pontoon game = new Pontoon(2); 
	
	public static void main(String[] args) {
		//gameTest();
		//deckTest();
		playerTest();
		//printDeck();
	}
	
	public static void gameTest() {
		
		//System.out.println(game.gameDeck);
		System.out.println("-------------Game Test--------------");
		game.getDeck();
		System.out.println(game.gameDeck.dealRandomCard().getNumericalValue());
		System.out.println(game.gameDeck.dealRandomCard().getNumericalValue());
		System.out.println(game.gameDeck.size());
		game.getDeck();
		System.out.println(game.gameDeck.size());
	}
	
	public static void printDeck(){
		for(int i = 0; i<game.gameDeck.size();i++) {
			Card temp = game.gameDeck.getCard(i);
			System.out.println((i+1) + ": " + temp.getValue() + " OF "+ temp.getSuit());
		}
	}
	public static void deckTest() {
		System.out.println("\n-------------Deck Test--------------");
		System.out.println("Current Deck size: " + deck.size());
		System.out.println("Random Card Value: " + deck.dealRandomCard().getNumericalValue());
		System.out.println("Random Card Value: " + deck.dealRandomCard().getNumericalValue());
		System.out.println("Random Card Value: " + deck.dealRandomCard().getNumericalValue());
		System.out.println("Random Card Value: " + deck.dealRandomCard().getNumericalValue());
		System.out.println("Current Deck size: " + deck.size());
		System.out.println("Reset Deck"); deck.reset(); 
		System.out.println("Current Deck size: " + deck.size());
		
		Card ace = new Card(Suit.DIAMONDS,Value.ACE);
		System.out.println(ace.getSuit());
		System.out.println(ace.getValue());
		System.out.println("----SHUFFLE----");
		System.out.println(deck.getCard(12).getValue() + " OF " + deck.getCard(12).getSuit());
		deck.shuffle();
		System.out.println(deck.getCard(12).getValue() + " OF " + deck.getCard(12).getSuit());
		deck.shuffle();
		System.out.println(deck.getCard(12).getValue() + " OF " + deck.getCard(12).getSuit());
		//System.out.println("Contains Duplicates: " + deck.containsDuplicates());
	}
	
	public static void playerTest() {
		System.out.println("\n-------------Player Test--------------");
		System.out.println(game.gameDeck.size());
		game.dealInitialCards();
		game.dealer.dealToPlayer(game.gameDeck.dealRandomCard());
		game.player.dealToPlayer(game.gameDeck.dealRandomCard());
		game.dealer.dealToPlayer(game.gameDeck.dealRandomCard());
		game.player.dealToPlayer(game.gameDeck.dealRandomCard());
		game.dealer.dealToPlayer(game.gameDeck.dealRandomCard());
		game.player.dealToPlayer(game.gameDeck.dealRandomCard());
		game.dealer.dealToPlayer(game.gameDeck.dealRandomCard());
		game.player.dealToPlayer(game.gameDeck.dealRandomCard());
		game.dealer.dealToPlayer(game.gameDeck.dealRandomCard());
		game.player.dealToPlayer(game.gameDeck.dealRandomCard());
		game.dealer.dealToPlayer(game.gameDeck.dealRandomCard());
		game.player.dealToPlayer(game.gameDeck.dealRandomCard());
		System.out.println("player hand, " + game.player.getHandSize() + " cards: " + game.player.getNumericalHandValue() + " Best: " + game.player.getBestNumericalHandValue());
		System.out.println("dealer hand: " + game.dealer.getHandSize() + " cards: " + game.dealer.getNumericalHandValue() + " Best: " + game.dealer.getBestNumericalHandValue());
		
		
		//System.out.println(game.gameDeck.size());
		int winner = game.compareHands(game.player, game.dealer);
		if(winner==1) {
			System.out.println("dealer wins");
		} else if (winner==-1) {
			System.out.println("player wins");
		} else {
			System.out.println("draw");
		}
		//System.out.println("Contains Duplicates: " + deck.containsDuplicates());
	}

}
