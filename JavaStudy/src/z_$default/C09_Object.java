package z_$default;
import myobj.Apple;
import myobj.Grade;

public class C09_Object {
	/*
		# Object Class
		
		- 모든 자바 클래스들의 최고 조상 클래스
		- Object 클래스의 메서드는 모든 자식 클래스들에게 존재한다
		- Object 클래스의 메서드를 주로 해당 클래스에 맞는 형태로 오버라이드 하여 사용한다
		
		# Object.toString()
		
		- '해당 인스턴스가 문자열로 표현된다면 어떤 모양이어야 하는가'를 정의해놓는 메서드
		- 주로 print() 메서드들이 해당 인스턴스의 toString()을 호출하도록 설계되어 있다
		- toString()의 기본 동작은 해당 인스턴스의 클래스의 이름과 주소값을 출력하는 것이다
		
		# Object.equals(obj)
		
		- '두 인스턴스를 같다고 할 수 있는 기준'을 정의해놓는 메서드
	*/
	public static void main(String[] args) {
	
		Apple a1 = new Apple();		//f3누르면 해당 위치로 이동
		Apple a2 = new Apple();
		
		// println은 사실 전달한 인스턴스의 toString()을 콘솔에 출력하는 메서드이다
		System.out.println(a1);
		System.out.println(a2.toString());	
		
//		System.out.println(a1.equals(a1));
//		System.out.println("abc" == "abc");	// 실제 내용을 비교하는 것이 아닌 주소값을 비교하는 것
		
		// 두 성적이 같은 주소를 갖고 있는지 비교하는 것이 아니라
		// 같은 점수를 가지고 있는지 비교하기 위해 equals를 오버라이드
		Grade g1 = new Grade (80, 90, 12050);
		Grade g2 = new Grade (80, 90, 12050);
		
//		Object obj = g2;	// 업 캐스팅 된 상태에서는 자식 타입에서 가지고 있던 기능을 사용할 수 없다
//		System.out.println(obj.kor);	
		
		System.out.println("g2의 kor: " + g2.kor);
		
		System.out.println(g1);
		System.out.println(" == 비교: " + (g1 == g2));
		System.out.println("equals 비교: " + g1.equals(g2));	
	
		// Object 타입은 모든 타입의 부모이기 때문에
		// 모든 타입에서 업캐스팅 될 수 있다
		Object o1 = 1;
		Object o2 = "String";
		Object o3 = new Apple();
		
		System.out.println();
		
	}
	
}
