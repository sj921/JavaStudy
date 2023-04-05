package blackjack;

public class Deck {

	Card[] cards;		
	
	int cursor = 0;
		
	public Deck() {
		this(1);	// this() : 내 클래스의 다른 생성자 --> size 1짜리를 만들러 감...?
		
//		int rlen = Card.ranks.length;
//		int slen = Card.shapes.length;
//		cards = new Card[rlen * slen];
//		
//		for (int shape = 0; shape < slen; ++shape) {
//			for (int rank = 0; rank < rlen; ++rank) {
//				cards[shape * rlen + rank] = new Card(shape, rank);
//				// shape = 0, 0 ~ 12
//				// shape = 1, 13 ~ 25
//				// shape = 2, 26 ~ 38
//				// shape = 3, 39 ~ 51
//			}
//		}
//		shuffle();
	}
	
	// 카드를 여러 벌 사용하고 싶은 경우
	public Deck (int size) {
		int slen = Card.shapes.length;
		int rlen = Card.ranks.length;
		
		cards = new Card[slen * rlen * size];
		
		for (int i = 0; i < size ; ++i) {
			int index = i * slen * rlen;	// i = 0 --> 0 ~ 52 ????
			for (int shape = 0; shape < slen; ++shape) {
				for (int rank = 0; rank < rlen; ++rank) {
					cards[index + shape * rlen + rank] = new Card(shape, rank);
					// System.out.println(index + shape * rlen + rank);
				}
			}
		}
		shuffle();
	}
	
	// 카드 섞기...
	public void shuffle() {
		for (int i = 0; i < cards.length * 2; ++i) {
			int ran = (int)(Math.random() * cards.length);
			Card tmp = cards[0];
			cards[0] = cards[ran];
			cards[ran] = tmp;
		}
	}
	
	public Card draw() {
		if (cursor == cards.length) {		// 카드 다 뽑은 상태
			cursor = 0; 
			shuffle();
		}
		
		return cards[cursor++];
		
	}
	
	
	
	
	
}
