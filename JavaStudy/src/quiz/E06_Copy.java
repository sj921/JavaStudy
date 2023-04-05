package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class E06_Copy {
	/*
		images 폴더 내부의 모든 내용을
		원하는 경로의 밑으로 모두 복사해보세요
	 */
	public static void copyFile (File srcFile, File dstFile) {
		// FileReader in = null;
		// FileWriter out = null;
			
		// 사진은 byte 단위로 꺼내야 읽을 수 있으므로, 
		// char 단위로 읽는 FileReader, FileWriter가 아니라 
		// byte 단위로 읽는 FileInputStream, FileOutputStream을 사용한다.
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(dstFile);
			
			out.write(in.readAllBytes());
					
//			char[] cbuf = new char[4096];			
//			int len;			
//			while ((len = in.read(cbuf)) != -1) {
//				out.write(cbuf, 0 , len);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) in.close();
				if (out != null) out.close();
			} catch (IOException e) {e.printStackTrace(); }
		}
	}
	
	public static void copyDirectory (File src, File dst) throws Exception {
		
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
		
		// myFiles/images/ ---> (1) 부모로 삼고
		to_copy.mkdir();
		
		// 원본 폴더인 images/ 내부의 파일들 (원본에서 하나씩 꺼내서 넣음...)
		for (File f : src.listFiles()) {
			
			if (f.isDirectory()) {
				copyDirectory(f, to_copy);
				// f --> images/apple
				// to_copy --> myfiles/images/apple
			} else if (f.isFile()) {
				// (1-2)파일의 이름을 전달해서 해당 파일로 감
				copyFile(f, new File(to_copy, f.getName()));
			}
		}
	}
	
	public static void copy (File src, File dst) {
		File to_copy = new File(dst, src.getName());
			
		System.out.println("------------------------------------");
		System.out.println("원본 파일: " + src);
		System.out.println("복사해야 하는 위치: " + to_copy);
		
		if (src.isDirectory()) {
			// 디렉토리이면 mkdir()
			to_copy.mkdir();
			// 디렉토리 내부도 살펴봐야 함
			
		} else if (src.isFile()) {
			// 파일이면 copyFile메서드를 이용하여 파일을 복사
			copyFile(src, to_copy);
		} else {
			System.out.println("?? 복사 종료"); // 파일도 디렉토리도 아닌 경우
		}
	}	
	
	public static void main(String[] args) {

	
		try {
			copyDirectory(new File("images"), new File("copy_practice"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}








