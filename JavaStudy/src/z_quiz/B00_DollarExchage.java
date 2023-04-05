package z_quiz;

import java.util.Scanner;

public class B00_DollarExchage {

	/*
		원(￦)을 입력받으면 달러(＄)로 얼마인지 계산해주는 프로그램을 만들어보세요
		(환율은 구글링 해주세요)
	
	*/
	
	
	public static void main(String[] args) {
	
		int won;
		double dollar;
		
		System.out.print("원(￦)을 입력해주세요 >> ");
		won = new Scanner(System.in).nextInt();
		
		// * 정수와 실수의 계산 결과는 실수가 된다 
		dollar = won / 1400.8;	// won * 0.00071;
				
		System.out.printf("원화 %d￦은 달러화 %.2f＄입니다.\n", won, dollar);	
		
		
	}
	
}
