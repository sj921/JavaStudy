package quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class D01_ArrayListPractice {

	/*
		1. ArrayList에 4000 ~ 5000의 랜덤 정수를 100개 추가한다
		
		2. 모든 숫자의 평균을 구한다
		
		3. 짝수를 모두 제거한 후 총합을 구한다
		
		4. 홀수를 모두 제거한 후 총합을 구한다
		
		5. 10번째 홀수를 구한다
		
		※ 제네릭에는 기본형 타입은 사용할 수 없다.
	*/

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		
		for (int i = 0; i < 100; ++i) {
			list.add((int)(Math.random() * 1001 + 4000));
		}
		System.out.println(list);
		
		int sum = 0;
		for (int i = 0; i < list.size(); ++i) {
			sum += list.get(i);
		}
		// System.out.println("총합: " + sum);
		System.out.println("평균: " + sum / (double)list.size());
		
		
		// 3. 원본에서 짝수를 모두 제거한 후 총합을 구한다
		// --> 해당 위치의 짝수를 제거하면 뒤에 있던 아이템이 앞으로 땡겨지는 문제가 있음
		
		for (int i = 0; i < list.size(); ++i) {
			int num = list.get(i);
		
			if (num % 2 == 0) {
				evens.add(list.get(i));
//				list.remove(i);
//				--i;				// 삭제할 때는 감소되므로 --i로 땡겨줘야 한다...
			} else {
				odds.add(list.get(i));
			}
		
		}
		
		int evenSum = 0;		
		for (int i = 0; i < evens.size(); ++i) {
			evenSum += evens.get(i);
		}	
		int oddSum = 0;
		for (int i = 0; i < odds.size(); ++i) {
			oddSum += odds.get(i);
		}
		
		System.out.println("총합: " + sum);
		System.out.println("짝수 합: " + evenSum);
		System.out.println("홀수 합: " + oddSum);
		
		System.out.println("10번째 홀수: " + odds.get(9));
	}
	
	
	
	
	
	
	
// 내가 푼 거	
//	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<Integer> oddList = new ArrayList<>();
//		
//		int sum = 0;
//		int cnt = 0;
//		
//		int oddSum = 0;
//		int evenSum = 0;
//		
//		for (int i = 0; i < 100; ++i) {
//			 int ran = (int)(Math.random() * 1001 + 4000);	// 0(+4000) ~ 1000(+4000)
//			 list.add(ran);
//			
//			 sum += ran;
//			 ++cnt;
//			 
//			 if (ran % 2 != 0) {
//				 oddSum += ran;					 
//				 oddList.add(ran);				
//			 } else {
//				 evenSum += ran;
//			 }
//		}
//		System.out.println("1번 답: " + list);
//		
//		// System.out.println("총합: " + sum);
//		// System.out.println("정수의 개수: " + cnt);
//		System.out.println("2번 답: 평균 (" + sum / cnt + ")");
//		System.out.println("2번 답: 평균 (" + sum / 100.0 + ")");
//		
//		System.out.println("3번 답: 짝수를 제거한 총합 (" + oddSum + ")");
//		System.out.println("4번 답: 홀수를 제거한 총합 (" + evenSum + ")");
//	
//			
//		System.out.println(oddList);
//		System.out.println("5번 답: " + oddList.get(9));
//		
//		
//		
//		
//	}


}
