package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class D07_CountRandomFruits {

	/*
		리스트에 String 타입 랜덤 과일 이름을 300개 추가하고
		각 과일이 몇 번 등장했는지 세어보세요
		(apple, banana, kiwi, orange, grape, peach, pineapple)	
	*/
	
	public static void main(String[] args) {
	
		String[] fruitNames = {"apple", "banana", "kiwi", "orange", "grape", "peach", "pineapple"};
		
		List<String> fruits = new ArrayList<>();
		
		Random r = new Random();
		
		for (int i = 0; i < 300; ++i) {
			fruits.add(fruitNames[r.nextInt(fruitNames.length)]);
		}
		
// 방법1
		
		HashMap<String, Integer> fruitCount = new HashMap<>();
		
		for (String fruit : fruits) {
			// 새로운 과일이 등장했을 때는 1을 넣고 null을 리턴한다
			// 이미 값이 들어가 있을 때는 값을 꺼낸다
			Integer count = fruitCount.putIfAbsent(fruit, 1);
			
			// 이미 count를 세기 시작했던 과일이라면 1증가 시킨다
			if (count != null) {
				fruitCount.put(fruit, count + 1);
			}
		}
		System.out.println(fruitCount);
		
		
// 방법2		
		int size = fruits.size();
		int[] count = new int[fruitNames.length];
		
		for (int i = 0; i < size; ++i) {
			// System.out.println(fruits.get(i));	// 들어있는 과일 보기..
			String fruit = fruits.get(i);
			if (fruit.equals("apple")) {
				count[0] += 1;
			} else if (fruit.equals("banana")) {
				count[1] += 1;
			} else if (fruit.equals("kiwi")) {
				count[2] += 1;
			} else if (fruit.equals("orange")) {
				count[3] += 1;
			} else if (fruit.equals("grape")) {
				count[4] += 1;
			} else if (fruit.equals("peach")) {
				count[5] += 1;
			} else if (fruit.equals("pineapple")) {
				count[6] += 1;
			} 
		}
		System.out.println(Arrays.toString(count));
		
		
// 		이름을 하나 검사할 때마다 300번씩 검사하므로 비효율적인 방법이다.. (총 2100번 반복)
//		for (int i = 0; i < fruitNames.length; ++i) {
//			System.out.printf("%s's count: %d\n", fruitNames[i], 
//					Collections.frequency(fruits, fruitNames[i]));
//		}

	}
}















// 내가 푼 거...	--> 클래스 생성할 필요 없는데.... 잘 모르니 이것저것 대입만 하게 된다.... 결론은 복습이 덜 된 것 같다ㅠㅠ 열공하자...
//		List<Fruits> fruits = new ArrayList<>();
//		
//		
//		for (int i = 0; i < 300; ++i) {
//			fruits.add(new Fruits());
//		}
//	
//		System.out.println(fruits);
//		
//		int a = Collections.frequency(fruits, "apple");
//		System.out.printf("%d번 등장", a);
//		
//		