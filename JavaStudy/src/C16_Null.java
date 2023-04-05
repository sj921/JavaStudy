import java.util.Arrays;

import blackjack.Card;
import myobj.Apple;

public class C16_Null {

	static int ab;
	static boolean abc;
	
	static Apple apple;
	static Card[] cards = new Card[52];
 	
	public static void main(String[] args) {
		
		// 기본형 타입 초기화 - 0, false
		int a = 0;
		
		System.out.println(a);
		System.out.println(ab);
		System.out.println(abc);
		
		// 참조형 타입 초기화 - null
		String str = null;		// 주소값을 가리킴
		
		System.out.println(str);
		System.out.println(apple);
		// System.out.println(Arrays.toString(cards));	// 52개가 다 null
		
		cards[0] = new Card(0, 0);
		cards[1] = new Card(0, 1);
		cards[2] = new Card(0, 2);
		
		for (int i = 0; cards[i] != null && i < cards.length; ++i) {
			// cards[i]가 null이 아니라는 조건을 추가하여 null값으로 나오는 것을 제외하고 출력함
			// 52개가 꽉 차 있을 때 오류 생기므로 (i < cards.length)도 만족해야 함
			cards[i].hide();						// 에러. null인데 뭘 오픈해.... 
			System.out.println(cards[i]);
		}
	}
	
}
