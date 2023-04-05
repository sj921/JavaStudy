package z_quiz;

import java.util.Scanner;

public class B09_Numeric {

	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지 판별하는 프로그램을 만들어보세요
		
		1. 한 문자씩 꺼내면서 숫자인지 검사한다
		2. 끝까지 검사했을 때 모두 숫자였으면 true
		3. 검사하다가 중간에 숫자가 아닌 것을 만나면 false
	*/

	public static void main(String[] args) {

// (1)		
		String test = "a123a123";
		boolean numeric = true;
		
		for (int i = 0; i < test.length(); ++i) {
			char ch = test.charAt(i);
			
			if (ch < '0' || ch > '9') {
				numeric = false;
				break;
			}
		}
		System.out.println("결과: " + numeric);
		
		
// (2)
		
//		String test = "a123a123";
//		boolean numeric = true;
//		
//		for (int i = 0; numeric && i < test.length(); ++i) {
//			char ch = test.charAt(i);
//			numeric = numeric && (ch >= '0' && ch <= '9'); 
//		}
//		System.out.println("결과: " + numeric);
		
		
		
		
		
//		System.out.print("문자열 입력 >> ");
//
//		String str = new Scanner(System.in).next();
//		
//		for (int i = 0, len = str.length(); i < len ; ++i )	{
//			
//			char ch = str.charAt(i);
//			
//			if (!(ch >= '0' && ch <= '9')) {
//				System.out.print("입력한 문자열이 모두 숫자로 구성되지 않음");
//				break;			
//			} else if (ch >= '0' && ch <= '9') {
//				System.out.print("입력한 문자열이 모두 숫자임");
//			}
//		}
			
		
		
	}
	
}
