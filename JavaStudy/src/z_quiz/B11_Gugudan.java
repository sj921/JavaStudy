package z_quiz;

public class B11_Gugudan {

	/*
		B10의 구구단 두 개를 while문으로 출력해보세요
		
		1. 구구단을 다음과 같이 가로로 출력해보세요
		
			2단 : 2x1=2 2x2=4 2x3=6 ..
			3단 : 3x1=3 3x2=6 ...
			4단 : ...
	
		2. 구구단을 다음과 같이 세로로 출력해보세요
			
			2단		3단		4단
			2x1=2	3x1=3	...
			2x2=4	3x2=6	...
	*/
	
	public static void main(String[] args) {

//		1. 구구단을 다음과 같이 가로로 출력해보세요
		
		System.out.println("===== 가로 출력 =====");
		int dan = 2, gop = 1;
		while (dan <= 9) {
			System.out.printf("%d단: ", dan);
			gop = 1;				// ★★★ while문은 다시 초기화해주어야 함!
			while (gop <= 9) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
				++gop;
			}
			++dan;		
			System.out.println();
		}
	
		
//		2. 구구단을 다음과 같이 세로로 출력해보세요

		System.out.println("===== 세로 출력 =====");

		int line = 0, dan2 = 2;
		while (line < 10) {		
			dan2 = 2;
			while (dan2 <= 9) {
				if (line == 0) {
					System.out.printf("%d단\t", dan2);
				} else {
					System.out.printf("%dx%d=%d\t", dan2, line, dan2 * line);
				}
				++dan2;				
			}
			++line;	
			System.out.println();
		}
		

		
		
//		System.out.println("===== 세로 출력 =====");
//
//		int gop2 = 1;
//		
//		while (gop2 <= 9) {
//			gop2++;	
//			
//			int dan2 = 2;			
//			while (dan2 <= 9) {
//				dan2++;
//				if (dan2 == 2) {
//					System.out.printf("%d단\t", dan2);
//				} else {
//					System.out.printf("%dx%d=%-2d ", dan2 - 1, gop2 - 1, (dan2 - 1) * (gop2 - 1));
//				}
//			}
//			System.out.println();
//			
//		}
		
		
		
	}

}
