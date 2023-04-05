package quiz;

import java.util.Scanner;

public class B08_ReverseCase {

	/*
		사용자가 문장을 입력하면 입력한 문장의 소문자는 모두 대문자로,
		대문자는 모두 소문자로 바꿔서 출력해주세요.
		(알파벳에 해당하지 않으면 그대로 출력)	
	*/
	

	public static void main(String[] args) {
		
		System.out.print("문장 입력 >> ");
		String text = new Scanner(System.in).nextLine();
		
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			// 대문자 또는 소문자일때 -> 바꿔서 출력
			if (ch >= 'A' && ch <= 'Z') {
				System.out.printf("%c", ch + 32);				
			} else if (ch >= 'a' && ch <= 'z') {
				System.out.printf("%c", ch - 32);				
				// 둘 다 아닐 때 -> 그냥 출력
			} else {
				System.out.printf("%c", ch);
			}
			
		}
		
		
		
		
//		System.out.print("검색할 문장 >> ");
//		String text = sc.nextLine();
//		char alp = sc.next().charAt(0);
//		
//		char alp1 = 0, alp2 = 0;
//	
//		if (alp >= 'a' && alp <= 'z') {
//			alp1 = alp;
//			alp2 = (char)(alp - 32);
//		} else if (alp >= 'A' && alp <= 'Z') {
//			alp1 = alp;
//			alp2 = (char)(alp + 32);	
//			
//		} else {
//			
//		}
//	
//		for (;;) {
//			
//		}
	
	
	
	
	
	
	
	
	
	
//	char keyword1 = 0, keyword2 = 0;
//	
//	// 검색어에 대한 검사
//	// - 입력한 검색어가 소문자일때 -> 대문자도 키워드에 등록
//	// - 입력한 검색어가 대문자일때 -> 소문자도 키워드에 등록		
//	if (keyword >= 'a' && keyword <= 'z') {
//		keyword1 = keyword;
//		keyword2 = (char)(keyword - 32);	// A : 65, a : 97
//	} else if (keyword >= 'A' && keyword <= 'Z') {
//		keyword1 = (char)(keyword + 32);	// A : 65, a : 97
//		keyword2 = keyword;
//	} else {
//		System.out.println("검색어가 알파벳이 아닙니다...");
//	}
	
	
	
	}
	
}
