package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DomainCombiner;

public class E07_FileDecryption {
	/*
		(key값을 모르는 상태로 복호화)

		암호화된 파일의 맨 위부터 50줄을 모든 키값(1 ~ 25)으로 복호화한 샘플을 보여준 후	--> 반복문을 활용 key 1~25까지 넣기.. 50줄씩은 어떻게...?
		사용자가 샘플을 보고 key값을 선택할 수 있도록 만들고							-->
		선택하면 해당 키값으로 복호화한											--> 복호화 메서드 만들기
		frankenstein_decrypted.txt가 생성되도록 만들어보세요
	 */

	public static void printSample(File crypto) {

		try (
				// FileReader를 통해 char 타입으로 읽은 뒤, BufferedReader를 통해 한 줄씩 읽기
				FileReader fin = new FileReader(crypto);
				BufferedReader in = new BufferedReader(fin);
				){
			// 사용자가 샘플을 볼 수 있도록 하기 위해 StringBuilder를 통해 인스턴스를 생성함.
			StringBuilder sampleSrc = new StringBuilder();

			// 50줄 -> 10줄로 변경
			// 10줄씩 읽도록 반복문에 넣고 돌리면서 sampleSrc에 한 줄씩 추가함(append(in.readLine())).
			for (int i = 0; i < 10; ++i) {
				sampleSrc.append(in.readLine());
				sampleSrc.append('\n');
			}

			// setKey() 메서드를 D09_CaesarCipher에 추가하여,
			// 암호화된 파일에 key값을 1~25까지 넣어서 반복문을 돌리고, 맞는 알파펫 배열의 key값을 찾는다.
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(0);
			for (int key = 1; key <= 25; ++key) {
				cryptoTool.setKey(key);
				System.out.printf("### key %d ###\n", key);
				System.out.println(cryptoTool.decrypt(sampleSrc.toString()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 복호화 메서드
	public static File decryptFile (File target, int key) throws Exception {

		// 예외를 설정해둠
		if (!target.isFile()) {
			throw new Exception("파일이 아닌 것은 암호화할 수 없음");
		} else if (!target.getName().endsWith(".enc")) {
			throw new Exception(".enc 파일만 암호화할 수 있음");
		}

		// 정규 표현식 [_].+[.].+이 _decrypted.txt 형식으로 치환되도록 함. 
		File decryptedFile = new File(
				target.getParentFile(), target.getName().replaceAll("[_].+[.].+", "_decrypted.txt"));

		// 복호화파일의 절대 경로를 가져와서 출력함
		System.out.println(decryptedFile.getAbsolutePath());


		try (
				// FileReader을 이용해 char 타입으로 target파일(암호화된 파일)을 읽어옴
				// BufferedReader를 이용해 한 줄씩 읽음.
				FileReader fin = new FileReader(target);
				BufferedReader in = new BufferedReader(fin);

				// FileWriter를 통해 복호화 파일을 char 단위로 쓰기
				// BufferedWriter를 통해 복호화 파일을 한 줄씩 쓰기
				FileWriter fout = new FileWriter(decryptedFile);
				BufferedWriter out = new BufferedWriter(fout);
				){
			// D09_CaesarCipher 호출?
			D09_CaesarCipher decrytoTool = new D09_CaesarCipher(key);


			// 반복문을 돌려서 값이 비어있지 않을 때까지 한 줄씩 쓰기
			// 복호화툴 이용
			String line;
			while ((line = in.readLine()) != null) {
				out.append(decrytoTool.decrypt(line));
				out.append('\n');
			}
		} 
		return decryptedFile;
	}


	public static void main(String[] args) throws Exception {
		// InputStream을 Reader로 업그레이드 하는 클래스 (--> Scanner와 비슷하지만 더 효율 좋은?)
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		File target = new File("myFiles/frankenstein_encrypted.enc");

		printSample(target);

		// 조건문이 만족하는 동안 복호화 + 에러출력 반복?
		while (true) {
			try {
				System.out.printf("원하는 key를 입력 >> ");
				String line = in.readLine();

				int key = Integer.parseInt(line.trim());
				// trim() : 외곽의 공백을 제거한 인스턴스를 반환한다
				// 		    —> 내부의 공백은 제거하지 않는다

				// 암호화된 파일에 키값을 넣어 복호화하는 메서드
				decryptFile(target, key);

				break;
			} catch (IOException e) {		// 입출력 예외
				e.printStackTrace();
			} catch (NumberFormatException e) {	// 숫자 형식 예외
				System.out.println("key는 숫자로 입력해주세요.");
			}
		}
		System.out.println("복호화할 파일이 생성되었습니다.");

		try {
			// in이 비어있지 않다면(가득 찼다면) 닫아준다
			// 최근에 열었던 순서대로 닫아야 한다
			if (in != null) in.close();
			if (in != null) isr.close();
		} catch (IOException e) {
			System.out.println("close 도중 에러 발생 (한번도 본 적 없음)");
		}
	}
}















