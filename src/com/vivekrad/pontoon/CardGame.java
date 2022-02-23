package com.vivekrad.pontoon;

import java.util.ArrayList;

//Vivek Radhakrishna 2060838

public abstract class CardGame {
	Deck gameDeck = new Deck();
	ArrayList<Player> players = new ArrayList<Player>();
	Player player = new Player("Player");
	Player dealer = new Player("Dealer");
	
	public CardGame(int nplayers) {
		this.gameDeck = new Deck();
		players.add(player);
		players.add(dealer);
		getDeck();
	}
	
	public abstract void dealInitialCards();
	
	
	public abstract int compareHands(Player hand1, Player hand2);
	
	
	public Deck getDeck() {
		return gameDeck;
	}
	
	public Player getPlayer(int i) {
		return players.get(i);
	}
	
	public int getNumPlayers() {
		return players.size();
	}
	
	
}
