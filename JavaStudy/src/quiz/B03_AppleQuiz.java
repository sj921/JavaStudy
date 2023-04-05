package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {

	
	/*
		사과를 10개씩 담을 수 있는 바구니가 있다
		
		사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
		바구니의 개수를 알려주는 프로그램을 만들어보세요		
	
	*/

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수를 입력해주세요 >> ");
		int appleQty = sc.nextInt();
		int basketSize = 10;
		int answer;

//		answer = (int) Math.ceil(applyQty / (double)basketSize);
		
		
		// ※ 잘못된 입력에 대한 검증은 가장 먼저 하는 것이 좋다!!
		if (appleQty <= 0){
			answer = 0;
		} else if (appleQty % basketSize > 0) {		
			answer = appleQty / basketSize + 1;			
		} else {
			answer = appleQty / basketSize;			
		}		
		
		System.out.printf("필요한 바구니의 개수는 %d개 입니다 ", answer);
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("사과의 갯수를 입력 >> ");
//				
//		int apple; 
//		apple = sc.nextInt();
//		
//		if (apple > 0 && apple <= 10) {
//			System.out.println("바구니의 개수 " + (apple/10 + 1));				
//		} else if (apple > 10 && apple <= 20) {
//			System.out.println("바구니의 개수 " + (apple/10 + 1));	
//		} else {
//			System.out.println("바구니의 개수 " + (apple/10 + 1));	
//		}
		
		
	}
	
}
