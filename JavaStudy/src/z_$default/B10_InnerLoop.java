package z_$default;

public class B10_InnerLoop {
	
	public static void main(String[] args) {

		// 반복문 안에 반복문 사용하기
		// --> 바깥 반복문 1번 & 안쪽 반복문 5번 & 제일안쪽 3번 --> 계속 반복
		for (int i = 0; i < 10; ++i) {
			System.out.println("==============바깥 반복문" + i);
			
			for (int j = 0; j < 5; ++j) {
				System.out.println("============안쪽 반복문" + j);
			}
			
				for (int k = 0; k < 3; ++k) {
					System.out.println("==========제일 안쪽" + k);
				}
		}
		
		/*
			# 다중 반복문으로 구구단 출력하기
				
			 - 구구단은 2단 ~ 9단까지 있다
			 - 각 단 마다 x1 ~ x9까지 있다
		*/
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("--- %d단 --- \n", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%d x %d = %d \n", dan, gop, dan * gop);
			}
		}
		
		
		
		
		
		
		
		
	}

}
