package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class E07_FileEncryption {
	/*
		frankenstein.txt를 시저 암호 방식으로 암호화한 파일
		frankenstein_encrypted.enc을 생성해보세요
	*/

	public static File encryptFile (File f, int key) throws Exception {
	
		// 예외를 설정해둠..
		if(!f.isFile()) {
			throw new Exception("파일이 아닌 것은 암호화할 수 없음");
		} else if (!f.getName().endsWith(".txt")) {
			throw new Exception(".txt 파일만 암호화할 수 있음");
		}
		
		// 출력 예시...
		// System.out.println(f);
		// System.out.println(f.isFile());
		// System.out.println(f.getName());
		// System.out.println(f.getParentFile());
				
		// replace (old, new)		: 문자열을 교체한 새로운 문자열을 반환함 (--> 원본을 훼손하지 않음)
		// replaceAll(regex, new)	: 정규표현식을 이용하여 새로운 문자열을 반환함	
		// System.out.println(f.getName().replaceAll("[.].+", "_encrypted.enc"));
		// 정규 표현식 [.].+이 _encrypted.enc 형식으로 치환되도록 함. 
		// --> 하나의 파일뿐만 아니라 어떤 파일이 들어오더라도 자동으로 치환될 수 있도록 프로그램을 구성해야 함.
		File encryptedFile = new File(f.getParentFile(), f.getName().replaceAll("[.].+", "_encrypted.enc"));
		
		// encryptedFile의 절대 경로를 가져와 출력함
		System.out.println(encryptedFile.getAbsolutePath());
		
		// AutoClose 방식의 try-catch
		// ()내부에 선언한 AutoClosable 타입의 인스턴스들은 자동으로 close()를 호출한다
		try (
			// FileReader를 통해 char 타입으로 읽어온 원본 파일(txt)을 BufferedReader를 통해 한 줄씩 읽게 인스턴스를 생성함.
			FileReader fin = new FileReader(f); 
			BufferedReader in = new BufferedReader(fin);
			
			// FileWriter를 통해 char 타입으로 쓴 원본 파일(txt)을 BufferedReader를 통해 한 줄씩 쓰게 인스턴스를 생성함.
			FileWriter fout = new FileWriter(encryptedFile);
			BufferedWriter out = new BufferedWriter(fout);
		) {
			// 시저암호 메서드를 호출...?
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(key);
			
			String line;
			// readLine() : BufferedReader에 추가된 한 줄씩 읽는 기능
			// 문자열이 비어있지 않는 동안(true) --> cryptoTool 암호화 메서드를 이용하여 한줄씩 추가함
			while((line = in.readLine()) != null) {
				out.append(cryptoTool.encrypt(line));
				out.append('\n');	// 한줄 띄어주기~~
			}
		} 
		// 리턴 타입이 File이므로 encryptedFile을 반환함
		return encryptedFile;
	}
	
	// 출력해보기
	public static void main(String[] args) {
		try {
			// encryptFile 메서드에 txt의 위치와 key값 10을 입력하여 암호화 파일을 만들어 호출함.
			// 출력 결과 : myFiles 내부에 frankenstein_encrypted.enc 파일이 생성됨.
			encryptFile(new File("myFiles/frankenstein.txt"), 10);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}
	
}



















