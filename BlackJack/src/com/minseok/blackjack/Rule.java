package com.minseok.blackjack;

public class Rule {
	private final int STAND_SCORE = 21;

	public void whoIsWin(Gamer gamer, Dealer dealer) {
		// 게이머의 카드 점수
		int gamerSum = gamer.open();
		// 딜러의 카드 점수
		int dealerSum = dealer.open();
		// 비교(21점에 가까운 사람이 승리, 21초과면 무조건 진다)
		// 게이머가 이김, 딜러가 이김, 둘 비김
		if (gamerSum > STAND_SCORE && dealerSum > STAND_SCORE || gamerSum == dealerSum) {
			System.out.println("비김!!!");

		} else if (gamerSum <= STAND_SCORE && dealerSum <= STAND_SCORE) {

			if (gamerSum > dealerSum) {
				System.out.println("게이머 승리!");
			} else {
				System.out.println("딜러 승리!");
			}

		} else {

			if (gamerSum > STAND_SCORE) {
				System.out.println("딜러 승리!");
			} else {
				System.out.println("게이머 승리!");
			}
		}

	}
}
