package z_$default;

public class A01_Escape {
	
	/*
		# Escape 문자
	
		 - 특수한 기능을 가진 문자
		 - 그냥 출력하기에는 문제가 있는 문자들을 표한하기 위한 방식
		 - \ 와 하나의 문자가 합쳐져서 특수한 기능을 한다
		 - \ + 문자가 하나의 문자로 인식된다
	*/
	
	public static void main(String[] args) {
		
		// \n : 줄 바꿈의 기능을 가진 특수 문자
		System.out.println("안녕하세요 반갑습니다.");
		System.out.println("안녕하세요 반갑\n습니다.");	

		// \t : Tab키의 기능을 가진 특수 문자
		System.out.println("안녕하세요 반갑\t습니다.");	
		System.out.println("안녕하세요 반	갑습니다.");	// 그냥 Tab키를 눌러도 되기는 하지만 space와 구분하기 어려움

		// \\ : Escape 문자의 기능을 사용하지 않고 그냥 역슬래시를 출력하고 싶을 때 사용한다
		System.out.println("안녕하세요 반갑\\습니다.");	
		System.out.println("C:\\JavaFullStack\\eclipse\\note");	
		// System.out.println("C:\JavaFullStack\eclipse\note"); // 에러. \J와 \e 는 없다
		
		// \" : 그냥 큰 따옴표를 출력하고 싶을 때 사용하는 특수 문자
		System.out.println("오늘 저녁은 \"피자\"를 먹는다");	
		
		// \' : 그냥 작은 따옴표를 출력하고 싶을 때 사용하는 특수 문자
		System.out.println("오늘 저녁은 \'햄버거\'를 먹는다");	
		System.out.println("오늘 저녁은 '햄버거'를 먹는다");		// ''(문자) 표현하고 있으므로 \ 없어도 됨
		System.out.println('\'');							// ' 하나만 출력하고 싶을 때 \' 사용
			
		System.out.println('A');	
		System.out.println('한');
		System.out.println(' ');
		System.out.println('\n');
		System.out.println('\t');
		System.out.println('\\');
		
		// 숫자 타입 리터럴의 문자 형태를 보고 싶다면 앞에 (char)를 붙인다
		System.out.println((char)33);
		System.out.println((char)90);
		System.out.println((char)48);
		System.out.println((char)49);
		System.out.println((char)50);
		
		
		// 문자 타입 리터럴로 실제로는 숫자값을 갖고 있기 때문에 계산이 가능하다
		
		// 해당하는 문자의 다음 문자를 찾아낼 수 있다
		System.out.println((char)('A'+0));
		System.out.println((char)('A'+1));
		System.out.println((char)('A'+2));
		System.out.println((char)('A'+3));
		System.out.println((char)('A'+4));
		System.out.println((char)('A'+5));

		System.out.println((char)('가'+1));
		System.out.println((char)('가'+2));
		System.out.println((char)('가'+3));
		System.out.println((char)('나'+1));
		
		// 문자끼리 계산해서 거리 재기
		System.out.println('Z'-'A');	// Z는 A로부터 몇 번째 문자인가?
		System.out.println('K'-'A');	// K는 A로부터 몇 번째 문자인가?
		System.out.println('a'-'A');	// 대문자를 소문자로 변환하기 위한 거리
		
		// 대문자와 소문자의 거리를 이용해 대소문자 변환
		System.out.println((char)('Y'+('a'-'A')));

	}
		
}
