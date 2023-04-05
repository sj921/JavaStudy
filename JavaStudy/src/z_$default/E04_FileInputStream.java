package z_$default;

import java.io.FileInputStream;

public class E04_FileInputStream {

	public static void main(String[] args) {

//		try {
//			int result = 0;
//			
//			while (true) {
//				result = in.read();
//				if (result == -1) {
//					break;
//				}
//				System.out.print((char)result);
			
			
			try {
				FileInputStream in = new FileInputStream("z_myFiles/test2.txt");
				
				byte[] allData = in.readAllBytes();
				
				System.out.println(new String(allData));
				
				in.close();
			} catch (Exception e) {
				System.out.println("뭔가 문제 생김");
			}
		
		System.out.println();
		System.out.println("프로그램 끝");
	}

}




