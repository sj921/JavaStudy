//class Integer {
//	int[] value;		// ?
//}
//
//class String {
//	char[] value;
//	
//	public char charAt(int index) {
//		return value[index];
//	}
//}

public class D04_WrapperClass {
	/*
		# Wrapper Class
		
		- 각 기본형 타입에 대응하는 참조형 타입
		- 각 타입과 관련된 유용한 기능들이 해당 클래스에 정의되어 있다

		# 기본형
		- int, char, byte, short, long, float, double, boolean
		
		# 참조형		
		- Integer, Character,Byte, Short, Long, Float, Double, Boolean
	*/
	
	public static void main(String[] args) {
		
		/*
			# Parsing
			
			- 문자열을 해당 타입으로 변환하는 것
			- 각 클래스마다 해당 메서드가 있음
		*/
		// 문자열을 숫자 값으로 변환
		int value = Integer.parseInt("12345", 8);
		System.out.printf("%d\n", value);
		System.out.println("-------------------");
		
		// 원하는 진법으로 숫자 값을 추출하는 오버로딩
		value = Integer.parseInt("AF123", 16);
		System.out.printf("%d\n", value);
		System.out.println("-------------------");
		
		// 문자열의 원하는 부분을 숫자로 추출하는 오버로딩 (from, to --> to미만으로 출력) 
		value = Integer.parseInt("Hello!! 12345 Good!", 8, 13, 10);
		System.out.printf("%d\n", value);
		
		float fvalue = Float.parseFloat("123.1234");
		System.out.println(fvalue);
		
		boolean boolvalue = Boolean.parseBoolean("TrUE");
		System.out.println(boolvalue);
		System.out.println("-------------------");
	
		
		
		/*
			# toString
			
			- 각 타입 값을 문자열로 반환하는 기능
			- 정수 값을 원하는 진법의 문자열로 쉽게 변환할 수 있다
		*/
		
		String strValue = Integer.toString(12345, 2);
		System.out.println(strValue); 		// 110000, 00111001 --> 1byte씩?
		
		strValue = Boolean.toString(false);
		System.out.println(strValue);
		
		// 각 타입에 대한 상수들
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		value = Integer.min(10, 15);
		System.out.println(value);
		
		System.out.println(Integer.SIZE + "bits");
		System.out.println(Float.MAX_VALUE);		// E38 : 10^38
		System.out.println(Float.MIN_VALUE);		// E-45 : 10^45	
		System.out.println(Double.MAX_VALUE);		
		System.out.println(Double.MIN_VALUE);		
		System.out.println(Character.SIZE + "bits");	
		
		// Character 타입의 유용한 기능들
		System.out.println("is 글자? " + Character.isAlphabetic('A'));
		System.out.println("is 글자? " + Character.isAlphabetic('한'));
		System.out.println("is 글자? " + Character.isAlphabetic('뙗'));
		System.out.println("is 글자? " + Character.isAlphabetic(1123456));
		System.out.println("is 글자? " + Character.isAlphabetic('_'));
		System.out.println("is 글자? " + Character.isAlphabetic('$'));
		
		// 대소문자
		System.out.println("is 대문자? " + Character.isUpperCase('A'));
		System.out.println("is 소문자? " + Character.isLowerCase('A'));
		System.out.println("해당 문자의 타입: " + Character.getType('_'));
		
		// 공백
		System.out.println("공백이니? " + Character.isWhitespace(' '));
		System.out.println("공백이니? " + Character.isWhitespace('\t'));
		System.out.println("공백이니? " + Character.isWhitespace('\n'));
		
		// 숫자 구분
		System.out.println("숫자니? " + Character.isDigit('0'));
		System.out.println("숫자니? " + Character.isDigit('가'));
		
		// 자바의 변수명 첫번째 글자로 사용할 수 있는가?
		System.out.println(Character.isJavaIdentifierStart('#'));
		System.out.println(Character.isJavaIdentifierStart('$'));
		System.out.println(Character.isJavaIdentifierStart('_'));
		System.out.println(Character.isJavaIdentifierStart('7'));
		
		
		
		
		
		
		
	}
}














