package quiz;


public class B08_CountAlphabet {

	/*
		사용자가 문장을 입력하면 해당 문장에 알파벳 e가 몇 회 등장하는지 알려주는 프로그램을 만들어보세요
		(대/소문자 모두 세어야 함)	
		
		Hint : 모든 문자가 해당 문자인지 검사하면 된다
	*/
	
	
	
	public static void main(String[] args) {
		
		// String s = "E";
		// char c = 'E';
		
		// * 다른 타입끼리 연산은 기본적으로는 불가능하다
		// System.out.println('E' == "E");
		
		// 예외1) 소수와 정수를 연산 가능
		// System.out.println(123 < 123.4567);
		
		// 예외2) 문자열은 모든 타입과 +가 가능 (이어붙이기)
		// System.out.println("나이 : " + 123.12345);
		
		// 예외3) 문자 타입은 정수로 인식되어 다른 숫자들과 연산 가능
		// System.out.println('A' + 3.123);
		
		
		
		String text = "Employee Elephant Everland";
		
		int count = 0;
		
		// 0번부터 문자열의 길이만큼 반복하며 문자를 하나씩 꺼낸다
			
		
		for (int i = 0, len = text.length(); i < len; ++i) {
			// 꺼낸 문자가 'e'인지 비교한다
			if (text.charAt(i) == 'e' || text.charAt(i) == 'E') {
				System.out.printf("%d번째에서 e가 등장했습니다. \n", i);
				count++;	// e 또는 E가 등장하면 1 증가시키고 싶다
			}
		}
// 26일 때 오류나는 이유
		System.out.printf("총 %d회 등장했습니다. \n", count);
		
	}
	
		
}


