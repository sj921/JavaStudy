package quiz;

public class B06_ForQuiz {

	/*
		1. 2000미만의 9의 배수를 모두 출력해보세요 (양수만)

	  	2. 100부터 300까지의 총합을 구해보세요 (100과 300포함)

	  	3. 1000부터 1500까지의 10의 배수를 한 줄에 7개씩 출력해보세요

	 */




	public static void main(String[] args) {
//	1. 2000미만의 9의 배수를 모두 출력해보세요 (양수만)
		// 1-1. 9씩 더해도 9의 배수이다
		for (int i = 0; i < 2000; i += 9) {
			System.out.println(i);				

		}
		// 1-2. 숫자를 9로 나누었을 때 나누어 떨어지면 9의 배수
		for (int i = 0; i < 2000; ++i) {
			if(i % 9 == 0) {
				System.out.println(i);				
			}
		}


//	2. 100부터 300까지의 총합을 구해보세요 (100과 300포함)
		// * 총합을 구할 때는 변수를 하나 만들어서 값을 계속 누적시킨다
		int total = 0;
		
		for (int i = 100; i <= 300; ++i) {
			total += i;
		}
		System.out.printf("2번 문제 답: %d\n", total);


//	3. 1000부터 1500까지의 10의 배수를 한 줄에 7개씩 출력해보세요
		// 7번에 한번씩 \n을 출력해주면 된다
			// 조건 두개 넣을 때는 ,로 구분
		for(int i = 1000, count = 0; i <= 1500; ++i) {
			if (i % 10 == 0) {
				System.out.printf("%-5d(%d번째) ", i, count);
				
					if (count % 7 == 6) {		// count = 1 이면 (count % 7 == 0)
						System.out.println();	// System.out.print("\n");
					}
				
				++count;
			}
			
		}




		//		1. 2000미만의 9의 배수를 모두 출력해보세요 (양수만)
		//		for (int i = 9; i < 2000; i += 9) {
		//			System.out.println("9의 배수: " + i);
		//		}
		//		2. 100부터 300까지의 총합을 구해보세요 (100과 300포함)
		//		for (int i = 100; i <= 300; ++i) {
		//			System.out.println(i);
		//		} 	
		//		
		//		
		//		3. 1000부터 1500까지의 10의 배수를 한 줄에 7개씩 출력해보세요
		//		for (int i = 1000; i <= 1500; i += 10) {
		//			System.out.println(i);
		//			
	}

}


