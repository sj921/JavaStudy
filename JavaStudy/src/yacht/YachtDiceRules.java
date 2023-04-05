package yacht;

import java.util.Collections;
import java.util.List;

public class YachtDiceRules {


	// 역의 이름과 점수를 함께 리턴하기 위해 클래스를 사용할 수 있다 (DTO)
	public static YachtDiceInfo check(Dice dice) {		
		List<Integer> hand = dice.hand;
		
		for (int i = 1; i <= 6; ++i) {
			int i_count = Collections.frequency(hand, i);		// collection의 값과 i의 값이 같으면 count함
			
			if (i_count == 5) {
				return YachtDiceInfo.YACHT;	// 같은 숫자 5개
			} else if (i_count == 4){
				return YachtDiceInfo.FOUR_OF_A_KIND;		// 같은 숫자 4개
			} else if (i_count == 2 || i_count == 3) {			// 같은 숫자가 2개, 3개
				for (int j = 1; j <= 6; ++j) {
					if (j == i) {
						continue;
					}
					if (Collections.frequency(hand, j) == (5 - i_count)) {		// 여기 세 줄 이해못함...
						return YachtDiceInfo.FULL_HOUSE;
					}
				}
			} 
			
			if (i == 1 || i == 2) {						// 5개가 순서대로 --> 1 또는 2일때 +1, +2, +3 ... -> 12345, 23456
				if (hand.contains(i) && hand.contains(i + 1) 
						&& hand.contains(i + 2) && hand.contains(i + 3) 
						&& hand.contains(i + 4)) {
					return YachtDiceInfo.LARGE_STRAIGHT;
				}
			} 
			
			if ( i == 1 || i ==2 || i == 3) {			// 4개가 순서대로? --> 1 또는 2 또는 3일때 --> 1234, 2345, 3456
				if (hand.contains(i) && hand.contains(i + 1) 
						&& hand.contains(i + 2) && hand.contains(i + 3)) {
					return YachtDiceInfo.SMALL_STRAIGHT;
				}
			}
		}
		
		return new YachtDiceInfo("아무것도 아님", 0);
		
		
	}
	
	
	
	
	
	
}
