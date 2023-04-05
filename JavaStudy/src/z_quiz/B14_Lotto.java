package z_quiz;

import java.util.Arrays;

public class B14_Lotto {

	/*
		1. 1 ~ 45의 "중복 없는" 랜덤 숫자 6개를 생성하여 당첨번호를 만들어보세요

		2. 당첨될 때까지 랜덤 로또 번호를 생성하여 몇 회만에 당첨되었는지 출력해보세요
		   (6개 중 6개 맞추면 1등)
	 */
	
	public static void main(String[] args) {

//	1. 1 ~ 45의 "중복 없는" 랜덤 숫자 6개를 생성하여 당첨번호를 만들어보세요

		int[] num = {
				(int)(Math.random() * 45 + 1), 
				(int)(Math.random() * 45 + 1),
				(int)(Math.random() * 45 + 1),
				(int)(Math.random() * 45 + 1),
				(int)(Math.random() * 45 + 1),
				(int)(Math.random() * 45 + 1)};



		int[] lotto = new int[6];
		for (int i = 0 ; i < lotto.length; ++i) {
			// i번째 랜덤 숫자를 뽑음
			lotto[i] = (int)(Math.random() * 45 + 1);
			System.out.println("방금 뽑은 숫자: [" + lotto[i] + "]");

			// 이전의 숫자들과 비교해서 뽑았던 숫자가 있다면 다시 뽑아야 함
			for (int j = 0; j < i; ++j) {
				System.out.printf("이전 숫자%d: %d\n", j, lotto[j]);
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random() * 45 + 1);
					j = -1;
					System.out.println("다시 뽑은 숫자: [" + lotto[i] + "]");
					System.out.println("중복이 발생하여 다시 뽑고 처음부터 검사합니다.");
				}
			}
		}

		// 출력
		System.out.print("당첨번호: ");

		for (int i = 0; i < lotto.length; ++i) {
			// i번째 랜덤 숫자를 뽑음
			System.out.printf("%-2d ",lotto[i]);
		}	
		System.out.println();
		

//	2. 당첨될 때까지 랜덤 로또 번호를 생성하여 몇 회만에 당첨되었는지 출력해보세요 (6개 중 6개 맞추면 1등)

		int buyCount = 0;
		
		while (true) {
			int[] myLotto = new int[6];
			
			for (int i =0; i < myLotto.length; ++i) {
				myLotto[i] = (int)(Math.random() * 45 + 1);
				
				for (int j = 0; j < i; ++j) {
					if (myLotto[i] == myLotto[j]) {
						myLotto[i] = (int)(Math.random() * 45 + 1);
						j = -1;
					}
				}
			}
			++buyCount;
			
			// lotto[]와 myLotto[]가 같은지 비교를 해야 한다.
			// --> 당첨 번호 6개가 myLotto[]에 포함되어 있는지 검사해야 한다
			int winCount = 0;
			for (int i = 0; i < lotto.length; ++i) {
				for (int j = 0; j < myLotto.length; ++j) {
					if (lotto[i] == myLotto[j]) {
						++winCount;
						break;
					}
				}
			}
			
			if (winCount == 6) {
				System.out.println(buyCount + "만에 당첨!");
				break;
			} else if (winCount == 5) {
				System.out.println("2등! 아쉽다");
				// Arrays.toString(arr) : 배열을 문자열로 변환
				System.out.println(Arrays.toString(myLotto)); 	
			}
				
		}
		




	}

}



//	1 2 3 4 5 6 과 5 6 1 2 3 4 순서 일치하지 않으면 비교X
//	if (lotto[0] == myLotto[0] 
//			&& lotto[1] == myLotto[1] 
//			&& lotto[2] == myLotto[2] 
//			&& lotto[3] == myLotto[3]
//			&& lotto[4] == myLotto[4] 
//			&& lotto[5] == myLotto[5]) {			
//	}





// 내가 푼 것
//	int[] numArr = new int[6];
//
//	for(int i = 0; i < numArr.length; ++i) {
//		numArr[i] = (int)(Math.random() * 45 + 1);		// 0(+1) ~ 44(+1) --> 1 ~ 45
//		System.out.printf("[%d] - %d\n", i, numArr[i]);
//
//		for (int j = 0; j < numArr.length; ++j) {
//			if (numArr[i] != numArr[j]) {
//				break;
//			}
//		}
//
//	}

// 중복이 없으려면? --> 앞에 산출된 값은, 다음 산출 시 배제되어야 함
//								1) 배제 --> continue (어려움ㅠㅠ)
// 								2) 아니면... --> ??
//	
//	힌트1 : 뽑았는데 있는 번호면 다시 뽑는다.. 계속 --> 무한 반복문??
//			무한 반복하려면 if문에 무슨 조건을 넣어야 하나...???
//			
//	힌트2 : 뽑고 나서 그 번호를 다시 안뽑으면 된다
//	
//
