package z_quiz;

import java.util.Scanner;

public class B08_PrintReverse {

	/*
		사용자가 어떤 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
		   0123456789
		>> I have app
		-> ppa evah I
		   9876543210
	*/	
	
	
	public static void main(String[] args) {
		
		System.out.print("거꾸로 출력할 문장을 입력 > ");

		String text = new Scanner(System.in).nextLine();
		
		for (int i = text.length() - 1; i >= 0; --i) {
			
			System.out.print(text.charAt(i));

		}
		
		
		
		
		
		
		
		
//		System.out.print("문장 입력 > ");
//
//		String text = new Scanner(System.in).nextLine();
//		
//		for (int i = 11; i <= text.length(); --i) {
//			
//			char ch = text.charAt(i);			
//			
//			System.out.printf("%c", ch);
//			
//		}
		
		
		
		
		
		
		
		
		
	}
	
}
