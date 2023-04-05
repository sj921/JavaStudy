package z_$default;

public class C10_AccessModifier extends quiz.C10_AccessModifierTest {

	public C10_AccessModifier() {
		System.out.println(super.a);
		System.out.println(super.b);
		
		// default는 상속 받아도 다른 패키지에서 사용 불가능
		// System.out.println(super.c);	
		
		// 상속 받아도 private는 사용 불가능
		// System.out.println(super.d);	
	}
	
	/*
		# 접근 제어자 (Access Modifier)
		
		- 다른 클래스에서 해당 자원을 사용하려고 할 때 허용 범위를 설정한다
		
		# 종류
		
		- public	: 다른 패키지에서도 자유롭게 접근할 수 있다
		- protected	: 다른 패키지에서는 상속을 받은 경우에만 접근할 수 있다
		- default	: 다른 패키지에서는 접근할 수 없다
		- private	: 같은 클래스 내부에서만 접근할 수 있다
		
		# 용도
		
		- 내가 만든 클래스에서 다른 패키지에서도 보였으면 하는 자원과
		  보이지 않았으면 하는 자원을 설정하여 해당 클래스를 원래 의도대로 사용할 수 있게 한다
	*/
	public static void main(String[] args) {
		
		// 같은 패키지의 다른 클래스를 가져다 사용하는 경우
		C10_AccessModifierTest test1 = new C10_AccessModifierTest();
		
		System.out.println(test1.a);	// public 사용 가능
		System.out.println(test1.b);	// protected 사용 가능
		System.out.println(test1.c);	// default 사용 가능
		// System.out.println(test1.d);	// private 사용 불가능 (볼 수 없게 되어 있음)
		// System.out.println(test1.e);	// 없는 클래스
		
		// 다른 패키지의 다른 클래스를 가져다 사용하는 경우
		quiz.C10_AccessModifierTest test2 = new quiz.C10_AccessModifierTest();
		
		System.out.println(test2.a);	// public 사용 가능
		// System.out.println(test2.b);	// protected 사용 불가능 --> 다른 패키지에서 상속을 받은 경우에만 사용 가능
		// System.out.println(test2.c);	// default 사용 불가능	--> 다른 패키지에서는 사용 불가 
		// System.out.println(test2.d);	// private 사용 불가능	-->	같은 클래스 내부가 아님
		
	}
}
