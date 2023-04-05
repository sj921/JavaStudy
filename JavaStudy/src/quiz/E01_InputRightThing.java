package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_InputRightThing {

	/*
		사용자로부터 nextInt()로 숫자를 입력받되
		숫자가 아닌 문자를 입력하더라도 다시 입력받을 수 있는 프로그램을 만들어보세요
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		while (true) {
			try {
				System.out.print("input number only: ");
				a = sc.nextInt();
				break;
			} catch (InputMismatchException e){
				System.out.println("잘못된 입력. 숫자만 입력해주세요.");	
				System.out.println("스트림에 남아있던 것: " + sc.nextLine());
			}
		}
		
		System.out.println("받은 값: " + a);
	}
}
