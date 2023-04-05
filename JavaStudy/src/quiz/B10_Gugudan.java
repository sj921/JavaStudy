package quiz;

public class B10_Gugudan {
	
	/*
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

//	1. 가로
		
		System.out.println("=== 1번 문제 ===");
				
		for (int dan = 2; dan <= 9; ++dan) {				// 단은 일정
			System.out.printf("%d단: ", dan);
			
			for (int gop = 1; gop <= 9; ++gop) {			// 곱이 변화
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
			}
			System.out.println();
		} 
		
		System.out.println();			
		
		
//	2. 세로
		
		System.out.println("=== 2번 문제 ===");
						
		for (int line = 0; line <= 9; ++line) {			// 곱은 일정
			for (int dan = 2; dan <= 9 ; ++dan) {		// 단이 변화
				if(line == 0) {
					System.out.printf("%d단\t", dan);
				} else {
					System.out.printf("%dx%d=%d\t", dan, line, dan * line);
				}
			}
			System.out.println();
		
		}

	}
}