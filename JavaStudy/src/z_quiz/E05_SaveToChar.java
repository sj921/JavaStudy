package z_quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E05_SaveToChar {
	/*
		가위바위보 전적을 FileReader와 FileWriter를 사용해 저장해보세요
		(가위바위보 로직은 반드시 만들었던 것을 재활용할 것)	
	 */

	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("myFiles/save.game", Charset.forName("UTF-8"));
			
			char[] buff = new char[20];
			
			int i = 0;
			int count;
			while ((count = in.read(buff)) != -1) {
				System.out.println(new String(buff, 0, count));
			}
			
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
