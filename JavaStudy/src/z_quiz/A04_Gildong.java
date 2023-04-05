package z_quiz;

public class A04_Gildong {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		String tel = "010-1234-1234";
		double height = 178.5;	// float height = 178.5F;
		double weight = 75;		// 몸무게도 실수타입에 저장! (int (X)) --> ※ 값의 범위를 생각하기!
		String bloodtype = "O";	// AB형을 저장할 수 없으므로 char타입이 아니라 String 타입으로!
		
		System.out.println("======== 출력 결과 ========\n");
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + tel);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈액형\t: " + bloodtype);
		
	}
	
}
