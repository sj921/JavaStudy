import myobj2.Electronics;

public class C12_LocalInnerClass {
/*
	# 지역 내부 클래스
	
	- 메서드 내부에도 클래스를 만들 수 있다
	- 해당 메서드가 끝나고 나면 사용할 수 없는 설계도
	- 메서드 밖에서는 접근 불가능
	
	# 익명 지역 내부 클래스
	
	- 메서드 내부에서 이미 존재하는 클래스를 바로 수정하며 사용하는 방식
	  (생성과 동시에 상속)
	
*/
	
	public static void main(String[] args) {
		// 일반적인 지역 내부 클래스 (메서드 내부의 클래스를 만들고 인스턴스를 쓸 수 있다)
		class Grape {
			int qty;
			String grade;
			
			@Override
			public String toString() {
				return grade + "등급 포도";
			}
			
		}
		
		Grape g = new Grape();
		
		g.qty = 33;
		g.grade = "A+";
		
		System.out.println(g);
				
		
		
		// ★★★ 익명 지역 내부 클래스 (한번 쓰고 버릴 일회용 클래스) --> 업 캐스팅하는 경우 사용 多
		Electronics e = new Electronics("에어컨", 149);
		Electronics e2 = new Electronics("전자레인지", 123) {
			// Electronics 클래스를 마음대로 수정 가능
			// -> 즉시 상속받아서 오버라이딩이 가능
			@Override
			public void start() {
				System.out.println("안에 들어있는 것을 돌리기 시작합니다.");
			}
		};
		
		e.start();
		e2.start();
	}	

	
	
	
	
//	public static void method2() {
//		Grape g = new Grape();	// --> 메서드 밖이므로 가져다 사용할 수 없다
//	}	
	
	
	
}
