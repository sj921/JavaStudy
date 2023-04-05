
public class A02_ASCII {

	/*
			# ASCII 코드
			
			 - 문자는 실제로 각 문자에 대응하는 번호를 지니고 있다
			   ex> 'A'는 65번 문자,'B'는 66번 문자 ...
			 - 0~127번까지의 문자들을  ASCII 코드라고 한다. (참고 : https://stepbystep1.tistory.com/10)
	*/		
	
	public static void main(String[] args) {
		
		/*
			모든 데이터는 실제로 0과 1로 변환되어 저장된다
			문자는 바로 0과 1로 변환될 수 없기 때문에 문자에 해당하는 코드값이 존재한다
			
			* 문자를 코드화하는 것 (인코딩, encoding)
			
				A -----> 65 -----> 0100 0001
				! -----> 33 -----> 0010 0001
			
			* 코드를 해석하는 것 (디코딩, decoding)
			
				0100 0001 -----> A
				0010 0001 -----> !				
				
		*/
		
		
		System.out.println('0');	// 문자 0 - 실제로는 48이라는 코드값을 가지고 있음
		System.out.println(0);		// 숫자 0 - 실제로도 0
		
		// 문자 타입 리터럴의 실제 값(코드값)을 보고 싶다면 앞에 (int)를 붙인다 		
		System.out.println((int)' ');
		System.out.println((int)'!');
		System.out.println((int)'?');
		System.out.println((int)'A');
		System.out.println((int)'한');
		System.out.println((int)'가');
		
		
				
	}
	
	
}
