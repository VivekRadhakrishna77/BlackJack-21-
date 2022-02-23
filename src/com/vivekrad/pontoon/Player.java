package com.vivekrad.pontoon;
//Vivek Radhakrishna 2060838
import java.util.ArrayList;

import com.vivekrad.pontoon.Card.Value;

public class Player {
	private String playerName;
	private ArrayList<Card> playerHand = new ArrayList<Card>();
	
	public Player(String name) {
		this.playerName=name;
	}
	
	public String getName() {		
		return playerName;
	}
	
	public void dealToPlayer(Card card) {
		playerHand.add(card);
	}
	
	public void removeCard(Card card) {
		playerHand.remove(card);
	}
	
	public ArrayList<Integer> getNumericalHandValue(){
		ArrayList<Integer> handValue = new ArrayList<Integer>();
		int h1=0,h2=0,h3=0,h4=0,h5=0;
		int numAces=0;
		
		for(Card card : playerHand) {
			handValue.addAll(card.getNumericalValue());
			card.getValue();
			if(card.getValue() == Value.ACE) {
				numAces +=1;
			}
		}
		
		
		if (numAces==0) {
			for(int i=0;i<handValue.size();i++) {
				h1 += handValue.get(i);
			}
			handValue.clear();
			handValue.add(h1);			
			
		} else if(numAces==1) {
			for(int i=0;i<handValue.size();i++) {
				if(handValue.get(i)==1) {
					h1 += 1;
				} else if (handValue.get(i)==11) {
					h2 += 11;
				}else {
					h1 += handValue.get(i);
					h2 += handValue.get(i);
				}
			}
			handValue.clear();
			handValue.add(h1);
			handValue.add(h2);
			
			
		} else if (numAces==2) {
			h1=2;h2=12;h3=22;
			
			for(int i=0; i<handValue.size(); i++) {
				if(handValue.get(i)==1 || handValue.get(i)==11) {
					continue;
				}
				else {
					h1 += handValue.get(i);
					h2 += handValue.get(i);
					h3 += handValue.get(i);
				}
			}
			handValue.clear();
			handValue.add(h1);
			handValue.add(h2);
			handValue.add(h3);
		}
		
		else if (numAces==3) {
			h1=3;h2=13;h3=23;h4=33;
			
			for(int i=0; i<handValue.size(); i++) {
				if(handValue.get(i)==1 || handValue.get(i)==11) {
					continue;
				}
				else {
					h1 += handValue.get(i);
					h2 += handValue.get(i);
					h3 += handValue.get(i);
					h4 += handValue.get(i);
				}
			}
			handValue.clear();
			handValue.add(h1);
			handValue.add(h2);
			handValue.add(h3);
			handValue.add(h4);
		}
		
		else if (numAces==4) {
			h1=4;h2=14;h3=24;h4=34;h5=44;
			
			for(int i=0; i<handValue.size(); i++) {
				if(handValue.get(i)==1 || handValue.get(i)==11) {
					continue;
				}
				else {
					h1 += handValue.get(i);
					h2 += handValue.get(i);
					h3 += handValue.get(i);
					h4 += handValue.get(i);
					h5 += handValue.get(i);
				}
			}
			handValue.clear();
			handValue.add(h1);
			handValue.add(h2);
			handValue.add(h3);
			handValue.add(h4);
			handValue.add(h5);
		}
		
		
		return handValue;
		
	}
	
	public int getBestNumericalHandValue() {
		int bestValue = 0;
		ArrayList<Integer> bestList = new ArrayList<Integer>();
		bestList = getNumericalHandValue();
		
		for(int i=0; i<bestList.size(); i++) {
			//System.out.println("best " + bestList.get(i));
			if((bestList.get(i)>bestValue) && (bestList.get(i)<=21)) {
				bestValue = bestList.get(i);
			} 
					
		}
		return bestValue;
	}
	
	public ArrayList<Card> getCards(){
		return playerHand;
	}
	
	public int getHandSize() {
		return playerHand.size();
	}
}
