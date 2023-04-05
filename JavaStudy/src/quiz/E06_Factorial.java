package quiz;

import java.util.Scanner;

public class E06_Factorial {

	/*
		사용자가 정수를 입력하면 해당 정수의 !를 구하는 메서드를 정의해보세요.

		10! -> 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
		7!	-> 7 * 6 * 5 * 4 * 3 * 2 * 1


	 */

	// 재귀함수 사용x
	public static int factorial(int num) {
		int result = 1;
		for (int i = num; i > 0; --i) {
			result *= i;
		}
		return result;
	}

	// 재귀함수 사용o
	// 자기 자신을 호출하는 재귀 함수 방식 (recursive, 성능 안 좋음)
	// 5!인 경우 : 1 --> 2 * 1 --> 3 * 2! --> 4 * 3! --> 5 * 4!
	public static int factorial2 (int num) {
		// 무한 반복되는 것 막아두기!
		if (num == 1) {		
			return 1;
		}
		return num * factorial2(num - 1);
	}

	// System.out.println(test(5));  --> 무한증식, stackOverFlowError 발생
	// if (num == 200) {throw new Exception("이제 그만"); --> 무한 증식을 막아주는 수식이 필요하다
	public static int test (int num) throws Exception {
		if (num == -200) {
			throw new Exception("이제 그만");
		}		
		System.out.println("test: " + num);
		return test(num - 1);
		
	}

	public static void main(String[] args) {

		System.out.println("재귀함수 사용x: " + factorial(5));
		System.out.println("재귀함수 사용o: " + factorial2(5));
		
	
		try {
			test(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}


	/*
		# stack 호출구조
		
		(1) main이 끝나기 전에
			method1();	가 들어오고, 나가고 난 뒤
			method2();	가 들어오고, 마지막에 main이 나옴(first in - last out)
	
		(2) method1(){
				method2();
			}
			--> 메서드1이 끝나기 전에 메서드2가 들어옴
			--> 메서드가 너무 많이 쌓이면 StackOverFlowError 오류가 발생되어 강제종료된다
			--> main이 맨밑에 깔려있다...(컵모양 형상화..)
	 */

}




