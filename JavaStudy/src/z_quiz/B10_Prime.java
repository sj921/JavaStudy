package z_quiz;

import java.util.Scanner;

public class B10_Prime {

	/*
		사용자로부터 숫자(양수)를 입력받으면 1부터 입력한 숫자 사이에 있는 모든 소수를 출력해보세요
	
		※ 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
		 ex) 2, 3, 5, 7, 11, 13, ...
		※ 사용자가 잘못된 숫자를 입력하는 경우 다시 제대로 입력하게 만들 것
	*/
	
	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);

		
// 사용자가 잘못된 숫자를 입력하는 경우 다시 제대로 입력하게 만들 것
		for (;;) {
			System.out.print(" >> ");
			num = sc.nextInt();
			
			// num에 원하는 숫자가 들어와야 반복문을 탈출할 수 있다.
			if (num > 1) {
				break;
			}
			System.out.println("2 이상의 숫자를 입력하세요");
		}


// 사용자로부터 숫자(양수)를 입력받으면 1부터 입력한 숫자 사이에 있는 모든 소수를 출력해보세요
		for (int i = 2; i <= num; ++i) {
			boolean prime = true;
			
			// i가 소수인지 검사
			// 방법1 - i를 1부터 i까지의 숫자로 모두 나누어본다.
			//		 모두 나누었을 때 약수가 2개라면 소수다.
			// 방법2 - i를 2부터 자기 자신 직전까지의 숫자로 나눈다.
			//		 나누어 떨어지는 수가 없으면 소수다.
			// 방법3 - i를 2부터 검사하는 숫자의 제곱근까지의 숫자로 나눈다
			//		---> 연습해보기
			
	
	// 방법2
			
			for (int j = 2; j < i; ++j) {		// ex) 1 ~ 50 중 1, 50은 빼고 2 ~ 49로 나누어
				if (i % j == 0) {				// 중간에 나누어떨어지는 값이 있으면 false
					prime = false;				// 38 % 2 == 0이면 false
				}
			}
			
			if (prime) {						// 모든 결과값이 아닌 prime인 결과값만 출력
				System.out.printf("%d은 prime? %s\n", i, prime);
			}
		}
		
	// 방법 1
		
		for (int i = 2; i <= num; ++i) {
			boolean prime = true;
			
			int count = 0;
			for (int j = 1; j < i; ++j) {		
				if (i % j == 0) {				
					count++;				
				}
			}
			prime = count == 2;
			if (prime) {						
				System.out.printf("%d은 prime? %s\n", i, prime);
			}
			
		}
		
		 
		// 소수 자체보다는, ★★★ 알고리즘(절차)를 도출해내는 것이 중요! ★★★
		 
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력 >> ");
//
//		int num = sc.nextInt();
//		
//		for (int i  = 1; i <= num; ++i) {
//			
//			for (int  ) {
//				
//			}
//			
//			if (num < 2) {
//				break;				
//			} else if () {
//				
//			}  	
//			 
//			System.out.printf("%5d", i);
//			
//		}
// i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0
		
	}
}
