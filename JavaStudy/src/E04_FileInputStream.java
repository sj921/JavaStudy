import java.io.FileInputStream;

public class E04_FileInputStream {

	public static void main(String[] args) {

		try {
			
			// FileOutputStream out = new FileOutputStream("myFiles/test2.txt", true);
			// true로 입력하면 append 모드가 활성화되어 값이 누적되어 산출된다
			FileInputStream in = new FileInputStream("myFiles/test2.txt");
			
			// FileInputStream in = new FileInputStream("myFiles/email_list.txt");	// 위,아래 파일 번갈아가며 확인해보기!
			
			// in.read() : 데이터를 한 바이트씩 읽는다. ★더 이상 읽을 게 없는 경우 -1을 리턴 (EOF : end of file)★
			//			   한 바이트씩 읽기 때문에 한글 등의 2바이트 문자를 읽기가 힘들다--> 글자가 깨지기 쉬움
			
			// ※ 방법 1 --> 한글 읽기 힘듦!!
//			int result = 0;
//			while (true) {
//				result = in.read();
//				if (result == -1) {
//					break;
//				}
//				System.out.print((char)result);
//			}
			
			// ※ 방법2	--> 한글 잘 읽힘!!	
			// 모든 내용을 한번에 byte[]로 읽기
			byte[] allData = in.readAllBytes();
			
			// byte[]을 요구하는 문자열 생성자로 재구성하기
			System.out.println(new String(allData));
			// System.out.println(new String(allData, "UTF-8")); // --> 위의 출력결과는 우연히 같은 유형으로 입력된 것..

			// 더이상 안쓸거라면 close
			in.close();
		} catch (Exception e) {
			System.out.println("뭔가 문제 생김");
		}
		System.out.println();
		System.out.println("프로그램 끝");
	}




}




