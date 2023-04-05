package z_quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Jiphap {
	// 1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
	//  [1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
	
	public static Set union(Collection a, Collection b) {
		Set hap = new HashSet<>();
		
		hap.addAll(a);
		hap.addAll(b);
		
		return hap;
	}	
	
	// 2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	//  [1, 2, 3] 교 [2, 3, 4, 5] => [2, 3]
	public static Set intersection(Collection a, Collection b) {
		Set inter = new HashSet<>();   
		
		inter.addAll(a);
		inter.retainAll(b);		// a에 있는 걸 다 넣고, b와 겹치는 게 있으면 남겨놓음
		
		return inter;
	}
	
	// 3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	//  [1, 2, 3] - [2, 3, 4, 5] => [1]
	//  [2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	public static Set difference(Collection a, Collection b) {
		Set diff = new HashSet<>();   
		
		diff.addAll(a);
		diff.removeAll(b);		// a에 있는 걸 다 넣고, b와 겹치는 게 있으면 남겨놓음
		
		return diff;
	}
	
	public static void main(String[] args) {
		
		List<Integer> c = new ArrayList<>();
		Set<Integer> d = new HashSet<>();
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
	
		System.out.println("Intersection C, D: " + intersection(c, d));
		
		List<String> a = new ArrayList<>();
		Set<String> b = new HashSet<>();
		
		a.add("apple");
		a.add("banana");
		a.add("banana");
		a.add("orange");
		
		b.add("banana");
		b.add("banana");
		b.add("banana");
		b.add("kiwi");
		b.add("grape");
		
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
		System.out.println("D: " + d);
		System.out.println("Union A, B: " + union(a, b));
		System.out.println("Intersection A, B: " + intersection(a, b));
		System.out.println("Intersection A, C: " + intersection(a, c));
		System.out.println("Intersection C, D: " + intersection(c, d));
		System.out.println("Diff A, B: " + difference(a, b));
		System.out.println("Diff B, A: " + difference(b, a));
		
		
		
	}
	
}
