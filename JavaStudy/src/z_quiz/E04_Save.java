package z_quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.Savepoint;
import java.util.Arrays;
import java.util.Scanner;

public class E04_Save {

	/*
		(1) 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후	(computer vs user)

		(2) 프로그램 종료시 전적을 파일에 저장하고				(FileInputStream --> out.write)

		(3) 프로그램 실행시에는 파일에 저장된 전적 데이터를 읽어	(FileInputStream --> byte[] allData = in.readAllBytes();)
			예전 전적이 그대로 이어지도록 만들어보세요

		+) FileOutputStream out = new FileOutputStream("myFiles/test2.txt", true);
		   true로 입력하면 append 모드가 활성화되어 값이 누적되어 산출된다				
	 */

	/**
	@return 0 플레이어 승리, 1 무승부, 2 플레이어 패배
	 */	


	public static int game () {
		return (int)(Math.random() * 3);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalCnt = 0;
		int winCnt = 0;
		int loseCnt = 0;
		int drawCnt = 0;
		// 가위: 1, 바위: 2, 보: 3 으로 설정		

		System.out.println("플레이 횟수를 입력(10회 이하) >> ");
		int totalPlay = sc.nextInt();
		if (totalPlay > 10) {
			System.out.println("잘못된 플레이 횟수를 입력했습니다. 다시 입력해주세요.");
		}


		for (int i = 0; i < totalPlay; ++i){

			int c = (int)(Math.random() * 3) + 1;
			System.out.println("컴퓨터가 가위[1], 바위[2], 보[3] 중에 하나를 선택했습니다.");
			System.out.println("플레이어도 하나를 선택하세요");
			int p = sc.nextInt();

			if (c < 1 || c > 3 || p < 1 || p > 3){
				System.out.println("잘못된 값을 입력했습니다. 1 ~ 3 사이의 값을 입력해주세요.");
			} else if (c == 1 && p == 1) {
				System.out.println("컴퓨터와 플레이어 모두 가위를 냈습니다");
				System.out.println("무승부");
				totalCnt++;
				drawCnt++;
			} else if (c == 1 && p == 2) {

				System.out.println("컴퓨터가 내민 것 : 가위");
				System.out.println("플레이어 승리!");
				totalCnt++;
				winCnt++;
			} else if (c == 1 && p == 3) {
				System.out.println("컴퓨터가 내민 것 : 가위");
				System.out.println("플레이어 패배..");
				totalCnt++;
				loseCnt++;
			} else if (c == 2 && p == 1) {
				System.out.println("컴퓨터가 내민 것 : 바위");
				System.out.println("플레이어 패배..");
				totalCnt++;
				loseCnt++;
			} else if (c == 2 && p == 2) {
				System.out.println("컴퓨터와 플레이어 모두 바위를 냈습니다");
				System.out.println("무승부");
				totalCnt++;
				drawCnt++;
			} else if (c == 2 && p == 3) {
				System.out.println("컴퓨터가 내민 것 : 바위");
				System.out.println("플레이어 승리!");
				totalCnt++;
				winCnt++;
			} else if (c == 3 && p == 1) {
				System.out.println("컴퓨터가 내민 것 : 보");
				System.out.println("플레이어 승리!");
				totalCnt++;
				winCnt++;
			} else if (c == 3 && p == 2) {
				System.out.println("컴퓨터가 내민 것 : 보");
				System.out.println("플레이어 패배..");
				totalCnt++;
				loseCnt++;
			} else if (c == 3 && p == 3) {
				System.out.println("컴퓨터와 플레이어 모두 보를 냈습니다");
				System.out.println("무승부");
				totalCnt++;
				drawCnt++;
			} 

		}
		System.out.println("게임 종료!");
		System.out.println("총 플레이 횟수: " + totalCnt + ", 승리: " + winCnt + 
				", 패배: " + loseCnt + ", 무승부: " + drawCnt);
		System.out.printf("승률: %.2f%%\n", ((winCnt /(double)totalCnt) * 100.0));

		//---------------------------------------
		
		try {
			FileWriter out = new FileWriter("myFiles/save.game", Charset.forName("UTF-8"));
			
			out.write("총 플레이 횟수: " + totalCnt + '\n');
			out.write("승리: " + winCnt + '\n');
			out.write("패배: " + loseCnt + '\n');
			out.write("무승부: " + drawCnt + '\n');
			out.write("승률: " + ((winCnt/(double)totalCnt) * 100.0) + "%" + '\n');
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("쓰기 완료.");
		
	}
}