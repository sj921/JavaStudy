package quiz;

import java.util.Arrays;

public class B14_Sort {

	/*
		랜덤 int 30개가 들어있는 배열을 생성한 후
		
		(1) 해당 배열의 내용을 작은값부터 차례대로(오름차순) 저장한 새로운 배열을 생성하여 출력해보세요
		
		(2) 해당 배열의 내용을 큰 값부터 차례대로(내림차순) 저장한 새로운 배열을 생성하여 출력해보세요
	*/

	public static void main(String[] args) {
				
		int[] nums = new int[30];	// 랜덤값 30개 들어있는 30개 배열
		
		// Arrays.fill(arr, value) : 해당 배열을 원하는 값으로 가득 채울 때 사용	// Arrays.fill(nums, (int)(Math.random() * 100));
		// Arrays.fill(nums, 100)
				
		for (int i = 0; i < nums.length; ++i) {
			nums[i] = (int)(Math.random() * 1000 - 500);  // -500 ~ 499
		}
		
		int[] ascending = new int[30];	// 값이 비어있는 배열을 생성
		
		// 배열의 시작 주소 전달 --> 두 배열 변수가 같은 배열을 가리키게 된다 
		// ascending = nums;				// ascending에 nums을 대입
		
		// 배열 내부의 값 복사 (두 배열이 다른 값을 지니게 된다)
		for (int i = 0; i < nums.length; ++i) {
			ascending[i] = nums[i];
		}
		
		// 최대값을 구한다 : {55, 2, 3, 9, 88, 8, 17, 53} 첫번째값 55을 초기 설정한 후,  최대값 88을때까지 비교. 최대값 88을 끝자리 53과 자리 바꿈
	
		
		// i : 내가 제일 큰 값을 찾아서 넣어야 하는 위치
		for (int i = 29; i >= 0; --i) {
			
			// 제일 큰 값의 위치를 찾는 곳
			int max_index = 0;
			for (int j = 1; j <= i; ++j) {
				if (ascending[max_index] < ascending[j]) {	// 0 vs 1~29  --> 0 vs 1~28 --> 0 vs 1~27
					max_index = j;
				}
			}
			
			// 찾은 가장 큰 값과 마지막 위치의 값을 교환
			int temp = ascending[i];		// i를 0부터 시작 했을 경우 --> len - 1 -i						
			ascending[i] = ascending[max_index];
			ascending[max_index] = temp;		
		
		}
		// ascending[2] = 99999;
		
		System.out.println("정렬전 배열: " + Arrays.toString(nums));
		System.out.println("오름차순: " + Arrays.toString(ascending));
			 
		
		
		
		System.out.println("-----------------------------------");	
		
		
		// 숙제
		
		int[] descending = new int[30];
		
//		descending = nums;
		for (int i = 0; i < nums.length; ++i) {
			descending[i] = nums[i];
		}
												// 0  1 2 3 4 5  6
		for (int i = 29; i >= 0; --i) {			// 10 1 5 7 8 15 20
			int min_index = 0;
			for (int j = 1; j <= i; ++j) {
				if (descending[min_index] > descending[j]) {
					min_index = j;
				}
			}
			int temp = descending[i];
			descending[i] = descending[min_index];
			descending[min_index] = temp;
		}
		System.out.println("정렬전: " + Arrays.toString(nums));
		System.out.println("내림차순: " + Arrays.toString(descending));
	
	}
	
}
	
		
		
	
	
//	내가 푼 거...	
//	int[] numArr = new int[30];								// 배열 30개 선언
//	int max = 0;
//	
//	for (int i = 0; i < numArr.length; ++i) {
//		numArr[i] = (int)(Math.random() * numArr.length);	// 무작위로 30개 생성
//		System.out.print(numArr[i]+ " ");
//								
//		if (max < numArr[i]) {
//			max = numArr[i];
//		}
//		System.out.printf("최대값:%d\n", max);	
//		
//		for (int j = 1; j < numArr.length - 1; ++j) {
//			if (numArr[j] > numArr[j-1]) {
//				
//			}
//			
//		}

//		 [0] [1] [2] [3] [4]
//		  11  4   2
//i = 0
//j = 1	 j=0 j=1		
//
		
//		int min = 29;
//			
//		for (int i = 0; i < numArr.length; ++i) {
//			numArr[i] = (int)(Math.random() * numArr.length);	// 무작위로 30개 생성
//			System.out.print(numArr[i]+ " ");
//			
//			// 최소값과 최대값을 먼저 산출	
//			if (min > numArr[i]) {
//				min = numArr[i];
//			}
//			System.out.println("최소값: " + min);
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
