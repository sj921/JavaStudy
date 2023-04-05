package blackjack;

public class Card {
	// 모양 : ♠ ♡ ♣ ◇
	// 숫자 : A 2 3 4 5 6 7 8 9 J Q K
	static char[] shapes = {'♠', '♡', '♣', '◇'};
 	static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
 	// 만들어지는 배열 52개.. 메모리 낭비를 방지 위해 static 사용  --> 인스턴스 생기기 전에 접근 가능 
		
 	
 	boolean hidden;		// 딜러의 카드는 한 장 가려놓는다
 	
	int shape;	// 이 값은 달라져도 각 번호가 의미하는 개념은 모든 카드에서 동일하므로 static을 붙임
	int rank;	// 0을 A로 치겠다...
	
	public Card(int shape, int rank) {		// 생성자를 미리 만들어두면 값을 대입할 수 있다
		this.shape = shape;
		this.rank = rank;
	}
	
	
	
	public void hide() {
		hidden = true;
	}
	
	public void open() {
		hidden = false;
	}
	
	
	
	@Override
	public String toString() {
		if (hidden) {
			return "┌────┐\n│ XX │\n└────┘";
		} else {
			return String.format(
					"┌────┐\n"
							+ "│ %c%-2s│\n"
							+ "└────┘", shapes[shape], ranks[rank]);
		}
	}
}
