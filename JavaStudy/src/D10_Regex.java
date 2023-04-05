 import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {
	/*
		# 정규표현식 (Regular Expression)
		
		- 문자열을 패턴으로 검사할 수 있는 표현식
		- 특정 프로그래밍 언어에만 있는 것이 아닌 공통의 규칙
		- 정의한 정규표현식과 일치하는 문자열을 찾을 수 있다
		
		# Java의 정규표현식 관련 클래스
		
		- java.util.regex.Pattern
		- Matcher
	*/
	public static void main(String[] args) {

		// Pattern.matches(regex, input) : input이 regex에 해당하는 문자열인지 검사하는 메서드
		System.out.println(Pattern.matches("sleep", "sleep"));
		System.out.println("----------------");
		
		// [] : 해당 위치에 올 수 있는 한 글자를 정의하는 정규표현식 문법
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println("0----------------");
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println("----------------");
		System.out.println(Pattern.matches("s[lh]eep", "skeep"));
		System.out.println("----------------");
		System.out.println(Pattern.matches("s[lh]eep", "slep"));
		System.out.println("----------------");
		System.out.println(Pattern.matches("[cs][lh]eep", "cleep"));
		System.out.println("----------------");
		System.out.println(Pattern.matches("[cs][lh]eep", "cheep"));
		System.out.println("----------------");
		System.out.println(Pattern.matches("[cs][lh]e[ea]p", "cheep"));
		System.out.println("----------------");
		System.out.println(Pattern.matches("[cs ][lh]e[ea]p", " heap"));		// 공백도 옵션이 될 수 있다
		System.out.println("----------------");
		System.out.println(Pattern.matches("01[016789]-", "013-"));
		System.out.println("1----------------");
		
		// \\는 정규표현식 내부에서도 특수 문법으로 활용되므로 \\를 적어야 그냥 역슬래시를 의미한다
		System.out.println(Pattern.matches("s[hk\\\\]ip", "s\\ip"));				// \는 4개를 써야한다
		System.out.println("----------------");
		
		
		/*
			[abc] : a 또는 b 또는 c를 모두 허용
			[a-z] : a부터 z까지 모두 허용
			[A-Z] : A부터 Z까지 모두 허용
			[a-e&&c-z] : 두 조건을 모두 만족하는 문자를 허용
		*/
		System.out.println(Pattern.matches("[a-e&&c-f]ap", "cap"));
		System.out.println(Pattern.matches("[a-e&&c-f]ap", "dap"));
		System.out.println(Pattern.matches("[a-e&&c-f]ap", "bap"));
		System.out.println("----------------");
		
		
		/*
			# 하나로 여러 문자를 나타내는 것들
			
			. : 모든 문자 허용, [.]이나 \.은 .만 허용한다는 뜻
			\d : 모든 숫자 허용
			\D : 숫자를 제외한 모든 것 허용
			\s : 모든 공백을 허용 (\t, \n, , \r);
			\S : 공백을 제외한 모든 것 허용
			\w : 일반적인 문자들을 허용 ([a-zA-Z0-9_]와 같음)
			\W : \w를 제외한 모든 것 허용
		
		*/
		System.out.println(Pattern.matches(".at", "$at"));
		System.out.println(Pattern.matches(".at", "뷁at"));
		System.out.println(Pattern.matches("[.]at", ".at"));
		System.out.println(Pattern.matches("....[.]jpg", "ship.jpg"));
		System.out.println(Pattern.matches("....\\.jpg", "abcd.jpg"));
		System.out.println(Pattern.matches("Windows[\\d]", "Windows8"));
		System.out.println(Pattern.matches("Windows[\\d]", "Windows10"));
		System.out.println(Pattern.matches("\\d\\d\\s\\d", "12\n3"));
		System.out.println("----------------");

		/*
			# 해당 패턴이 적용될 문자의 개수를 지정하는 방법
			
			.{n}	: {} 앞의 패턴이 n개 일치해야 한다
			.{n,m}	: {} 앞의 패턴이 n개 이상 m개 이하 일치해야 한다 (★★m개 이하)
			.{n,}	: {} 앞의 패턴이 n개 이상 일치해야 한다
			.?		: ? 앞의 패턴이 0번 또는 한 번 나와야 한다
			.+		: + 앞의 패턴이 최소 한 번 이상 나와야 한다
			.*		: * 앞의 패턴이 0번 이상 나와야 한다
		
		*/
		System.out.println(Pattern.matches("\\d{6}-\\d{7}", "123456-9999999"));
		System.out.println(Pattern.matches("\\d{2,4}", "12"));
		System.out.println(Pattern.matches("\\d{5}", "1234567899a999"));		// 숫자로만 5개 이상
		System.out.println(Pattern.matches("\\w?[.]\\w+[.]\\w*[.]\\w+", ".abcdef..f"));		// 숫자로만 5개 이상
		System.out.println(Pattern.matches("\\w?[.]\\w+[.]\\w*[.]\\w+", "a.a.a.a"));		// 숫자로만 5개 이상
		System.out.println(Pattern.matches("\\w?[.]", "a."));		
		System.out.println("----");
		
		// 연습1 : 해당 문자열이 핸드폰 번호인지 검사할 수 있는 정규표현식을 만들어보세요
		// 		 (옛날 번호 포함)
		String phoneNum = "019-123-1234";
		String phoneRegex = "01[016-9]-\\d{3,4}-\\d{4}";
		System.out.println(Pattern.matches(phoneRegex, phoneNum));
		System.out.println("===========");
				
		// 연습2 : 해당 문자열이 이메일인지 검사할 수 있는 정규표현식을 만들어보세요
		// 대소문자 로마자 기본 A부터 Z, a부터 z. 숫자 0부터 9 (최상위 도메인 이름이 모두 숫자가 아닌 경우) 하이픈 - (처음 또는 마지막 글자가 아닌 경우)
	
		String email = "abc@naver.co.kr";
		String emailRegex = "\\w+@\\w+[.]\\w+([.]\\w+)*";
		System.out.println(Pattern.matches(emailRegex, email));
		System.out.println("-------------");
		
		// 연습3 : 해당 문자열이 IPv4주소인지 아닌지 검사할 수 있는 정규표현식을 만들어보세요
		
		// 0.0.0.0~255.255.255.255
		// 8비트씩 4부분으로 10진수로 표시
		// (ex: 202.30.64.22) 
		String ipAddress = "129.129.129.129";
		String ipRegex = "((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
				+ "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)";
		
//		for (int i = 0; i < 256;  ++i) {
//			for (int j = 0; j < 256;  ++j) {
//				for (int k = 0; k < 256;  ++k) {
//					for (int l = 0; l < 256;  ++l) {
//						String ip = String.format("%d.%d.%d.%d", i, j, k, l);
//						System.out.printf("%s\t: %s\n", ip, Pattern.matches(ipRegex, ip));
//					}
//				}
//			}
//		}
		
		
		// # Matcher 클래스 사용하기
		String fruits = "apple banana orange kiwi pineapple mangoapple ";
		
		StringBuilder sb = new StringBuilder(fruits);
		for (int i = 0; i < 3; ++i) {
			sb.append(sb.toString());
		}
				
		// 1. 정규표현식을 컴파일하여 Pattern 인스턴스 생성
		Pattern appleRegex = Pattern.compile("(\\w*)(apple)");			// new Pattern() --> 으로는 사용 불가
																		
		// 2. 생성한 Pattern 인스턴스로 원하는 문자열을  탐색할 수 있는 Matcher 인스턴스를 생성
		Matcher matcher = appleRegex.matcher(sb);
		
		// 3. 반복문을 통해 매치 결과를 모두 찾을 수 있다
		String[] groupMessage = {"전체 텍스트", "첫 번째 괄호 부분", "두 번째 괄호 부분"};
		
		while (matcher.find()) {
			for (int i = 0; i <= matcher.groupCount(); ++i) {
				
				System.out.printf("### Group %d (%s) ###\n",  i, groupMessage[i]);
				System.out.println("찾아낸 것: " + matcher.group(i));
				System.out.println("찾아낸 것의 시작 인덱스: " + matcher.start(i));
				System.out.println("찾아낸 것의 마지막 인덱스: " + matcher.end(i));
				
			}
			System.out.println("-----------------------------------------");
			
//			System.out.println("### Group 0 (전체 텍스트) ###");
//			System.out.println("찾아낸 것: " + matcher.group(0));
//			System.out.println("찾아낸 것의 시작 인덱스: " + matcher.start(0));
//			System.out.println("찾아낸 것의 마지막 인덱스: " + matcher.end(0));
//			
//			System.out.println("### Group 1 (첫 번째 괄호 부분) ###");
//			System.out.println("찾아낸 것: " + matcher.group(1));
//			System.out.println("찾아낸 것의 시작 인덱스: " + matcher.start(1));
//			System.out.println("찾아낸 것의 마지막 인덱스: " + matcher.end(1));
//			
//			System.out.println("### Group 2 (두 번째 괄호 부분) ###");
//			System.out.println("찾아낸 것: " + matcher.group(2));
//			System.out.println("찾아낸 것의 시작 인덱스: " + matcher.start(2));
//			System.out.println("찾아낸 것의 마지막 인덱스: " + matcher.end(2));
			
		}
	}
}

