package z_quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_Updown {

	/*
	 	# Updown 게임을 만들어 보세요
	 	
		1. 프로그램이 시작되면 1 ~ 200 사이의 랜덤 숫자를 정답으로 선택한다
		
		2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다.
		(잘못된 숫자가 입력되면 다시 입력)
		
		3. 사용자가 정답을 맞추면 몇번만에 맞췄는지 출력해주고 프로그램을 종료한다
		
		4. 5번 안에 못맞추면 정답이 뭐였는지 출력해주고 프로그램을 종료한다
	*/
	public static void main(String[] args) {

		boolean win = false;
		
		int num = (int)(Math.random() * 200 + 1);	// 0(+1) ~199(+1)
		
		System.out.println("정답 생성 완료! (" + num + ")");
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자의 기회는 총 5번
		
		for (int turn = 0; turn < 5; ++turn) {
			System.out.print(turn + 1 + "번째 입력 >> ");
			int user = sc.nextInt();
			
			// 잘못된 입력을 먼저 거르는 것이 항상 좋다 (--> 디자인 패턴)
			if (user < 1 || user > 200) {
				System.out.println("잘못된 값입니다. 다시 입력해주세요");
				--turn;
				continue;
			}
			
			if (user < num) {
				System.out.println("UP");
			} else if (user > num) {
				System.out.println("DOWN");
			} else {
				System.out.println(turn + 1 + "회 만에 정답");
				win = true;
				break;
			}
		}
		
		if (!win) {
			System.out.println("정답은 " + num + "이었습니다.");
		}
		System.out.println("프로그램이 끝났습니다.");
		
		
	}
}




// 내가 푼 오답
//	int ran_num = ((int)(Math.random() * 200)  + 1);	// 0(+1) ~199(+1)
//	System.out.println(ran_num);
//
//	2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다. (잘못된 숫자가 입력되면 다시 입력)
//	Scanner sc = new Scanner(System.in);
//
//	int cnt = 1;
//	for (int i = 1; i <= 5; ++i) {
//		System.out.printf("%d회 숫자를 입력 >> ", i);
//		int num = sc.nextInt();
//	
//		if (num > ran_num) {
//			System.out.println("Up");
//			if (num > 200 ) {
//				System.out.print("잘못된 입력, ");
//			}  
//		} else if (num < ran_num) {
//			System.out.println("Down");
//			if (num < 0 ) {
//				System.out.print("잘못된 입력, ");
//			}
//		}  else if (num == ran_num) {
//			System.out.println("정답");
//			break;
//		} 
//		++cnt;
//	}	
//	System.out.printf("%d회만에 정답", cnt);
//
//
//	
//	
//	
////		if (num <= 0 || num > 200) {
////			continue;
////		} else {
////			System.out.print(ran_num);
////			break;
////		}
////	}
//
//
//
////3. 사용자가 정답을 맞추면 몇번만에 맞췄는지 출력해주고 프로그램을 종료한다
//
////4. 5번 안에 못맞추면 정답이 뭐였는지 출력해주고 프로그램을 종료한다