package z_quiz;

import java.util.Arrays;

public class B15_Array2Quiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] numArr = {
				{1, 1, 1, 1, 1},
				{1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1},
				{1, 1, 1, 1},
		};
		
//	1. numArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기
//	2. 랜덤으로 바뀐 모든 값의 총합과 평균(소수점 둘째자리)을 구하기
//	3. numArr의 각 행(row)의 합을 구해서 출력하기
//	4. numArr의 각 열(column)의 합을 구해서 출력하기

		
//	1. numArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기 (tip! 갯수를 곱하고, 최소값을 더해주기)
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				numArr[i][j] =  (int)(Math.random() * 101 + 100);
			}	
			System.out.println(Arrays.toString(numArr[i]));		
		}		
		
//	2. 랜덤으로 바뀐 모든 값의 총합과 평균(소수점 둘째자리)을 구하기
		int sum = 0, cnt = 0;
		for (int i = 0; i < numArr.length; ++i) {
			// 내부 배열의 길이로 총 개수를 구할 수 있음
			cnt += numArr[i].length;
			for (int j = 0; j < numArr[i].length; ++j) {
				sum += numArr[i][j];
//				++cnt;
			}	
		}
		System.out.printf("총합: %d\n개수 : %d\n평균: %.2f\n", sum, cnt, sum / (double)cnt);
		
//	3. numArr의 각 행(row)의 합을 구해서 출력하기
//	4. numArr의 각 열(column)의 합을 구해서 출력하기
		
		int[] rowSum = new int[numArr.length];
		
		// 가장 길이가 긴 행을 찾아야 한다.
		int max_column_size = 0;
		for (int i = 0; i < numArr.length; ++i) {
			if (max_column_size < numArr[i].length) {
				max_column_size = numArr[i].length;
			}
		}
//		 System.out.println("가장 길이가 긴 행: " + max_column_size);
		
		// 열의 합은 컬럼의 개수만큼 있다
		int[] colSum = new int[max_column_size];	// 8
		// 
		for (int row = 0; row < numArr.length; ++row) {
			for (int col = 0; col < numArr[row].length; ++col) {
				rowSum[row] += numArr[row][col];
				colSum[col] += numArr[row][col];
			}	
		}
		System.out.println("행의 합: " + Arrays.toString(rowSum));
		System.out.println("열의 합: " + Arrays.toString(colSum));
		
		
		
		
		
		

		
		
	}

}










// 내가 푼 거
//	// 1. 랜덤정수로 바꾸기	
//	int sum = 0;
//	double cnt = 0;
//	for (int i = 0; i < numArr.length; ++i) {
//		for (int j = 0; j < numArr[i].length; ++j) {
//	
//			numArr[i][j] =  (int)(Math.random() * 101 + 100);
//	
//			sum += numArr[i][j];
//			++cnt;
//			System.out.printf("[%d][%d] : %d \n", i, j, numArr[i][j]);
//		}
//	}
//	// 2. 총합과 평균
//	System.out.println("총합 : " + sum);
//	System.out.printf("평균 : %.2f", sum / cnt);
//	
//	
//	// 3. numArr의 각 행(row)의 합을 구해서 출력하기
//	
//	
//	for (int row = 0; row <= numArr.length; ++row) {
//		System.out.printf("%d행\n", row);
//		for (int j = 0; j < numArr[j].length; ++j) {
//			System.out.println(numArr[row][j]);
//		
//			
//			
//			
//		}
//	}
//	
//	// 4. numArr의 각 열(column)의 합을 구해서 출력하기
//	










