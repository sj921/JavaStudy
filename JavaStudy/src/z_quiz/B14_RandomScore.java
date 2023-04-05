package z_quiz;

import java.util.Random;

public class B14_RandomScore {

	/*
		1. 학생 100명의 점수(0 ~ 100)를 랜덤으로 생성하여 배열에 저장
		
		2. 배열에 저장된 값을 한 줄에 10개씩 출력
		
		3. 모든 학생들의 평균 점수를 출력 (소수 둘째 자리까지 출력)
		
		4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
	*/
	
	
	
	public static void main(String[] args) {

		int[] score = new int[100];
		
		// 1. 학생 100명의 점수(0 ~ 100)를 랜덤으로 생성하여 배열에 저장		
		for(int i = 0; i < score.length; ++i) {
			score[i] = (int)(Math.random() * 101);
		}
		
		// 2. 출력
		for(int i = 0; i < score.length; ++i) {
			System.out.printf("[%02d]: %-3d ", i, score[i]);	// 방번호 0~99 (개수100)
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		
		// 3. 평균
		int sum = 0;
		for (int i = 0; i < score.length; ++i) {
			sum += score[i];
		}
		System.out.println("총합: " + sum);
		System.out.printf("평균: %.2f\n", sum / (double)score.length);
		
		//	4. 최대값, 최소값
		int max = 0;	// 0 vs 15 --> 15 vs 55 --> 55 vs 99 ==> 최대값 : 99
		int min = 100;	// 100 vs 44 --> 44 vs 13 -->  13 vs 2 ==> 최소값 : 2
		
		for (int i = 0; i < score.length; ++i) {
			// 현재 max에 들어 있는 값보다 더 크면 최대값을 교체한다
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.printf("최대값은 %d이고, 최소값은 %d입니다. \n", max, min);
		
		// 5. 정렬  ----> 어려우므로 나중에 해보기
		
	}

}






// 내가 푼 거
//	public static void main(String[] args) {
//		
// 1. 학생 100명의 점수(0 ~ 100)를 랜덤으로 생성하여 배열에 저장		
//		Random ran = new Random();
//		
//		int[] arr = new int[100];
//		double avg = 0;		
//		int sum = 0;
//		
//		for (int i = 0; i < 100 ; ++i) {
//			int num = (int)(Math.random() * 101);	// 0 ~ 100
//			arr[i] = num;	
//								
//			System.out.printf(arr[i] + " ");
//			
//	2. 배열에 저장된 값을 한 줄에 10개씩 출력			
//			if (i % 10 == 9) {
//				System.out.println();
//			}
//			sum += num;
//		}
//		
//		System.out.println("총합: " + sum);
//		
// 3. 모든 학생들의 평균 점수를 출력 (소수 둘째 자리까지 출력)	
//		
//		avg = sum / 100.0;
//		System.out.printf("평균: %.2f\n", avg);
//
//	4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
//				
//		int max = arr[];
//		int min = arr[];		
//		
//	}
//}




























