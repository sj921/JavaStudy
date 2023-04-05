import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D08_String {

	
	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/melon/watermelon/grape";
		
		// split() : 문자열을 원하는 기준으로 잘라 문자열 배열로 반환한다
		String[] splited = fruits.split("/");
		String[] splited2 = fruits.split("an");
		System.out.println("/로 구분 시: " + Arrays.toString(splited));
		System.out.println("an으로 구분 시: " + Arrays.toString(splited2));
		
		System.out.println("-------------");
		
		// join(delim, iterable) : 해당 iterable 객체에 들어있는 모든 요소를 delim로 이어붙인다
		// ※ iterable - 배열, 리스트 등 하나씩 꺼낼 수 있는 성질을 의미하는 인터페이스
		String join = String.join("--", splited);
		System.out.println(join);
		
		System.out.println("-------------");
		
		// join(delim, Charsequence...)
		join = String.join(", ", "사자", "호랑이", "얼룩말", "고양이", "강아지");
		System.out.println(join);
		
		System.out.println("-------------");
		
		// contains (Charsequence) : 해당 문자열의 포함 여부를 반환
		String email = "abc123@naver.com";
		System.out.println("naver? " + email.contains("naver"));
		System.out.println("google? " + email.contains("google"));
		
		System.out.println("-------------");
		
		
		// startsWith(Charsequence) : 문자열이 해당 문자열로 시작하는지 검사
		String url = "https:// www.naver.com";
		
		System.out.println("URL -" + url);
		System.out.println("http:// - " + url.startsWith("http://"));
		System.out.println("https:// - " + url.startsWith("https://"));
		
		System.out.println("-------------");
		
		// endsWith(Charsequence) : 문자열이 해당 문자열로 끝나는지 검사
		System.out.println(".net? " + url.endsWith(".net"));
		System.out.println(".jpg? " + url.endsWith(".jpg"));
		System.out.println(".co.kr? " + url.endsWith(".co.kr"));
		System.out.println(".com? " + url.endsWith(".com"));
		
		System.out.println("-------------");
		
		// replace(old, new) : 문자열을 교체한 새로운 문자열을 반환한다
		// --> 원본을 훼손시키지 않음
		String replaced = fruits.replace("melon", "redapple");
		System.out.println("원본: " + fruits);
		System.out.println("교체: " + replaced);
		
		System.out.println("-------------");
		
		// substring(start, end) : 문자열의 일부분을 자른 인스턴스를 반환한다
		//						   (start 이상 end 미만)
		String substr = fruits.substring(10, 17);		
		System.out.println("substr: " + substr);
		
		// substring(index) : 해당 위치부터 맨 마지막까지 자른 인스턴스를 반환
		substr = fruits.substring(17);
		System.out.println("substr2: " + substr);
		
		// trim() : 외곽의 공백을 제거한 인스턴스를 반환한다
		//			내부의 공백은 제거하지 않는다
		String input = "        abc      123 ";
		String trimStr = input.trim();
		System.out.println("입력: " + trimStr);
		
		System.out.println("-----------");
				
		// toUpperCase() : 해당 문자열을 모두 대문자로 변환한 인스턴스를 반환
		// toLowerCase() : 해당 문자열을 모두 소문자로 변환한 인스턴스를 반환
		System.out.println(input.toUpperCase().trim().replace(' ', '#'));
		
		System.out.println("-------------");
		
		// indexOf(Charsequence) : 원하는 문자열을 찾아 인덱스를 반환
		//						   맨앞에서 시작하여 가장 먼저 찾은 인덱스를 반환한다
		fruits = "apple/banana/kiwi/greenapple/"
				+ "mango/orange/pineapple/grape/melon/";
		
		for (int i = 0; i < 10; ++i) {
			fruits += fruits;
		}
				
		System.out.println(fruits.indexOf("kiwi"));
		System.out.println(fruits.indexOf("apple"));
		
		System.out.println("-------------------");
		
		// indexOf(Charsequence, start) : 원하는 위치부터 찾기 시작할 수 있다
		System.out.println(fruits.indexOf("apple", 1));
		
		System.out.println("-------------------");
		
		// 연습문제 : 문자열 fruits에서 모든 "apple"의 인덱스를 찾아 리스트에 저장해보세요
		System.out.println(fruits.length());
	
		System.out.println(fruits.indexOf("tiger"));
			
		List<Integer> indexs = new ArrayList<>();
		String word = "apple";
		int len = word.length();
		int found = 0;
		for (int i = 0; true; i = found + len) {		// i != -1 ==> true
			// indexOf는 원하는 문자열을 찾지 못했을 때 -1을 리턴한다
			found = fruits.indexOf("apple", i);
			if (found == -1) {			
				break;
			} else {
				System.out.printf("%d에서 \"apple\"발견!\n", found);
				indexs.add(found);
			}
		}
	}
}



// 가장 먼저 찾은 인덱스를 반환하므로 찾고나면 --i?로 해당 인덱스 빼고 계속 찾게 함?
// 계속 첫번재로 만들어줌??
// 인덱스를 찾아 리스트에 저장?

// contains (Charsequence) : 해당 문자열의 포함 여부를 반환
//		String email = "abc123@naver.com";
//		System.out.println("naver? " + email.contains("naver"));
//		System.out.println("google? " + email.contains("google"));

// List<String> fruitsList = new ArrayList<>();
// Collections.addAll(fruitsList, ~~~~ ) --> 찾아지는 위치...?
// System.out.println(fruitsList);


























