package quiz;

public class D09_CaesarCipher {

	/*
		# 시저 암호
		
		- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 암호 방식
		- 키 값만큼 평문에 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고
		  암호문을 다시 왼쪽으로 키 값만큼 밀어주면 복호화가 된다
		  
			  ABCDEFGHIJKLMNOPQRSTUVWXYZ
			  
			  			key가 5일때
			  HELLO		--------->		MJQQT
		  
	  	- key는 변경이 가능해야 함
	*/
	private final static String UPPER_CHARSET = "ABCDEFGHIJKLMNOPQRTSUVWXYZ"; 		// 공통 속성
	private final static String LOWER_CHARSET = "abcdefghijklmnopqrstuvwxyz";		
	private final static String KOR_CHARSET = getKorSet();
	
	
	int key;		// 개별 속성 (--> key값 달라야 함)
	
	public D09_CaesarCipher(int key) {
		this.key = key;
	}
	
	public static String getKorSet() {
		StringBuilder sb = new StringBuilder();
		for (char i = '가'; i <= '힣'; ++i) {
			sb.append(i);
		}
		return sb.toString();
	}
	
	
	// 암호화
	public String encrypt (String plain) {
		StringBuilder sb = new StringBuilder(plain);	// append() 사용 안하고 바로 전달 가능하다
		
		int len = sb.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = sb.charAt(i);
			int index, len2;
			
			if (Character.isUpperCase(ch)) {
//				ch += key;
//				ch = (char)(ch > 'Z' ? ch - 26 : ch);
				len2 = UPPER_CHARSET.length();
				index = ch - 'A' + key % len2;						// A - A = 0(0번째 문자 A), H - A = 7(7번째 문자 H)
				index = index > len2 ? index - len2 : index;		// 30 /25 ==5
				ch = UPPER_CHARSET.charAt(index);
				
			} else if (Character.isLowerCase(ch)) {
//				ch += key;
//				ch = (char)(ch > 'z' ? ch - 26 : ch);
				len2 = LOWER_CHARSET.length();
				index = ch - 'a' + key % len2;						// a - a = 0(0번째 문자 a), h - a = 7(7번째 문자 h)
				index = index > len2 ? index - len2 : index;
				ch = LOWER_CHARSET.charAt(index);
				
			} else if (ch >= '가' && ch <= '힣') {
				len2 = KOR_CHARSET.length();
				index = ch - '가' + key % len2;
				index = index > len2? index - len2 : index;
				ch = KOR_CHARSET.charAt(index);
			}
			
			sb.setCharAt(i, ch);
		}
		return sb.toString();
	}
	
	// 복호화
	public String decrypt (String crypto) {
		StringBuilder sb = new StringBuilder(crypto);
		int len = sb.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = sb.charAt(i);
			int len2;
			
			if (Character.isUpperCase(ch)) {
				ch -= key % len;
				ch = (char)(ch < 'A' ? ch + 26 : ch);
			} else if (Character.isLowerCase(ch)) {
				ch -= key % len;
				ch = (char)(ch < 'a' ? ch + 26 : ch);
			} else if (ch >= '가' && ch <= '힣') {
				ch -= key % len;
				ch = (char)(ch < '가'? ch + ('힣' - '가' + 1) : ch);
			}
			sb.setCharAt(i, ch);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
			
		String plainText = "Hello, world!! 가각갃";
		
		D09_CaesarCipher cipher1 = new D09_CaesarCipher(1);
		D09_CaesarCipher cipher2 = new D09_CaesarCipher(13);
		
		System.out.println("key 1: " + cipher1.encrypt(plainText));
		System.out.println("key 13: " + cipher2.encrypt(plainText));
		
		String crypto1 = "Ifmmp, xpsme!! 각갂간";
		String crypto2 = "Uryyb, jbeyq!! 갍갎감";
		
		System.out.println(cipher1.decrypt(crypto1));
		System.out.println(cipher2.decrypt(crypto2));
		
		
	}

	public void setKey(int key2) {
		// TODO Auto-generated method stub
		
	}
	
}




