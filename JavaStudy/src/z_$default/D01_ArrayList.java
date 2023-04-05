package z_$default;

import java.util.ArrayList;

public class D01_ArrayList {

	public static void main(String[] args) {

		// 타입을 지정하지 않고 리스트 생성
		ArrayList myList = new ArrayList();
		ArrayList myList2 = new ArrayList();

		// list.add(item) : 리스트의 맨 뒤에 원하는 데이터를 추가한다
		myList.add("A");
		myList.add(123);
		myList.add(99.9999);
		System.out.println(myList);

		myList2.add("b");
		myList2.add("c");
		myList2.add("d");
		System.out.println(myList2);

		// list.add(index, item) : 리스트의 원하는 위치에 데이터를 추가
		myList.add(0, "7777");
		System.out.println(myList);

		// list.addAll(Collection) : 다른 컬렉션의 모든 데이터를 추가
		myList.addAll(myList);			// 2배
		System.out.println(myList);
		myList.addAll(myList);			// 4배
		System.out.println(myList);

		// list.addAll(index, Collection): 원하는 위치에 다른 컬렉션 데이터 추가
		myList.add(2, myList2);
		System.out.println(myList);

		// list.get(index) : 원하는 위치의 데이터를 하나 꺼낸다
		// --> 타입을 지정하지 않았을 때는 Object 타입으로 꺼낸다
		Object data = myList.get(5);

		System.out.println(data);
		System.out.println(myList.get(6));
		System.out.println(myList.get(7));

		// list.size(): 해당 리스트의 크기를 반환한다
		System.out.println("myList의 크기: " + myList.size());
		System.out.println("myList2의 크기: " + myList2.size());

		for (int i = 0; i < myList.size(); ++i) {
			System.out.println(myList.get(i));
		}


		// 타입을 지정하면서 리스트 생성하기 (제네릭)
		ArrayList<String> animals = new ArrayList();

		// myList.add(); --> 타입 지정 안하면 Object
		animals.add("강아지");
		animals.add("고양이");
		animals.add("햄스터");

		System.out.println(animals);

		String animal = animals.get(2);
		System.out.println(animals.get(2));

		// list.contains(item): 리스트에 해당 값이 포함되어 있는지 여부를 반환 --> boolean
		System.out.println("리스트에 너구리가 있나요? " + animals.contains("너구리"));

		// list.remove(index): 해당 인덱스의 데이터를 지운다
		// --> 해당 데이터를 지우면서 반환한다
		// list.remove(object): 해당 데이터가 있으면 지운다
		// --> 삭제에 성공하면 true, 실패하면 false --> boolean

		String removed = animals.remove(0);
		System.out.println("지워진 것: " + removed);
		System.out.println("지워진 후의 모습: " + animals);

		boolean success = animals.remove("호랑이");
		System.out.println(success);


		// list.set(index, item): 해당 위치의 값을 원하는 값으로 수정한다		
		animals.add("미어캣");
		animals.add("미어캣");
		animals.add("미어캣");
		animals.add("미어캣");
		animals.add("미어캣");
		animals.add("미어캣");

		animals.set(5,"치타");

		System.out.println(animals);

	}
}






































