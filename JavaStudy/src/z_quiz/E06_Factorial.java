package z_quiz;

public class E06_Factorial {

	/*
		사용자가 정수를 입력하면 해당 정수의 !를 구하는 메서드를 정의해보세요.

		10! -> 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
		7!	-> 7 * 6 * 5 * 4 * 3 * 2 * 1
	 */

	
	// 재귀함수 사용x
	public static int factorial (int num) {
		int result = 1;
		
		for (int i = num; i > 0 ; --i) {
			result *= i;
		}
		return result;
	}
	
	// 재귀함수 사용o
	// 자기 자신을 호출하는 재귀 함수 방식 (recursive, 성능 안 좋음)
	// 5!인 경우 : 1 --> 2 * 1 --> 3 * 2! --> 4 * 3! --> 5 * 4!
	public static int factorial2 (int num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial2(num - 1);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("재귀함수 사용x : " + factorial(5));
		System.out.println("재귀함수 사용o : " + factorial(5));
	}
	
	
	
	
	
	
	
	
	
	
}




