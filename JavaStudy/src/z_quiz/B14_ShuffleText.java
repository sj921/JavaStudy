package z_quiz;

import java.util.Scanner;

public class B14_ShuffleText {

	/*
		사용자로부터 문장을 입력받으면
		해당 문장을 랜덤으로 뒤섞어 출력하는 프로그램을 만들어보세요
	
	*/
	
	public static void main(String[] args) {
		
//		int[] lotto = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
//		char[] text = {'h', 'e', 'l', 'l', 'o'};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> ");
		String text = sc.nextLine();
		
		System.out.println("입력받은 문장: " + text);

// 풀이(3)
		// "ABCDEFG"
		
		// 변수에 저장된 두 값을 교체할 때는
		// 값을 잠시 담아 놓을 수 있는 변수가 하나 더 필요하다
		int a = 10;
		int b = 20;
		int c;
		
		c = a;
		a = b;
		b = a;
		
		char[] shuffleArray = text.toCharArray();
		
		// text[0] = 'a'; 문자열에서는 꺼내는 것만 가능하고 수정할 수 없다
		
		// 랜덤 위치의 문자를 선택해 첫번째 문자와 만번 교환하기
		for (int i = 0; i < 10000; ++i) {		// 10000은 임의로 넣은 수
			int random_index = (int)(Math.random() * text.length());
			
			char temp = shuffleArray[0];					// temp(c) <-- a 
			shuffleArray[0] = shuffleArray[random_index];	// a --> b
			shuffleArray[random_index] = shuffleArray[0];	// a = b
		}
		
		System.out.println("셔플 결과: " + new String(shuffleArray));
		
		
		
		
		
		
// 풀이(2) 꺼낸 다음 표시하기
		
		// 이미 들어있으면 다른 곳에 넣기
		char[] origin = text.toCharArray();		// 원본
		char[] dst = new char[origin.length];	// 결과물
		
		// origin에서 순서대로 하나씩 꺼내서 dst의 랜덤 위치에 저장
		for (int i = 0; i < origin.length; ++i) {
			System.out.println(origin[i]);
			int random_index = (int)(Math.random() * origin.length);
			
			// origin에서 임의로 선택한 위치에 제대로 된 문자가 있다면
			if (origin[random_index] != 0) {
				// dst로 복사한 후 그곳을 0으로 만든다
				dst[i] = origin[random_index];
				origin[random_index] = 0;		// origin 배열의 {'h', 'e', 'l', 'l', 'o'} --> {'h', 'e', 'l', 'l', 0} 빠진 값은 0(null)로 만들어줌
			} else {							// dst로 값이 이동되고 나면 origin에 남은 값이 없는 것으로 출력됨
				--i;
			}
			// random_index에 다른 문자가 들어간 적이 없으면 옮김
			//	if (dst[random_index] == 0) {
			//		dst[random_index] = origin[i];	// origin[]의 값이 모두 dst[]에 입력되면 값이 하나만 출력될 수도 있다
			//	} else {
				// random_index에 다른 문자가 이미 들어가 있다면
				// 새로운 random_index를 선정함
			//	--i;
			//	}
			
		}
		// new String(char[])을 통해 char[]을 다시 문자열로 만들 수 있음
		System.out.println("원본: " + new String(origin));
		System.out.println("섞은 후: " + new String(dst));
		
		System.out.println("-------------------");
		
		

// 풀이(1) 중복 없이 모든 인덱스를 랜덤으로 선택하면 문자를 섞을 수 있음
		
		// 아까 한 거 : 1 ~ 45 중에 랜덤으로 6개를 중복없이 선택
		// 지금 해야 되는 거  : 0 ~ len-1 중에 랜덤으로 len개를 중복없이 선택
		
//		String shuffled = "";
//		
//		int len = text.length();
//		int[] indexs = new int[len];
//		for (int i = 0; i < text.length(); ++i) {
//			indexs[i] = (int)(Math.random() * len);		// 0 ~ len-1까지 출력
//			
//			for (int j = 0; j < i; ++j) {
//				if(indexs[i] == indexs[j]) {
//					indexs[i] = (int)(Math.random() * len);
//					j = -1;
//				}
//			}
//			shuffled += text.charAt(indexs[i]);		// 하나씩 아니라 문자 모아서 출력
//		}
//		System.out.print(shuffled);
//		
		
		
		
		
	}

}






// 내가 푼 거...
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문장을 입력 >> ");
//		
//		String str = sc.nextLine();
//					
//		char[] strArr = str.toCharArray();
//			
//		Random ran = new Random();
//		
//		for (int i = 0; i < strArr.length; ++i) {		
//			strArr[i] = str.charAt(ran.nextInt(str.length()));
//			System.out.println("방금 뽑은 문자: [" + strArr[i] + "]");
//		
//			for (int j = 0; j < i; ++j) {
//				System.out.printf("이전에 입력한 문자%d: %c\n " , j, strArr[j]);
//				
//				if (strArr[i] == strArr[j]) {
//					strArr[i] = str.charAt(ran.nextInt(str.length()));
//					j = -1;
//					System.out.println("다시 뽑은 문자: [" + strArr[i] + "]");
//				}
//			}
//		}
//		
//		System.out.print("출력된 문장: ");
//		
//		for (int i = 0; i < strArr.length; ++i) {
//			System.out.printf("%-2c ", strArr[i]);
//		}
//		System.out.println();
