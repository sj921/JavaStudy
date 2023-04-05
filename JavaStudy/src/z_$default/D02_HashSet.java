package z_$default;
import java.util.ArrayList;
import java.util.HashSet;

public class D02_HashSet {
	
	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<>();
		
	// set.add(item) : 데이터를 추가한다 (중복은 알아서 제거됨)
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("grape");
		fruits.add("grape");
		fruits.add("grape");
		
		System.out.println(fruits);
		System.out.println("--------------");
		
		
		// get은 사용할 수 없다
		// forEach : 배열, 리스트, 집합 등에서 요소를 하나씩 꺼내며 반복하는 문법
		String[] animals = {"lion", "tiger", "bear", "dolphin"};
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("--------------");
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("--------------");
		
		// set.contains(item)
		System.out.println("수박 있니? " + fruits.contains("수박"));
		
		// set.remove(item)
		System.out.println("삭제 성공? " + fruits.remove("applee"));
		System.out.println("--------------");
		
		// set.removeAll(Collection) : 포함된 모든 내용 삭제
		HashSet<String> toRemove = new HashSet<>();
		
		toRemove.add("watermelon");
		toRemove.add("peach");
		toRemove.add("grape");
		
		System.out.println(fruits.removeAll(toRemove));
		System.out.println("삭제 후: " +  fruits);
		
		// Set도 Collection이기 때문에 다른 컬렉션으로의 변환이 자유롭다
		ArrayList<String> fruitList = new ArrayList<>(fruits);
		
		System.out.println(fruitList);
		System.out.println(fruitList.get(0));
		
		
		
	}
	
}









