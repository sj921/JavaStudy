package z_quiz;

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
		if (!f.isFile()) {
			throw new Exception("파일이 아닌 것은 암호화할 수 없음");
		} else if (!f.getName().endsWith(".txt")) {
			throw new Exception(".txt 파일만 암호화할 수 있음");
		}
				
		// System.out.println(f);
		// System.out.println(f.isFile());
		// System.out.println(f.getName());
		// System.out.println(f.getParentFile());
		
		// replace(old, new) : 문자열 또는 문자 치환
		// replaceAll(regex, new) : 정규표현식을 이용한 치환
		// System.out.println(f.getName().replaceAll("[.].+", "_encrypted.enc"));
		// --> 어떤 파일이 들어오더라도 자동으로 치환될 수 있도록 프로그램을 짜야 함...
		
		File encryptedFile = new File(f.getParentFile(), f.getName().replaceAll("[.].+", "_encrypted.enc"));
		
		System.out.println(encryptedFile.getAbsolutePath());
		
		try (
			FileReader fin = new FileReader(f);
			BufferedReader in = new BufferedReader(fin);
			FileWriter fout = new FileWriter(encryptedFile);
			BufferedWriter out = new BufferedWriter(fout);
		) {
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(key);
			
			String line;
			while ((line = in.readLine()) != null) {
				out.append(cryptoTool.encrypt(in.readLine()));
				out.append('\n');
			}
		} 
		return encryptedFile;
	}
	
	public static void main(String[] args) {
		try {
			encryptFile(new File("myFiles/frankenstein.txt"), 10);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}
	
}