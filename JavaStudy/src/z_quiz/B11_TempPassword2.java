package z_quiz;

import java.util.Random;

public class B11_TempPassword2 {
	/*
		[대문자, 소문자, 특수문자, 숫자]로 구성된 랜덤 비밀번호 6자리를 생성하여 출력해주세요
				
		※ 사용 가능한 특수문자
		! @ # $ % ^ & * ( ) - _ + = | : ; < >  [ ] ~ \
	*/
	
	
	
	public static void main(String[] args) {

//	방법1
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
				+ "abcdefghijklmnopqrstuvwxyz" 
				+ "0123456789"
				+ "!@#$%^&*()-_+=|:;<>[]~\\";
		
		Random ran = new Random();
		
		for (int i = 0; i < 6;++i) {
			System.out.print(charset.charAt(ran.nextInt(charset.length())));
		}
		
// 방법2	
//		Random ran = new Random();	
//		for (int i = 0; i < 6; ++i) {
//			switch (ran.nextInt(4)) {
//			case 0:
//				// 숫자
//				System.out.print((char)(ran.nextInt(10) + '0'));
//				break;
//			case 1:
//				System.out.print((char)(ran.nextInt(26) + 'a'));
//				// 소문자
//				break;
//			case 2:
//				// 대문자
//				System.out.print((char)(ran.nextInt(26) + 'A'));
//				break;
//			case 3:
//				// 특수문자
//				String charset = "!@#$%^&*()-_+=|:;<>[]~\\";
//				int random_index = ran.nextInt(charset.length());
//				System.out.print(charset.charAt(random_index));	//
//				break;
//			}
//		}

		
	}
}




// 내가 푼 오답
//	Random ran = new Random();
//
//	int ch = 0;
//
//	for (int i = 0; i < 6; ++i) {
//		if (ch >= '!' && ch <= '~') {
//		
//		} else if (ch == '!' || ch == '@' || ch == '#' ) {
//			continue;
//		} 
//		System.out.print((char) ran.nextInt());
//
//	}
//	System.out.println();
