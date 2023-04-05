package z_$default;

public class C11_InnerClass {
	/*
		# 클래스 내부에도 클래스를 만들 수 있다
		
		- 인스턴스 클래스
		- 스태틱 클래스
	*/
	
	// 스태틱 클래스 - 바깥 인스턴스의 영향을 받지 않는 설계도
	static class Banana{
		
		@Override
		public String toString() {
			return "내부클래스바나나";
		}
	}
	
	
	// 인스턴스 클래스 - 각 인스턴스마다 다를 수 있는 설계도
	class Apple{
		int price;
		
		// 바깥 인스턴스의 상황에 따라 달라질 수 있는 클래스를 만들 수 있다(+ name)
		@Override
		public String toString() {
			return "내부인스턴스사과" + name;
		}
	}
	
	// 인스턴스 변수 - 각 인스턴스마다 다를 수 있는 변수
	int name;
	String age;
	
	// 인스턴스 메서드 - 각 인스턴스마다 다르게 동작할 수 있는 메서드
	boolean check() {
		return name > 10;
	}
	
	
	// 알고 넘어가.....?????????????????????????????????????????
	public static void main(String[] args) {
		// 내부 인스턴스 클래스는 바깥 클래스의 인스턴스가 먼저 생성된 후에 사용할 수 있다
		C11_InnerClass instance = new C11_InnerClass();	// 호출이 되지 않음??
		C11_InnerClass instance2 = new C11_InnerClass();	
		
		instance.name = 125;
		instance2.name = 99;
				
		// 해당 인스턴스 내부의 클래스로 만든 인스턴스
		C11_InnerClass.Apple innerApple = instance.new Apple();
				
		instance.name = 13333;
		
		C11_InnerClass.Apple innerApple2 = instance.new Apple();
		
		System.out.println(innerApple);
		System.out.println(innerApple2);
//		System.out.println(innerApple3);
		
		System.out.println(instance.name);	// 0
		System.out.println(instance.age);	// null
		
		instance.check();
		
		// 인스턴스 클래스의 인스턴스 생성하기
		System.out.println(new C11_InnerClass().new Apple());
				
		// 스태틱 클래스의 인스턴스 생성하기
		C11_InnerClass.Banana nestedBanana = new C11_InnerClass.Banana();
		System.out.println(nestedBanana);
		
	}
	
}
