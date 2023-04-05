package z_myobj;

import java.util.Arrays;

public class Lotto {

	int[][] nums;
	
	static int MAX_NUM = 45;
	static int MIN_NUM = 1;
	static int NUM_OF_LOTTO = 5;
	static int LOTTO_LENGTH = 6;
	static int WIN_LENGTH = 7;
	
	
	public static boolean isWin (int[] winNum, Lotto lotto){
		// 당첨 체크중
		for (int i = 0; i < NUM_OF_LOTTO; ++i) {
			int count = 0;
			
			for (int j = 0; j < LOTTO_LENGTH; ++j) {
				for (int k = 0; k < WIN_LENGTH; ++k) {
					if (lotto.nums[i][j] == winNum[k]) {
						++count;
						break;
					}
				}
			}
			if (count >= 6) {
				return true;
			}
		}
		return false;
	}
	
	
	public static int[] getWinNum() {					// 7개의 당첨 번호 생성
		int[] win = new int[WIN_LENGTH];
		
		for (int i = 0; i < WIN_LENGTH; ++i) {
			win[i] = (int)(Math.random() * MAX_NUM + MIN_NUM);
			
			for (int j = 0 ; j < i; ++j) {
				if (win[i] == win[j]) {
					--i;								// 번호의 중복을 제거
					break;
				}
			}
		}
		return win;
	}
	
	
	public static int[] auto() {
		int[] lotto = new int[LOTTO_LENGTH];			// 6개의 로또 번호 자동 생성
		
		for (int i = 0; i < LOTTO_LENGTH; ++i) {
			lotto[i] = (int)(Math.random() * MAX_NUM + MIN_NUM);
			
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					--i;								//  번호의 중복을 제거
					break;
				}
			}
		}
		return lotto;
	}
	
	
	public Lotto() {
		nums = new int[NUM_OF_LOTTO][LOTTO_LENGTH];		// 5행 6열 배열
		
		for (int i = 0; i < NUM_OF_LOTTO; ++i) {
			nums[i] = auto();							// 5행안의 배열 auto();로 채움?
		}
	}
	
	
	
	
	
	public Lotto(int[][] nums) {
		this.nums = nums;
	}
	
	
	public void view() {
		for (int i = 0; i < NUM_OF_LOTTO; ++i) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[] winNum = Lotto.getWinNum();
		
		// 당첨될 때까지 용지 생성
		int count = 0;
		while (true) {
			Lotto lotto = new Lotto();
			++count;
			
			if (Lotto.isWin(winNum, lotto)) {
				lotto.view();
				System.out.println("--------------------");
				System.out.println("당첨번호: " + Arrays.toString(winNum));
				break;
			}
		}
		
		System.out.printf("당첨 용지는 %d번 만에 나왔습니다\n", count);
		
		
	}
	
	
	
}