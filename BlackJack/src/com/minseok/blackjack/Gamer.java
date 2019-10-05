package com.minseok.blackjack;

public class Gamer {
	protected final Card[] cardList;

	public Gamer() {
		cardList = new Card[49];
	}

	public Gamer(int size) {
		cardList = new Card[size];
	}

	public void receiveCard(Card card) {
		for (int i = 0; i < cardList.length; i++) {
			if (cardList[i] == null) {
				cardList[i] = card;
				return;
			}
		}
	}

	public void printCards() {
		for (Card c : cardList) {
			if (c != null) {
				System.out.println(c);
			}
		}
	}

	public int open() {
		int sum = 0;
		for (Card c : cardList) {
			if (c != null) {
				System.out.println(c);
				sum += c.getCalcValue();
			}
		}
		System.out.printf("sum : %d\n", sum);
		return sum;
	}
}
