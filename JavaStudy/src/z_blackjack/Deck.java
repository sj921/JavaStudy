package z_blackjack;

public class Deck {

	Card[] cards;
	
	int cursor = 0;
	
	public Deck() {
		int rlen = Card.ranks.length;
		int slen = Card.shapes.length;
		cards = new Card[rlen * slen];		// 카드 1세트(52개) 생성
		
		for (int shape = 0; shape < slen; ++shape) {		// 0 ~ 3
			for (int rank = 0; rank < rlen; ++rank) {		// 0 ~ 12
				cards[shape * rlen + rank] = new Card(shape, rank);
				// shape = 0, 0~12	--> 0 ~ 12
				// shape = 1, 0~12	--> 13 ~ 25
				// shape = 2, 0~12	--> 26 ~ 38
				// shape = 3, 0~12	--> 39 ~ 51
			}
		}
		shuffle();
	}
	
	// 카드를 여러벌 사용하고 싶은 경우
	public Deck (int size) {
		int slen = Card.shapes.length;
		int rlen = Card.ranks.length;
		
		cards = new Card[slen * rlen * size];
		
		for (int i = 0; i < size; ++i) {
			int index = i * slen * rlen;	// i = 0 --> 0 ~ 52, i = 1 --> 0 ~ 104, ...
			for (int shape = 0; shape < slen; ++shape) {
				for (int rank = 0; rank < rlen; ++rank) {
					cards[index + shape * rlen + rank] = new Card(shape, rank);
					// System.out.println(index + shape * rlen + rank);
				}
			}
		}
		shuffle();
	}
	

	private void shuffle() {
		for (int i = 0; i < cards.length * 2; ++i) {		// 임의로 카드의 2배 길이만큼 섞기 반복
			int ran = (int)(Math.random() * cards.length);
			Card tmp = cards[0];
			cards[0] = cards[ran];
			cards[ran] = tmp;
		}
	}
	
	public Card draw() {
		if (cursor == cards.length) {		// 카드를 다 뽑으면
			cursor = 0;
			shuffle();
		}
		return cards[cursor++];
	}
	
	
}
