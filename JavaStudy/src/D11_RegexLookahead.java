import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D11_RegexLookahead {
	/*
		# 정규표현식 Lookahead
		
		- 특정 정규표현식 앞에 있는 패턴을 잡아낼 수 잇는 방식
		- 잘 응용하면 반드시 포함시키는 규칙을 만들어낼 수 있다
	
		apple(?=regex)	: regex 앞에 있는 apple을 찾아라
		apple(?!regex)	: regex 앞에 오지 않는 apple를 찾아라
		apple(?<=regex)	: regex 뒤에 오는 apple을 찾아라
		apple(?<!regex)	: regex 뒤에 오지 않는 apple을 찾아라
	*/
	
	public static void main(String[] args) {
		
	// step 1
		String text = "apple@ @apple apple@ @apple apple@ @apple";
		
		Pattern frontApple = Pattern.compile("apple(?=@)");		// @ 포함x
		// Pattern frontApple = Pattern.compile("apple@");		// @ 포함o
		
		Matcher frontMatcher = frontApple.matcher(text);
		
		while(frontMatcher.find()) {
			System.out.println("found: " + frontMatcher.group());
			System.out.println("start: " + frontMatcher.start());
			System.out.println("end: " + frontMatcher.end());
		}
		
		
	// step 2
		String text2 = "apple";
		// String frontRegex2 = "app(?=l)e";	// --> false
		String frontRegex2_1 = "app(?=l)le";	// --> true (검사하면서 자기 자신을 소모하지 않는다)
												// 검사와 다음 문자를 찾는 것은 별개이다
		
		System.out.println("\n# test2\n");
		// System.out.println(Pattern.matches(frontRegex2, text2));
		System.out.println(Pattern.matches(frontRegex2_1, text2));
		
	// step 3		
		String text3 = "Hello, abcd1234!!! 3 4 5 6 78910 123 12 13333";
		String frontRegex3 = "(?=\\d)[1-3]{2,}";	// 숫자 앞에 아무것도 아닌 거 와도 되고, 뒤에 아무거나 와도 돼???????????
			
		Pattern pattern3 = Pattern.compile(frontRegex3);
		
		Matcher matcher3 = pattern3.matcher(text3);
	
		System.out.println("\n# test3\n");
		while (matcher3.find()) {
			System.out.println("found: " + matcher3.group());
			System.out.println("start: " + matcher3.start());
			System.out.println("end: " + matcher3.end());
			System.out.println("--------");
		}
		
	// step 4 
		String text4 = "a12";
		String frontRegex4 = "(?=a\\d)[1-4a]{3,}";		// true --> 글자를 소모하지 않아 맨 앞부터 검사하므로 3글자 true
		String frontRegex4_1 = "a(?=\\d)[a1-4]{3,}";	// false --> a 뒤부터 3글자여야 하므로 flase
						// (?=\\d) : 숫자로만 네글자 이상
						// 숫자 앞에 a가 4개 
						// a* : 0~여러개 
		System.out.println("\n# test4\n");
		System.out.println(Pattern.matches(frontRegex4, text4));
		System.out.println(Pattern.matches(frontRegex4_1, text4));
		
	// step 5
		String text5 = "AC2ABCDFa#";
		String text5_1 = "AC2ABCDF한글a#";
		String frontRegex5 = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%])" 
				+ "[\\dA-Za-z!@#$%]{6,}";		// 어디가 오류인지 알려주지 않는다
		
		System.out.println("\n# test5\n");
		System.out.println(Pattern.matches(frontRegex5, text5));	// true
		System.out.println(Pattern.matches(frontRegex5, text5_1));	// false
		
		
	}
	
}
