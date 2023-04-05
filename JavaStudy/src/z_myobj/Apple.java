package z_myobj;

public class Apple {
	public int size;
	public int grade;
	public String color;
	
	// 인스턴스 생성시 다음 생성자들 중 하나를 반드시 호출해야 한다
	public Apple() {
		size = 30;
		grade = 3;
		color = "기본 색상";
	}
	
	// 생성자도 오버로딩이 가능하다
	public Apple (int size) {
		
	}
	
	public Apple (int size, int grade) {
		// this :  각 인스턴스 영역을 의미한다
		this.size = size;
		this.grade = grade;
		this.color = "기본 색상";
	}
	
	public Apple (int s, int g, String c) {
		// 이름이 겹치지 않을 때에는 this 생략 가능
		size = s;
		grade = g;
		color = c;
	}
	

	public void info() {
		System.out.printf("크기: %d, 등급: %d, 색깔: %s\n", this.size, this.grade, this.color);

	}
	
	
	
}
