package z_quiz;

import java.util.Scanner;

public class B08_Palindrome {

	
	
	/*
		사용자가 단어를 입력하면 해당 단어가 완벽하게 좌우대칭인지 판별해주는 프로그램을 만들어 보세요.
		판별해주는 프로그램을 만들어보세요
		
		>> Level
		-> 좌우대칭이 아닙니다
		>> level
		-> 좌우대칭입니다
		>> abba
		-> 좌우대칭입니다
	*/
	
	public static void main(String[] args) {
		
		// 1. 문제 푸는 절차를 잘못 생각한 경우
		//	- 내 머리로는 풀 수 없는 경우
		//	- 풀 수 있지만 절차적으로 변환이 안되는 경우 <- 경험 부족
		
		// 2. 어떻게 만들어야되는지는 아는데 자바 문법을 모르는 경우
		//	- 복습을 열심히
		//	- 틀린 문제를 또 틀리면 안된다
	
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.print("단어를 입력 > ");
		word = sc.next();
		
		// 01234567
		// straight : 8글자
		// i : 0	word.length() - i - 1 :7
		// i : 1	word.length() - i - 1 :6
		// i : 2	word.length() - i - 1 :5
		// i : 3	word.length() - i - 1 :4
		// i : 4	word.length() - i - 1 :3
		// i : 5	word.length() - i - 1 :2
		// i : 6	word.length() - i - 1 :1
		// i : 7	word.length() - i - 1 :0
		
		boolean palindrome = true;
		
		// (1) i번째 글자와 len-i번째 글자가 모두 일치하면 좌우 대칭
		for (int i = 0; i < word.length() / 2; ++i) {
			
			int i2 = word.length() - i - 1;
			
			// i : 0 1 2 3 4 5 6 7 8 9 .... len-1
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(i2);
			
			if (ch1 == ch2) {
				System.out.printf("%d번째 글자[%c]와 %d번째 글자[%c]가 일치합니다 \n", i, ch1, i2, ch2);
				
			} else if (ch1 != ch2) {
				System.out.printf("%d번째 글자[%c]와 %d번째 글자[%c]가 일치하지 않습니다 \n", i, ch1, i2, ch2);
				palindrome = false;		// boolean true로 시작 -> 일치하지 않을 때만 false로 출력되게...
			}
		}
		
		System.out.println("좌우대칭여부: " + palindrome);
		
		
		
		// (2) 글자를 거꾸로 만든 후 거꾸로 되기 전과 똑같으면 좌우 대칭

		// save == evas?
				
		String example = "apple";
			
		// 비어있는 문자열에 문자를 하나씩 계속 이어붙여 문자를 만들 수 있다
		String reversed = "";
				
		reversed += 'e';
		reversed += 'l';
		reversed += 'p';
		reversed += 'p';
		reversed += 'a';
		
		System.out.println(reversed.equals("apple"));
		
		example = "apple";
		for (int i = 0; i < example.length(); ++i) {
			// System.out.print(i + " ");
			System.out.print(example.charAt(i) + " ");

			
		}
			
			
		
		
//		String text = new Scanner(System.in).nextLine();
//		
//			for (int i = 1 - text.length(); i >= 0; --i) {
//										
//				char ch = text.charAt(i);
//				
//				if ( != ) {
//					System.out.println("좌우대칭이 아닙니다");
//				} else if ( == ) {
//					System.out.println("좌우대칭입니다");
//				}
//				
//			}
//		43210 != 01234 elppa apple
//		43210 == 01234 level level
//		int i = 1- text.length(i); i >=0; ++i
		
	}
	
}
