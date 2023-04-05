package yacht;

import java.util.ArrayList;
import java.util.Collections;

public class Dice {
	
	private final boolean DEBUG = true;
	
	ArrayList<Integer> hand = new ArrayList<>(5);
	
	public Dice() {
		Collections.addAll(hand, 6, 6, 6, 6, 6);
		roll();
	}
	
//	public void roll() {
//		hand.set(0, (int)(Math.random() * 6 + 1));
//		hand.set(1, (int)(Math.random() * 6 + 1));
//		hand.set(2, (int)(Math.random() * 6 + 1));
//		hand.set(3, (int)(Math.random() * 6 + 1));
//		hand.set(4, (int)(Math.random() * 6 + 1));		
//	}
	
	// 5개 다 던지기
	public void roll() {
		int size = hand.size();
		for (int i = 0; i < size; ++i) {
			roll(i);
		}
	}
	
	// 하나 정해서 던지기
	public void roll (int index) {
		if (DEBUG) {											// DEBUG가 true일 때만 해당 문자열 출력됨 (false이면 미출력)
			System.out.printf("hand[%d] 다시 던짐!\n", index);
		}
		hand.set(index, (int)(Math.random() * 6 + 1));
	}
		
	// 여러 개 던지기
	// 문자열로 전달하면, "13" --> 1번 3번 다시 던지기, "123" -> 1,2,3번 다시 던지기
	public void roll(String indexs) {
		for (int i = 0; i < indexs.length(); ++i) {
			roll(indexs.charAt(i) - '0' - 1);		// 문자열로 전달하면 숫자로 반환, 0부터 시작하므로 -1해야 함
		}
	}
	
	
	@Override
	public String toString() {
		return hand.toString();
	}
	
	
	
}
