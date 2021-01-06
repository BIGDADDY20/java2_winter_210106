package constructor_quiz04;

import java.util.Random;

public class TrumpCardTest {

	public static void main(String[] args) {
		TrumpCard[] trumpCards = new TrumpCard[52];
		int index = 0;

		// spade 넣기
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard();
			trumpCard.setShape("spade");
			trumpCard.setNumber(i + 1);
			trumpCards[index++] = trumpCard;
		}

		// heart 넣기
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard();
			trumpCard.setShape("heart");
			trumpCard.setNumber(i + 1);
			trumpCards[index++] = trumpCard;
		}

		// diamond 넣기
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard();
			trumpCard.setShape("diamond");
			trumpCard.setNumber(i + 1);
			trumpCards[index++] = trumpCard;
		}
		
		// club 넣기
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard();
			trumpCard.setShape("club");
			trumpCard.setNumber(i + 1);
			trumpCards[index++] = trumpCard;
		}
		
		// 섞기
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			int randIndex = rand.nextInt(51) + 1; // 1 ~ 51
			TrumpCard temp = trumpCards[0];
			trumpCards[0] = trumpCards[randIndex];
			trumpCards[randIndex] = temp;
		}
		
		// 출력
		for (int i = 0; i < trumpCards.length; i++) {
			System.out.println(trumpCards[i].getShape() + " " + trumpCards[i].getNumber());
		}
	}

}
