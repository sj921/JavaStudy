import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.spi.AbstractResourceBundleProvider;

import javax.swing.plaf.synth.SynthProgressBarUI;

public class E07_BufferedStream {

	/*
		# Buffer

		- 데이터를 한 개씩 여러번 입출력하는 것보다
		  모아서 한꺼번에 입출력하는 방식이 훨씬 처리 속도가 빠르다
		- 버퍼 기능이 미리 구현된 스트림 클래스들은 앞에 buffered라는 이름이 붙는다
		- BufferedInputStream, BufferedReader, BufferedWriter, ...
	 */
	
	// alltext에 읽기 메서드를 호출하는 것을 대입함.
	private static String alltext = read2();
	
// 쓰기
	// 한 글자씩 쓰기
	public static void write0() {
		
		FileWriter out = null;
		try {
			out = new FileWriter("./write_test/write0.txt");
			
			int len = alltext.length();
			for (int i = 0; i < len; ++i) {
				out.write(alltext.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) out.close();
			} catch (IOException e) {}
		}
	}
	
	// 직접 구현한 버퍼 방식으로 쓰기
	// -> AutoClose 방식의 try-catch, () 내부에 선언한 AutoCloseable 타입의 인스턴스들은 자동으로 close()를 호출한다
	public static void write1() {
		
		try (
			FileWriter out = new FileWriter("./write_test/write1.txt")
		) {
			StringBuilder sb = new StringBuilder(alltext);
						
			int len = alltext.length();
			
			// alltext를 i부터 i+2048개까지 쓰는데,
			// 마지막 길이가 2048개가 안 되면(i+2048이 len을 초과하면)? len-i(true)와 2048(false)중에 선택..
			for (int i = 0; i < len; i += 2048) {			
				out.write(alltext, i, i + 2048 > len ? len - i : 2048);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	
	
	// BufferedWriter로 쓰기
	public static void write2() {
		try (FileWriter fout = new FileWriter("./write_test/write2.txt");
			BufferedWriter out = new BufferedWriter(fout);
		){
			out.write(alltext);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
// 읽기
	// 한 글자씩 읽기
	public static void read0() {
		File book = new File("myFiles/frankenstein.txt");
		StringBuilder sb = new StringBuilder();
		
		try {
			FileReader in = new FileReader(book);
			
			int ch;
			while ((ch = in.read()) != -1) {
				sb.append((char)ch);
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	// 기존 방식으로 읽기 (FileReader)
	public static void read1() {
		File book = new File("myFiles/frankenstein.txt");

		StringBuilder sb = new StringBuilder();

		

		try {
			FileReader in = new FileReader(book);

			// 한개씩 출력하기보다는 모아서 한번에 출력하는 편이 훨씬 빠르다
			char[] cbuf = new char[2048];

			int len;
			while ((len = in.read(cbuf)) != -1) {
				sb.append(cbuf, 0 , len);
			}

			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	// 한 줄 씩 읽기 (BufferedReader)
	public static String read2() {
		File book = new File("myFiles/frankenstein.txt");
		StringBuilder sb = new StringBuilder();
		try {
			FileReader fin = new FileReader(book);
			BufferedReader in = new BufferedReader(fin);
			
			// readLine() : BufferedReader에 추가된 한 줄씩 읽는 기능
			String line;
			while ((line = in.readLine()) != null) {
				sb.append(line);
				sb.append('\n');
				
			}
			// System.out.println(sb);
						
			// 최근에 열었던 순서대로 닫아야 한다
			in.close();
			fin.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	// 소요시간을 계산하여 출력하기
	// 소요시간을 반환하는 메서드를 생성
	public static void checkTime (long startTime) {
		System.out.println("소요 시간: " + 
				(System.currentTimeMillis() - startTime) + "ms");
		
		
	}


	// 각각 출력해보기!
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		read1();
		checkTime(startTime);
		
		startTime = System.currentTimeMillis();
		read2();
		checkTime(startTime);
		
		startTime = System.currentTimeMillis();
		read0();
		checkTime(startTime);
		
		startTime = System.currentTimeMillis();
		write0();
		checkTime(startTime);
		
		startTime = System.currentTimeMillis();
		write1();
		checkTime(startTime);
		
		startTime = System.currentTimeMillis();
		write2();
		checkTime(startTime);
		
		
	

	}
}
