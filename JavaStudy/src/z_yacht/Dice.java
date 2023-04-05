package z_yacht;

import java.util.ArrayList;
import java.util.Collections;

public class Dice {
	
	private final boolean DEBUG = true;
	
	ArrayList<Integer> hand = new ArrayList<>(5);
	
	public Dice() {
		Collections.addAll(hand, 6, 6, 6, 6, 6);
		roll();
	}
	
	// 5개 다 던지기
	public void roll() {
		int size = hand.size();
		for (int i = 0; i < size; ++i) {
			roll(i);
		}
	}
	
	// 하나 정해서 던지기
	public void roll (int index) {
		if (DEBUG) {
			System.out.printf("hand[%d] 다시 던짐!\n", index);
		}
		hand.set(index, (int)(Math.random() * 6 + 1));
	}
	
	// 여러개 던지기
	// 문자열로 전달하면 "13" --> 1번, 3번 다시 던지기
	public void roll(String indexes) {
		for (int i = 0; i < indexes.length(); ++i) {
			roll(indexes.charAt(i) - '0' - 1);
			// charAt(0) => 49, '0' => 48
			// 49 - 48 - 1 = 0 
		}
	}
	
	@Override
	public String toString() {
		return hand.toString();
	}
	
	
	
	
	
}