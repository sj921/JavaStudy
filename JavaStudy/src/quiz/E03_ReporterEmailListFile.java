package quiz;


import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03_ReporterEmailListFile {
	// 기자들의 이메일들로 이루어진 파일을 생성해보세요

	public static void main(String[] args) {
		Pattern emailPattern = Pattern.compile("\\S+@\\S+");
		Matcher matcher = emailPattern.matcher(D10_ReporterEmailList.text);

		try {
			FileOutputStream out = new FileOutputStream("myFiles/email_list.txt");
			while (matcher.find()) {
				out.write(matcher.group(0).getBytes());
				out.write('\n');
			}
			out.close();
		} catch (Exception e) {
			System.out.println("파일을 찾을 수 없거나 쓰기 도중 에러 발생..");
		}
		System.out.println("프로그램 종료.");
	}


}








//	public static void main(String[] args) {
//
//		Pattern reporterInfoPattern = Pattern.compile("(.+)\t(.+)\t(.+)\t(.+@(.+))\r\n");
//
//		Matcher matcher = reporterInfoPattern.matcher(text);
//
//		try {
//			FileOutputStream out = new FileOutputStream("myFiles/repoter.txt");
//			while (matcher.find()) {
//				String email = matcher.group(4);				
//				out.write(email.getBytes());
//				out.write('\n');
//			}								
//			out.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("해당 경로를 찾지 못함");
//			return;
//		} catch (IOException e) {
//			System.out.println("Write 도중 에러 발생..");
//			return;
//		}
//		System.out.println("쓰기 완료.");
//	}

