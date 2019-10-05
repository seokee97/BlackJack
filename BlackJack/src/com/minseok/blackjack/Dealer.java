package com.minseok.blackjack;

public class Dealer extends Gamer {
	public Dealer() {
		super(3);
	}
		
	public void moreCard(CardDeck cd) {
		int sum = 0;
		for(Card c : cardList) {
			if(c != null) {				
				sum += c.getCalcValue();
			}
		}
		
		if(sum <= 16) {
			//Card card = cd.pick();
			//this.receiveCard(card);			
			this.receiveCard(cd.pick());
		}
	}
}
