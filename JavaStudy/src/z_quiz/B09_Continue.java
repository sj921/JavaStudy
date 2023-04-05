package z_quiz;

public class B09_Continue {


	/*
		1. 1부터 30까지 한 줄에 숫자를 5개씩 출력
		
		2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 출력
	*/
		
	public static void main(String[] args) {
		
//	1. 1부터 30까지 한 줄에 숫자를 5개씩 출력
		
		for (int i = 1; i <= 30; ++i) {
			System.out.print(i + "\t");
		
			if (i % 5 != 0) {
				continue;
			}
			System.out.println();
		}	
		
//		for (int i = 1; i <= 30; ++i) {
//			System.out.print(i + " ");
//			
//			if (i % 5 == 0) {
//				System.out.println();
//			}
//		}
//		
		
		
//	2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 출력

		int sum = 0;
		
		for (int i = 1; i <= 200; ++i) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("결과: " + sum);
		
		
		
		
		
// (1)
//		int total = 0;
//		
//		for (int i = 1; i <= 200; ++i) {
//			
//			if(i % 2 != 0 && i % 3 != 0) {
//				total += i;
//			}
//		}
//		System.out.printf("총합: %d\n", total);

		
// (2)
//		int total2 = 0;
//		
//		for (int i = 1; i <= 200; ++i) {
//			
//			if (i % 2 == 0 && i % 3 == 0) {
//				continue;			
//			} 
//			total2 += i;
//		}
//		System.out.println(total2);
//
		
		
		
		
	}

}
