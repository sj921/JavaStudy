package myobj2;

// 제네릭은 이 클래스의 인스턴스 생성시 결정된다 (결정하지 않으면 Object 타입이 된다)
public class MyCollection<MyType> {
					// <제네릭명> : 어떤 상태가 될 지 알 수 없음??
	
	MyType data;
	Object[] array = new Object[10];	
		
	int index = 0;
	
	public void print() {
		System.out.println(data);
	}
	
	public void add(MyType data) {
		// 쓰던 배열이 가득 차면 새로운 배열을 2배 크기로 만든 후 데이터를 옮긴다
		if (index == array.length) {
			Object[] newArray = new Object[array.length * 2];
			
			// 데이터 복사
			for (int i = 0; i < array.length; ++i) {
				newArray[i] = array[i];
			}
			
			// 새로 생성한 배열로 교체
			array = newArray;
		}
		array[index++] = data;
	}

	public MyType get(int index) {
		return (MyType)array[index];
	}
	
}
