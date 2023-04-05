package quiz;

import java.util.Scanner;

import rock_paper_scissors.GameConfig;

/*
		(1) 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후	(computer vs user)
		
		(2) 프로그램 종료시 전적을 파일에 저장하고				(FileInputStream --> out.write)
		
		(3) 프로그램 실행시에는 파일에 저장된 전적 데이터를 읽어	(FileInputStream --> byte[] allData = in.readAllBytes();)
			예전 전적이 그대로 이어지도록 만들어보세요
			
		+) FileOutputStream out = new FileOutputStream("myFiles/test2.txt", true);
		   true로 입력하면 append 모드가 활성화되어 값이 누적되어 산출된다				
 */
public class E04_Save {
	static Scanner sc = new Scanner(System.in);
	GameConfig config;
	
	
	int turn;
	int currentPlayer;
		
	
	public E04_Save() {
		config = new GameConfig(2, 3);	// 플레이어는 2명, 내밀 수 있는 것은 3가지
	}
	
	public void setConfig(int players, int symbols) {
//		config.players = players;
//		config.symbols = symbols;
	}
	
	private void init() {
		turn = 0;
		currentPlayer = 1;
	}

	public static int game() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
