package quiz;

import java.util.Random;

public class B12_BruteForce {
	
	/*
		4자리의 비밀번호가 있을 때 비밀번호를 찾을 때까지 
		모든 프로그램을 대조하는 프로그램을 만들어보세요
		
		aaaa
		aaab
		...
	*/
	
	
	public static void main(String[] args) {
		
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
				+ "abcdefghijklmnopqrstuvwxyz" 
				+ "0123456789"
				+ "`~!@#$%^&*()-_=+\\|[]{};:\"\'<>,.?/";
		
		String password = "";
		
		Random ran = new Random();
		for (int i = 0; i < 4; ++i) {
			password += charset.charAt(ran.nextInt(charset.length()));
		}
		System.out.println("생성된 임시 비밀번호: " + password);
	
		for (int i = 0; i < charset.length() ; ++i) {
			for (int j = 0; j < charset.length(); ++j) {
				for (int k = 0; k < charset.length(); ++k) {
					for (int l = 0; l < charset.length(); ++l) {
						String brute = "" 
								+ charset.charAt(i)
								+ charset.charAt(j)
								+ charset.charAt(k)
								+ charset.charAt(l);						
						if (brute.equals(password)) {
							System.out.println("비밀번호는 [" + brute + "]입니다.");
						}
					}
				}
			}
		}
		
//						System.out.print(charset.charAt(i));		
//						System.out.print(charset.charAt(j));		
//						System.out.print(charset.charAt(k));		
//						System.out.print(charset.charAt(l));		
//						System.out.println();
		
		
		
		
	}

}




//	내가 푼 오답
//	String password = "1a#V";
//	
//	String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
//			+ "abcdefghijklmnopqrstuvwxyz" 
//			+ "0123456789"
//			+ "`~!@#$%^&*()-_=+\\|[]{};:\"\'<>,.?/";
//
//	Random ran = new Random();
//	boolean chk = true;
//	for (int i = 0; i < 4; ++i) {
//		if () {
//			System.out.print(charset.charAt(ran.nextInt(charset.length())));		
//		}
//	}