
public class A05_VarNaming {

	/*
		# 우리가 변수를 사용하는 이유
		 
		 1. 가독성을 높일 수 있다
		 
		 2. 여러곳에서 사용되는 값을 한번에 변경할 수 있다
		 
		# 변수 작명 규칙 (권장)
		
		 1. 두 단어 이상을 이어붙인 변수명을 사용할 때 _를 사용한다 (snake_case)
			ex> apple_price, apple_weight, apple_qty
			
		 2. 두 단어 이상을 이어붙인 변수명을 사용할 때 대문자를 사용한다 (camelCase)  --> 더 많이 씀
		 	ex> applePrice, appleWeight, appleQty

		 3. 변수명의 첫 글자는 소문자를 사용해야 한다 ★
		 
		 4. 프로그램 내에서 프로그램이 꺼질 때까지 변하지 않을 변수는 모두 대문자를 사용한다 ★
		 	ex> MAX_WEIGH, MAX_QTY, PI
		 
		 5. 클래스명의 첫 글자는 대문자를 사용한다
		 	(이름만으로 클래스와 변수를 구분하기 위한 장치)
		 	
		 6. 패키지명은 모두 소문자를 사용한다.
		 	(이름만으로 클래스와 변수를 구분하기 위한 장치)
		 
		 7. 해당 변수의 목적이나 들어있는 값을 쉽게 파악할 수 있는 단어를 변수명으로 사용해야 한다
		 
		# 변수 작명 규칙 (필수, 지키지 않으면 에러 발생)
		
		 1. 변수의 첫 번째 글자는 숫자를 사용할 수 없다
		 	ex. 7eleven, 1st, 2nd, 4pple
		 
		 2. 변수명 사이에는 공백을 사용할 수 없다
		 
		 3. 특수문자는 _와 $만 사용할 수 있다
		 	ex> $uperman, $_apple
		 	
		 4. 이미 자바에서 사용하고 있는 키워드(예약어)들은 변수명으로 사용할 수 없다
		 	(Eclipse에서 예약어들은 보라색으로 표시된다)
		 	ex> public, static, void, int, double, ...
	*/
	
	public static void main(String[] args) {
		int apple = 35; 				 
		int apple_price = 483;			
		double apple_weight = 123.47;	
		
		System.out.println("사과의 개수 : " + apple);
		System.out.println("사과의 총 가격(￦) : " + apple * apple_price + "원");
		System.out.println("사과의 총 무게(g) : " + apple * apple_weight + "g");
		System.out.println("사과의 g당 가격 : " 
							+ (apple * apple_price) / (apple * apple_weight) + "원");
		
	}
	
}
