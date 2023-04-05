package z_blackjack;

public class Card {
	static char[] shapes = {'♠', '♡', '♣', '◇'};
	static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	 	
	boolean hidden;
	
	int shape;
	int rank;
	
	public Card (int shape, int rank) {
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
			return "[ XX ]";
		} else {
			return String.format("[ %c%s ]", shapes[shape], ranks[rank]);
		}
	}
}
