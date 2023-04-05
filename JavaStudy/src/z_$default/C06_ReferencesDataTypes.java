package z_$default;

import java.util.Scanner;

import z_myobj.Apple;

public class C06_ReferencesDataTypes {

	// 클래스도 타입이기 때문에 매개변수로 활용할 수 있다
	static void appleTest(Apple apple) {
		apple.info();
	}
	
	public static void main (String[] args) {
		int a;
		int b;
		
		String str = "Hello world";
		int[] nums = {1, 2, 3, 4};
		
		// 클래스도 타입이다
		Scanner sc = new Scanner(System.in);
		Apple myApple = new Apple (10, 11, "Test Apple");
		
		
		// 사과 타입을 매개변수로 가진 메서드에 사과 타입 인스턴스를 전달
		appleTest(myApple);
		appleTest(new Apple(8, 8, "New Apple!!"));
		
	}
	
	
}
