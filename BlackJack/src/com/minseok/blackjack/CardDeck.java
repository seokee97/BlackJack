package com.minseok.blackjack;

public class CardDeck {
	private Card[] cardList = new Card[52];

	public CardDeck() {
		String[] shapes = { "스페이드", "하트", "클럽", "다이아몬드" };
		final int CARD_COUNT = 13;

		String displayValue = null;
		int calcValue = 0;
		for (int z = 0; z < shapes.length; z++) {
			for (int i = 0; i < CARD_COUNT; i++) {
				switch (i) {
				case 0:
					displayValue = "A";
					break;
				case 10:
					displayValue = "J";
					break;
				case 11:
					displayValue = "Q";
					break;
				case 12:
					displayValue = "K";
					break;
				}

				if (i >= 10) {
					calcValue = 10;
				} else {
					calcValue = i + 1;
					displayValue = Integer.toString(calcValue);
				}

				cardList[z * CARD_COUNT + i] = new Card(shapes[z], displayValue, calcValue);
			}
		}

		mixCards();
	}

	private void mixCards() {
		final int MAX = cardList.length;
		for (int i = 0; i < MAX; i++) {
			int rIdx = (int) (Math.random() * MAX); // 0~51
			Card temp = cardList[rIdx];
			cardList[rIdx] = cardList[i];
			cardList[i] = temp;
		}
	}

	public Card pick() {
		for (int i = 0; i < cardList.length; i++) {
			if (cardList[i] != null) {
				Card temp = cardList[i];
				cardList[i] = null;
				return temp;
			}
		}
		return null;
	}

	public void printCards() {
		for (Card c : cardList) {
			if (c != null) {
				System.out.println(c);
			}
		}
	}
}