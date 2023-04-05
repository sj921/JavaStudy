package quiz;

public class B02_ConditionQuiz01 {

	/*
		# 알맞은 비교 연산을 만들어보세요
		
		 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		 2. int형 변수 b가 짝수일 때 true
		 3. int형 변수 c가 7의 배수일 때 true
		 4. int형 변수 d와 e의 차이가 30일 때 true
		 5. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		 6. boolean형 변수 powerOn이 false일 때 true
		 7. 문자열 참조변수 str이 "yes"일 때 true
	
	*/
	
	
	public static void main(String[] args) {
//		 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		int a = 30;								// ※ int와 int 타입의 비교 연산 결과는 boolean 타입이다
		
		boolean result1 = a > 10 && a < 20;		// 10 < a < 20; (자주 틀리는 오답)
												// int - int - int --> (int - int =>) boolean 과 int 비교 --> X
												// 10 < a && a < 20 --> 변수가 왼쪽에 있는 것이 좋다(헷갈릴 수 있다)
		System.out.println("1번 결과 : " + result1);	
		
		
//		 2. int형 변수 b가 짝수일 때 true
		int b = 4;		
		
		System.out.println("2번 결과 : " + (b % 2 == 0));			
		
		
//		 3. int형 변수 c가 7의 배수일 때 true
		int c = 49;
		
		System.out.println("3번 결과 : " + (c % 7 == 0));
		
		
//		 4. int형 변수 d와 e의 차이가 30일 때 true
		int d = 30, e = 0;
		
		boolean result4 = Math.abs(d - e) == 30 ;		// 	boolean result4 = d - e == -30 || d - e == 30;
		
		System.out.println("4번 결과 : " + result4);
		
		
//		 5. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
//		= > 2월이 하루 더 있나 없나를 알 수 있는 공식 (윤년)
		int year = 2022;
		
		boolean result5 = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		
		System.out.printf("%d년에는 2월이 하루 더 있나요? %s\n", year, result5);
		
		
//		 6. boolean형 변수 powerOn이 false일 때 true
		boolean powerOn = false;
		
		System.out.printf("지금 전원이 꺼져있나요? %s\n", !powerOn);
		
		
//		 7. 문자열 ★참조변수★ str이 "yes"일 때 true
		
		// String --> 동적(길이 특정 불가)
		// 기본형 변수는 데이터를 차곡차곡 쌓는 곳(스택)에 용량을 확보하고 거기에 값을 저장함 --> ex) int, double, float
		// 참조형 변수는 데이터의 길이가 어떻게 될지 모르기 때문에 데이터를 차곡차곡 넣으면 비효율적이다 --> ex)String
		// 			 스택에는 실제 데이터의 주소(메모리상의 위치)를 저장하고 
		//			 실제 데이터는 데이터를 유동적으로 저장하는 곳(힙)에 저장함  --> 참고) https://n1tjrgns.tistory.com/213
		
		String str1 = "yes";	// str1과 str2는 같은 주소값
		String str2 = "yes";
		String str3 = new String("yes");	// str3 다른 새로운 주소값
											// 값은 같은데 주소가 다른 경우가 많으므로 == 비교X
		
		// * 참조형 변수끼리 ==을 통해 비교하면 실제 내용이 아닌 주소값끼리 비교한다 ★★★(∴ == 으로 비교X)
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		// * 참조형 변수의 실제 내용을 통해 비교하기 위해서는 equals() 메서드를 사용해야 한다 ★★★		
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		
	}
	
}
