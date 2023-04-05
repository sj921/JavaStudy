package z_quiz;

import java.util.Arrays;

public class C01_MethodQuiz2 {
/*
	1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
	2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
	3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 메서드
	4. 메서드를 호출하면 1~45 사이의 중복 없는 숫자 7개로 이루어진 배열을 반환하는 메서드
*/

// 1.	
	public static int howManyBasket (int apple, int size) {
		if (apple % size == 0) {
			return apple / size;
		} else {
			return apple / size + 1;
		}
	}
// 2.
	public static String shuffleText(String text) {
		char[] arr = text.toCharArray();
		
		for (int i = 0; i < 1000; ++i) {
			int index = (int)(Math.random() * arr.length);
			char tmp = arr[0];
			arr[0] = arr[index];
			arr[index] = tmp;
		}
		return new String(arr);					// 문자열을 문자로 분해해서 섞은 후 new String()으로 모아서 반환함
	}
// 3.
	public static String reverseText(String text) {
		char[] ori = text.toCharArray();
		int len = ori.length;					
		char[] reversed = new char[len];
		for (int i = 0; i < len; ++i) {
			reversed[reversed.length - 1 - i] = ori[i];		
		}
		return new String(reversed);
	}
// 4.
	public static int getRandomNumber() {
		return (int)(Math.random() * 45 + 1);	// 반복되는 수식은 메서드 만들어서 활용!
	}
	
	public static int[] getLottoNumber(){		// 전달하지 않아도 생성되므로 ()안에 입력X
		int[] lotto = new int[7];
		
		for (int i = 0; i < lotto.length; ++i) {
			lotto[i] = getRandomNumber();
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = getRandomNumber();
					j = -1;
				}
			}
		}
		return lotto;
 	}
	
// ------------------------------------------------------------------------
	
	public static void main(String[] args) {
// 1.
		int basket = howManyBasket(15, 10);
		System.out.printf("필요한 바구니는 모두 %d개 입니다.\n", basket);
// 2.		
		System.out.println(shuffleText("Hello, world!"));
// 3.
		System.out.println(reverseText("Hello, world!"));
// 4.
		System.out.println(Arrays.toString(getLottoNumber()));		// 배열을 출력할 때는 Arrays.toString()을 사용함
		
	}
	
}




// 내가 푼 거
//		//1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
//		public static int apple (int appleQty, int basketSize) {
//			int answer;
//			if (appleQty < 0) {
//				answer = 0;
//			} else if (appleQty % basketSize > 0) {
//				answer = appleQty / basketSize + 1;
//			} else {
//				answer = appleQty / basketSize;
//			}
//			return answer;
//		}
//		//2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
//		public static char[] shuffleArr (String text) {
//			char[] shuffleArr = text.toCharArray();
//			for (int i = 0; i < 1000; ++i) {
//				int random_index = (int)(Math.random() * text.length());
//				char temp = shuffleArr[0];
//				shuffleArr[0] = shuffleArr[random_index];
//				shuffleArr[random_index] = shuffleArr[0];
//			}
//			return shuffleArr;
//		}
//		//3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 메서드
//		public static String reversed (String text) {
//			String reversed = "";
//			for (int i = text.length() - 1; i >= 0; --i) {
//				reversed += text.charAt(i);
//			}
//			return reversed;
//		}
//		
//		//4. 메서드를 호출하면 1~45 사이의 중복 없는 숫자 7개로 이루어진 배열을 반환하는 메서드
//		public static int[] lotto () {
//			int[] lotto = new int[7];
//			for (int i = 0; i < lotto.length; ++i) {
//				lotto[i] = (int)(Math.random() * 45 + 1);
//				for (int j = 0; j < i; ++j) {
//					if (lotto[i] == lotto[j]) {
//						lotto[i] = (int)(Math.random() * 45 + 1);
//						j = -1;
//					}
//				}
//			}
//			return lotto;
//		}
//		
//		//출력	
//		public static void main(String[] args) {
//			
//			System.out.println(apple(102, 10));
//			System.out.println(shuffleArr("ABCD"));
//			System.out.println(reversed("ABCDE"));
//			System.out.println(Arrays.toString(lotto()));
//		}
