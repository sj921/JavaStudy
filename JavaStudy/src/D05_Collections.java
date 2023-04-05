import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import blackjack.Card;

public class D05_Collections {

	/*
		# java.util.Arrays
		
		- 배열을 편하게 다룰 수 있는 메서드들이 모여있는 클래스
				
		# java.util.Collections
		
		- 컬렉션을 편하게 다룰 수 있는 메서드들이 모여있는 클래스
		
	*/
	
	public static void main(String[] args) {
	
		List<Double> list = new ArrayList<>();
		Set<Double> set = new HashSet<>();;
	
		// Collections.addAll(Collection, ...): 해당 컬렉션에 여러 데이터를 한번에 추가하는 메서드
		// ? super T : Double타입을 상속받는 모든 것이 들어갈 수 있다
		Collections.addAll(list, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6);		// set.add(1.1)이 아니라 한번에 추가
		Collections.addAll(set, 1.11, 2.22, 3.33, 4.44, 5.55);
		
		System.out.println(list);
		System.out.println(set);
		
		// Collections.copy(dest, src);  불편함 (복사되는 컬렉션이 더 작은 경우 에러) 
		// dest => 목적지, src => 원본
		List<Double> copied = new ArrayList<>();
		
		// 개수를 일부러 맞춰놔야 복사됨
		Collections.addAll(copied, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1 );
				
		Collections.copy(copied, list);
		
		System.out.println("원본: " + list);
		System.out.println("복사본: " + copied);
		
		copied.set(0, 9.9);
		
		System.out.println("원본: " + list);
		System.out.println("복사본: " + copied);
		
		// Collections.fill(list, item): 해당 리스트의 모든 값을 원하는 값으로 초기화
		Collections.fill(copied, 7.777);
		System.out.println(copied);
		
		// Collections.frequency(list, item): 리스트에 해당 값이 몇 개 들어있는지 알려준다
		List<String> fruits = new ArrayList<>();
		
		Collections.addAll(fruits, "apple", "apple", "banana", "apple", "kiwi");
		Collections.addAll(fruits, "apple", "mango", "banana", "peach", "kiwi");
		Collections.addAll(fruits, "apple", "peach", "apple", "apple", "grape");
		
		int a = Collections.frequency(fruits, "apple");
		
		System.out.printf("apple은 %d번 등장했습니다.\n", a);
		
		// Collections.max(coll): 해당 컬렉션에서 가장 큰 값을 하나 꺼내 반환
		// --> 알파펫 순으로 가장 뒤에 있는 것
		// Collections.min(coll): 해당 컬렉션에서 가장 작은 값을 하나 꺼내 반환
		// --> 알파펫 순으로 가장 앞에 있는 것
		System.out.println("제일 큰 과일? " + Collections.max(fruits));
		System.out.println("제일 큰 값? " + Collections.max(set));
		System.out.println("제일 큰 과일? " + Collections.min(fruits));
		System.out.println("제일 큰 값? " + Collections.min(set));
		
	
		List<Card> cardList = new ArrayList<>();
		
		for (int i = 0; i < 13; ++i) {
			cardList.add(new Card(2, i));
		}
		
		// Collections.fill(cardList, new Card(0, 0));
		
		// Collections.shuffle(list): 요소를 랜덤으로 섞는다
		Collections.shuffle(cardList);
		System.out.println(cardList);
		
		
		// Collections.rotate(list, distance): 해당 리스트를 원하는 만큼 순환시킨다
		for (int i = 0 ; i < 10; ++i) {
			Collections.rotate(cardList, -2);
			System.out.printf("rotate %d: %s\n", i, cardList);
		}
		
		
		// Collections.swap(list, i, j); i와 j의 값을 교체
		System.out.println("교체 전: " + cardList);
		Collections.swap(cardList, 0, 5);
		System.out.println("교체 후: " + cardList);
		
		// Collections.replaceAll(list, old, new): 해당 리스트의 모든 값을 교체
		Collections.replaceAll(fruits, "apple", "pineapple");
		System.out.println(fruits);
		
		// Collections.reverse(list): 해당 리스트를 거꾸로 뒤집는다
		System.out.println("뒤집기 전: " + cardList);
		Collections.reverse(cardList);
		System.out.println("리버스: " + cardList);
		
		// Collections.sort(list): 해당 리스트를 정렬한다
		Collections.sort(fruits);
		System.out.println(fruits);
		Collections.reverse(fruits);
		
		// 카드가 들어있는 컬렉션은 아직 정렬할 수 없다 (정렬 기준이 없기 때문에)
		// Collections.sort(cardList);
		
		
		
		
		
		
	}
	
	
}


























