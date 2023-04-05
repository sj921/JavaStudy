package z_$default;
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
		// String frontRegex2 = "app(?=l)e"; 	// false
		String frontRegex2 = "app(?=l)le"; 		// true (검사하면서 자기 자신을 소모하지 않음)
		
		System.out.println(Pattern.matches(frontRegex2, text2));
		
	// step 3
		String text3 = "Hello, abcd1234!!! 3 4 5 6 78910 123 12 13333";
		String frontRegex3 = "(?=\\d)[1-3]{2,}";	
		Pattern pattern3 = Pattern.compile(frontRegex3);
		Matcher matcher3 = pattern3.matcher(text3);
		
		while (matcher3.find()) {
			System.out.println("found: " + matcher3.group());
			System.out.println("start: " + matcher3.start());
			System.out.println("end: " + matcher3.end());
			
		}	
		
		
	// step 4 
		String text4 = "a12";
		String frontRegex4 = "(?=a\\d)[1-4a]{3,}";
		String frontRegex4_1 = "a(?=\\d)[1-4a]{3,}";
		
		System.out.println(Pattern.matches(frontRegex4, text4));
		System.out.println(Pattern.matches(frontRegex4_1, text4));
		
		
	// step 5
		String text5 = "AC2ABCDEFa#";
		String text5_1 = "AC2ABCD한글a#";
		
		
		
		
		
		
	}
	
}
