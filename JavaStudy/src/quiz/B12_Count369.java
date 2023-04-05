package quiz;

import java.util.Random;

public class B12_Count369 {

	/*
		랜덤 양의 정수를 하나 생성하고
		해당 숫자까지 369 게임이 진행된다면
		박수를 총 몇 번 쳐야 하는지 출력해보세요
	*/
	public static void main(String[] args) {

		int num = (int)(Math.random() * 100);
		
		System.out.println("이번에 검사할 숫자: " + num);
		
		int clap = 0;
// (1) 문자열을 활용하는 방식
		for (int i = 3; i <= num; ++i) {
			
			// 검사할 숫자를 문자열로 변환
			String check = "" + i;
			System.out.println(i + "검사 결과: ");
			
			// 문자열이 된 숫자를 하나씩 떼서 박수를 쳐야하는지 검사
			for (int j = 0; j < check.length(); ++j) {
				char ch = check.charAt(j);
				System.out.printf("- %d번째 숫자 [%c] : ", j, check.charAt(j));
				
				// "44839" -> '4', '4', '8', '3', '9'
				if (ch == '3' || ch == '6' || ch == '9') {
					++clap;
					System.out.println("짝");
				} else {
					System.out.println();
				}
			}
		}
		System.out.println("총 박수 " + clap + "회 입니다.");
		

// (2) 숫자로 바로 구하는 방법
		clap = 0;
		
		for (int i = 3; i <= num; ++i) {
			
			int check = i;
			System.out.println("이번에 검사할 숫자: " + check);
			
			// 십진수는 % 10으로 일의 자리를 분리할 수 있다.
			while (check > 0) {
				int digit = check % 10;
				System.out.printf("- %d : ", check % 10);
				
				if (digit != 0 && digit % 3 == 0) {
					System.out.println("짝");
					++clap;
				} else {
					System.out.println();
				}
				check /= 10;
			}
		}
		
		
		
		
	}

}




//	내가 쓴 오답
//
// 1.	양의 정수 생성
// 2.	3포함하면, 박수 or not (X3 이거나 3X)
//		--> ch == 3	
// 		6
// 		9
// 3.	총 몇 번 ? (count 사용?)
//
//		String charset = "0123456789";
//		
//		String num = "";
//		
//		Random ran = new Random();
//		
//		
//		for (int i = 0 ; i < 6; ++i) {
//			num += charset.charAt(ran.nextInt(charset.length()));
//					
//			char ch = num.charAt(0);
//			char ch2 = num.charAt(1);		
//					
//			String message = ch == '3' || ch == '6' || ch == '9' ? "박수1" : "박수0";
//			String message2 = ch2 == '3' || ch2 == '6' || ch2 == '9' ? "박수1" : "박수0";
//			
//			System.out.println(message);
//			System.out.println(message2);
//			
//		}