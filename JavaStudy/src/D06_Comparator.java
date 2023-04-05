import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import myobj.Peach;
import myobj.PeachPriceComparator;
import myobj.PeachSweetComparator;

public class D06_Comparator {

	/*
		# Comparable 인터페이스
		
		- 이 인터페이스를 구현한 클래스는 크기 비교가 가능해진다
		- 크기 비교가 정렬의 기준이 된다 (정렬이 가능해진다)
				
		# Comparator 인터페이스
	
		- 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다
		- 해당 클래스의 인스턴스를 정렬 기준으로 사용할 수 있다
	*/
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		Collections.addAll(nums, 33, 1, 9, 17, 100, 5, 24, 88);
				
		
		
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		
		
		// 복숭아는 아직 크기 비교가 구현되지 않았기 때문에 정렬을 할 수 없다
		List<Peach> peachs = new ArrayList<>();
		
		for (int i = 0; i < 10; ++i) {
			peachs.add(new Peach());
		}
		
		System.out.println(peachs);
		
		// 복숭아를 등급 기준으로 크기 비교가 가능한 객체로 만든 후 정렬
		Collections.sort(peachs);
		System.out.println(peachs);
		
		// 복숭아에 내장된 compareTo 대신 다른 Comparator를 사용할 수 있다
		Collections.sort(peachs, new PeachSweetComparator());
		System.out.println(peachs);
		
//		Peach standard = new Peach();
//		
//		for (Peach p : peachs) {
//			System.out.printf("%s vs %s: %d\n", standard, p, standard.compareTo(p));
//		}		
		
		// 연습1: 복숭아에 가격을 추가하고 가격 기준으로 오름차순 정렬해보세요 
		Collections.sort(peachs, new PeachPriceComparator());
		System.out.println(peachs);
				
		// 연습2: 가격이 같은 경우 당도 기준으로 내림차순 정렬해보세요
		Collections.sort(peachs, new Comparator<Peach>() {	// 인터페이스도 즉시 상속 가능
			
			@Override				
			public int compare(Peach o1, Peach o2) {			// 익명 클래스 (한번 쓰고 버림)
				int result = o1.getPrice() - o2.getPrice();		// -1 곱하면 반대방향으로 됨!
								
				if (result == 0) {
					return Double.compare(o2.getSweet(), o1.getSweet());
				} else {
					return result;
				}
			}
			
		});
		
		System.out.println("당도: " + peachs);
		
		// 심화 : 원산지의 영어 이름을 추가하고 원산지의 이름 기준으로 오름차순 정렬 해보세요
		// --> String 클래스는 이미 Comparable 인터페이스가 구현되어 있음
		Collections.sort(peachs, new Comparator<Peach>() {
			
			@Override
			public int compare(Peach o1, Peach o2) {
				return o1.getCountryName().compareTo(o2.getCountryName());
				// 내림차순 --> * -1
			}
		});
		System.out.println(peachs);
		
		
		List<String> animals = new ArrayList<>();
					// comparable --> 안에 compareTo라는 메서드 구현되어 있다
		animals.add("lion");
		animals.add("lion");
		animals.add("lion");
		animals.add("tiger");
		animals.add("angus");
		animals.add("cow");
		animals.add("blackcow");
		animals.add("pig");
		
		Collections.sort(animals);
		System.out.println(animals);
		System.out.println("lion".compareTo("tiger"));
		
		
	}
	
}
