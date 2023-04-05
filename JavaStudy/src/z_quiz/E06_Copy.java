package z_quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E06_Copy {
	/*
		images 폴더 내부의 모든 내용을
		원하는 경로의 밑으로 모두 복사해보세요
	 */


	// 파일을 복사하는 메서드를 생성
	public static void copyFile (File srcFile, File dstFile) {
		// 사진은 byte 단위로 꺼내야 읽을 수 있으므로, 
		// char 단위로 읽는 FileReader, FileWriter가 아니라 
		// byte 단위로 읽는 FileInputStream, FileOutputStream을 사용한다.

		FileInputStream in = null;
		FileOutputStream out = null;


		// 원본 srcFile을 읽어와서, 복사본 dstFile에 쓴다
		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(dstFile);

			out.write(in.readAllBytes());
		} catch (Exception e) {
			e.printStackTrace();		// 오류를 찾아 출력
		} finally {
			try {
				if (in != null) in.close();			// 둘 다 내용이 비어있지 않으면 닫는다. (파일이 복사된 것!)
				if (out != null) out.close();
			} catch (IOException e) {e.printStackTrace();}
		}
	} 



	// 디렉토리를 복사하는 메서드를 생성
	public static void copyDirectory (File src, File dst) throws Exception {

		// 발생할 수 있는 예외 모두 막기..
		if (!src.isDirectory()) {
			throw new Exception("디렉토리만전달해익셉션");
		} else if (!src.exists()) {
			throw new Exception("복사할파일경로틀림익셉션");
		} else if (!dst.exists()) {
			throw new Exception("목적지경로틀림익셉션");
		}


		// src : images
		// dst : myFiles
		// to_copy : myFiles/images/		
		File to_copy = new File(dst, src.getName());

		// myFiles/images/
		to_copy.mkdir();

		// 원본 폴더인 images/ 내부의 파일들(원본에서) 하나씩 꺼내서 넣음
		for (File f : src.listFiles()) {

			// f가 디렉토리라면..
			if (f.isDirectory()) {
				copyDirectory(f, to_copy);
				// f -> images/apple
				// to_copy -> myFiles/images/apple
				// f가 파일이라면..
			} else if (f.isFile()) {
				copyFile(f, new File(to_copy, f.getName()));
				// 원본 파일을 to_copy로 복사. to_copy를 부모로 삼고, 원본 파일의 이름(자식)을 전달해서 해당 파일로 감
			}
		}
	}

	public static void copy (File src, File dst) {
		File to_copy = new File(dst, src.getName());

		System.out.println("---------------------------------");
		System.out.println("원본 파일: " + src);
		System.out.println("복사해야 하는 위치: " + to_copy);

		if (src.isDirectory()) {
			// 디렉토리이면 mkdir()을 사용하여 디렉토리를 생성
			to_copy.mkdir();

			// 디렉토리이면 내부도 살펴봐야 함..(하위폴더나 하위파일들..)
		} else if (src.isFile()) {
			// 파일이면 copyFile메서드를 이용하여 파일을 복사
			copyFile(src, to_copy);
		} else {
			// 파일도 디렉토리도 아닌 경우
			System.out.println("?? 복사 종료"); 
		}
	}


	public static void main(String[] args) {
		try {
			copyDirectory(new File("images"), new File("z_copy_practice"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}	