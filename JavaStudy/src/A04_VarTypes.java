
public class A04_VarTypes {

	/*
		-- 기본형 (소문자로 시작한다) --
		
		# 정수 타입
		
		 - byte (1byte, 8bit)
		 
		   2^8개(256개)의 값을 표현할 수 있음
		   표현 가능한 정수의 범위는 -128 ~ +127
		   
		   0000 0000 : 0
		   0000 0001 : 1
		   0000 0010 : 2
		   0000 0011 : 3		   
		   ...
		   0111 1111 : 127
		   1000 0000 : -128 (첫 번째 비트가 1이면 음수를 나타낸다)
		   1000 0001 : -127 
		   1000 0010 : -126 
		   ...
		   1111 1111 : -1
		   0000 0000 : 0
		   
		 - short (2byte, 16bit)
		 
		   2^16개(65536개)의 값을 표현할 수 있음
		   표현 가능한 정수의 범위는 -32768(2^15) ~ 32767(2^15-1)
		  	
		   0000 0000 0000 0000 : 0
		   ...
		   0111 1111 1111 1111 : 32767
		   1000 0000 0000 0000 : -32768
		   ...
		   1111 1111 1111 1111 : -1
		 
		 - char (2byte, 16bit, 양수만)
		   
		   2^16개(65536개)의 값을 표현할 수 있음
		   표현 가능한 정수 범위는 0 ~ 65535(2^16-1)
		   
		 - int (4byte, 32bit)
		 
		   2^32개(약 43억개)의 값을 표현할 수 있다
		   표현 가능한 정수 범위는 -(2^31) ~ +(2^31-1)
		   
		   0000 0000 0000 0000 0000 0000 0000 0000 : 0
		   		 
		 - long (8byte, 64bit)
		   
		# 실수 타입
		
		 - float (4byte) 
		 - double (8byte) 
		
		# 참/거짓 타입
		
		 - boolean
		
		-- 참조형 (대문자로 시작한다) --
		
		# String
		
		 - 문자열을 저장할 수 있는 타입
		 		 
		# 그 외 모든 클래스들
					
	*/
	
	public static void main(String[] args) {
	
		byte _byte = (byte)(127+1);
		char _char = 65535;
		short _short = 32767;
		int _int = 2_100_000_000;
		// int의 범위를 벗어나는 정수 리터럴은 뒤에 L을 붙여야 한다
		long _long = 210_000_000_000L;
		_long = 222_222_222_222l;				
		
		// 소수 리터럴은 기본적으로 double 타입이기 때문에
		// float타입 리터럴은 뒤에 F를 붙여 표시해야 한다
		float _flaot = 123.123F;
		double _double = 123.123456;
		
		// boolean 타입 변수에는 boolean 타입 리터럴인 true/false만 저장할 수 있다
		boolean rich = false;
		boolean programmer = true;
		boolean wearable = false;
			
		System.out.println("_byte에 들어있는 값 : " + _byte);
		
		String message = "Hello, world!";
		
		System.out.println(message);
		
		
		// # 정수 타입에 문자 저장하기
		//  - 다른 정수타입에도 문자를 저장할 수 있지만
		//	  문자 리터럴은 char 타입에 저장하는 것이 가장 올바르다
		
		int ch1 = 'T';
		byte ch2 = '!';
		short ch3 = '#';
		char ch4 = '가' , ch5 = '\t';
		char ch6, ch7, ch8;
		
		ch6 = ' ';
		ch7 = '\n';
		ch8 = '\"';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
		System.out.println(ch8);
		
		
		// 같은 값이 들어있더라도 char 타입은 기본적으로 문자로 활용하고
		// 그 외의 정수 타입은 숫자로 활용한다
		
		char c1 = 65;
		int c2 = 65;
		
		System.out.println("c1: " + c1 + ", c2: " + c2);
		
		}
		
}
