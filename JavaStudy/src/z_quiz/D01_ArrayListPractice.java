package z_quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice {

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
		System.out.println("총합: " + sum);
		System.out.println("평균: " + sum / (double)list.size());
		
		for (int i = 0; i < list.size(); ++i) {
			int num = list.get(i);
			
			if (num % 2 == 0) {
				evens.add(list.get(i));
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
		
		System.out.println("짝수 합: " + evenSum);
		System.out.println("홀수 합: " + oddSum);
		
		System.out.println("짝수 list: " + evens);
		System.out.println("홀수 list: " + odds);
		System.out.println("10번째 홀수: " + odds.get(9));
	}
}









