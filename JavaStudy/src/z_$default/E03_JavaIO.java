package z_$default;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E03_JavaIO {

	public static void main(String[] args) {
		
		try {
			FileOutputStream out = new FileOutputStream("z_myFiles/test.txt");
			
			out.write(65);
			out.write(66);
			out.write(67);
			out.write('\n');
			
			// String.getBytes() : 해당 문자열을 byte[]로 변환한 값을 리턴
			
			out.write("Hello, File! \n".getBytes());
			
			// 다 사용한 Stream은 반드시 닫아줘야 한다
			out.close();
		} catch (FileNotFoundException e) {			// 파일을 찾지 못함
			System.out.println("해당 경로를 못찾음..");
			return;			
		} catch (IOException e) {					// 입출력 예외처리
			System.out.println("해당 경로를 못찾음..");
			return;			
		}
		
		System.out.println("쓰기 완료.");		// 폴더 생성 후 워크스페이스 저장 후 F5(새로고침)하면 폴더 내 파일 생성된다
		
	}
}
