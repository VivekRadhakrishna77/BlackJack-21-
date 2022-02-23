package com.vivekrad.pontoon;
//Vivek Radhakrishna 2060838
public class Pontoon extends CardGame {
	
	
	public Pontoon(int nplayers) {
		super(nplayers);
		
	}

	public void dealInitialCards() {
		//gameDeck.reset();
		dealer.dealToPlayer(gameDeck.dealRandomCard());
		dealer.dealToPlayer(gameDeck.dealRandomCard());
		player.dealToPlayer(gameDeck.dealRandomCard());
		player.dealToPlayer(gameDeck.dealRandomCard());
	}

	
	public int compareHands(Player hand1, Player hand2) {
		int bestHand1 = hand1.getBestNumericalHandValue();
		int bestHand2 = hand2.getBestNumericalHandValue();
		
		//Pontoon Hand: 
		if(hand1.getHandSize()==2 && bestHand1==21) {
			if(hand2.getHandSize()==2 && bestHand2==21) {
				return 0; //draw
			}
			return -1; //hand1 wins
		}
		else if(hand2.getHandSize()==2 && bestHand2==21) {
			if(hand1.getHandSize()==2 && bestHand1==21) {
				return 0; //draw
			}
			return 1; //hand2 wins
		}
		
		//Five Card Trick:
		else if(hand1.getHandSize()==5 && bestHand1<=21) {
			if(hand2.getHandSize()==5 && bestHand2==bestHand1) {
				return 0; //draw
			}
			return -1; //hand1 wins
		}
		else if(hand2.getHandSize()==5 && bestHand2<=21) {
			if(hand1.getHandSize()==5 && bestHand1==bestHand2) {
				return 0; //draw
			}
			return 1; //hand2 wins
		}
		
		//Any number totalling 21
		else if(bestHand1==21) {
			return -1;
		}
		else if(bestHand2==21) {
			return 1;
		}
		
		//20 or less
		else if(bestHand1<=20 && bestHand1>bestHand2) {
			return -1;
		}
		else if(bestHand2<=20 && bestHand2>bestHand1) {
			return 1;
		}
		else if(bestHand1<=20 && bestHand1==bestHand2) {
			return 0;
		}
		
		
		
		//above 21 bust 
		else if(bestHand1==0 && bestHand2==0) {
			return 0;
		}
		else if(bestHand1==0) {
			return -1;
			
		}
		else if (bestHand2==0) {
			return 1;
		}

		else if(bestHand1>bestHand2) {
			return -1;
		} else if(bestHand2>bestHand1) {
			return 1;
		}else {
			return 0;
		}
	}

	
}
