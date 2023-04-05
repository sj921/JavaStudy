package z_quiz;

import javax.crypto.Cipher;

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

	private final static String UPPER_CHARSET = "ABCDEFGHIJKLMNOPQRTSUVWXYZ"; 
	private final static String LOWER_CHARSET = "abcdefghijklmnopqrstuvwxyz";
	private final static String KOR_CHARSET = getKorSet();

	int key;		

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
		StringBuilder sb = new StringBuilder(plain);

		int len = sb.length();

		for (int i = 0; i < len; ++i) {
			char ch = sb.charAt(i);
			int index, len2;

			if (Character.isUpperCase(ch)) {
				len2 = UPPER_CHARSET.length();
				index = ch - 'A' + key % len2;
				index = index > len2 ? index - len2 : index;
				ch = UPPER_CHARSET.charAt(index);
			} else if (Character.isLowerCase(ch)) {
				len2 = LOWER_CHARSET.length();
				index = ch - 'a' + key % len2;
				index = index > len2 ? index - len2 : index;
				ch = LOWER_CHARSET.charAt(index);

			} else if (ch >= '가' && ch <= '힣') {
				len2 = KOR_CHARSET.length();
				index = ch - '가' + key % len2;
				index = index > len2 ? index - len2 : index;
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

}