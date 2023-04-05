package z_$default;

public class D04_WrapperClass {
	
	public static void main(String[] args) {
		
		// 문자열을 숫자 값으로 변환
		int value = Integer.parseInt("12345", 8);
		System.out.printf("%d\n", value);

		// 원하는 진법으로 숫자 값을 추출하는 오버로딩
		value = Integer.parseInt("AF123", 16);
		System.out.printf("%d\n", value);
				
		// 문자열의 원하는 부분을 숫자로 추출하는 오버로딩 (from, to --> to 미만으로 출력)
		value = Integer.parseInt("Hello!! 12345 Good!", 8, 13, 10);		// 마지막 10은 10진수를 의미!
		System.out.printf("%d\n", value);

		float fvalue = Float.parseFloat("123.1234");
		System.out.println(fvalue);
		
		boolean boolvalue = Boolean.parseBoolean("tRuE");
		System.out.println(boolvalue);
		
		
		String strValue = Integer.toString(12345, 2);
		System.out.println(strValue); 	// 110000, 00111001 --> 1byte씩
		
		strValue = Boolean.toString(false);
		System.out.println(strValue);
		
		// 각 타입에 대한 상수들
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		value = Integer.min(10, 15);
		System.out.println(value);
		
		System.out.println(Integer.SIZE + "bits");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
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
		System.out.println("is 소문자? " + Character.isLowerCase('a'));
		System.out.println("해당 문자의 타입: " + Character.getType('_'));
		
		// 공백
		System.out.println("공백이니? " + Character.isWhitespace(' '));
		System.out.println("공백이니? " + Character.isWhitespace('\t'));
		System.out.println("공백이니? " + Character.isWhitespace('\n'));
		
		
		// 자바의 변수명 첫번째 글자로 사용할 수 있는가?
		System.out.println(Character.isJavaIdentifierStart('#'));
		System.out.println(Character.isJavaIdentifierStart('$'));
		System.out.println(Character.isJavaIdentifierStart('_'));
		System.out.println(Character.isJavaIdentifierStart('8'));
		
		
		
	}
}














