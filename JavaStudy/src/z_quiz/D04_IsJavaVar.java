package z_quiz;

import javax.lang.model.SourceVersion;

public class D04_IsJavaVar {

	/*
		문자열을 매개변수로 전달하면 해당 문자열이 자바 변수로써 사용할 수 있는지
		검사해주는 메서드를 만들어보세요
	*/
	
	public static boolean isJavaVar(String word) {
		if (SourceVersion.isKeyword(word)) {
			System.out.println("예약어는 변수로 사용할 수 없습니다.");
			return false;
		}
		
		if (!Character.isJavaIdentifierStart(word.charAt(0))) {
			System.out.printf("[%s]첫번째 글자가 " + "자바 변수에 사용할 수 없는 문자입니다", word);
			return false;
		}
		
		for (int i = 1; i < word.length(); ++i) {
			if(!Character.isJavaIdentifierPart(word.charAt(i))) {
				System.out.printf("[%s]의 %d번째 글자가 " + "자바 변수에 사용할 수 없는 문자입니다.", word, i + 1);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isJavaVar("sevenEleven"));
		System.out.println(isJavaVar("7Eleven"));
		System.out.println(isJavaVar("se#vn"));
		System.out.println(isJavaVar("public"));
		System.out.println(isJavaVar("void"));
		System.out.println(isJavaVar("int"));
	
	System.out.println(SourceVersion.isIdentifier("apple123"));
	System.out.println(SourceVersion.isIdentifier("apple 123"));
	System.out.println(SourceVersion.isIdentifier("123apple"));
	
	
	}
	
	
	
	
}


// 변수명 첫글자로 숫자X
// 변수명에 특수문자는 $와 _만 사용가능
// 변수명 공백X
// 변수명에 예약어는 사용불가
// 변수명 고정된 값은 대문자, 아니면 소문자로 작성