package quiz;

public class C06_PirateGame {

	/*
		해적아저씨 게임을 객체 지향적으로 만들어보세요
		
		1. 게임이 시작되면 우선 플레이어가 몇 명인지 정한다
		
		2. 여러 플레이어가 돌아가며 통에 칼을 꼽는다
		
		3. 잘못된 곳에 칼을 꼽은 플레이어가 게임에 패배한다
		
		4. 칼을 찌를 수 있는 홈은 15개가 있고 그 중 3개가 꽝이 된다
			(꽝의 위치는 매 판마다 랜덤으로 설정된다) 
	
		5. 사용자가 원한다면 게임의 설정을 변경할 수 있어야 한다
			(홈의 개수와 꽝의 개수 설정 기능)
	*/
		
	
	
	
	
	
	
	
}

	
	
	
// 내가 푼 거....	
//	static int participant = 3;
//	static int knife_length = 15;
//	static int lose_length = 3;
//	
//	
//	public static int[] gameSet() {					
//		int[] knifeArr = new int[knife_length];	 // 칼 꽂는 곳 자리 15개 랜덤으로 섞기
//		
//		for (int i = 0; i < knife_length; ++i) {				
//			knifeArr[i] = (int)(Math.random() * knife_length);	// 0 ~ 14까지 랜덤 배열 생성
//			
//			for (int j = 0; j < i; ++j) {
//				if(knifeArr[i] == knifeArr[j]) {
//					--i;
//					break;
//				}
//			}
//		}
//		return knifeArr;
//	}
//	
//	public static int[] loseSpot() {
//		
//		int[] loseArr = new int[lose_length];		// 꽝 자리 3개 
//		
//		for (int i = 0; i < lose_length; ++i) {
//			loseArr[i] = (int)(Math.random() * knife_length);	// 칼 꽂는 자리 15개 중 3개 골라서 생성
//			
//			for (int j = 0; j < i; ++j) {
//				if(loseArr[i] == loseArr[j]) {
//					--i;
//					break;
//				}
//			}
//		}
//		return loseArr;		
//	}
//	
//	public static int Loser(int count, int participant) {		
//		int count = 0;
//		for (int i = 0; i < knife_length; ++i) {
//			if (knifeArr[i] == loseArr[i]) {
//				++count;
//				break;
//			}
//		}
//		return count % participant;
//	}
//	
//	// 배열의 두값이 일치할때 int? boolean? 숫자로 몇번째에서 꽝인지 산출? 아니면 t/f??
//	// 6번째 꽝 % 참가자 수 
//	// 6 % 3 == 0 (3번째 사람이 꽝 당첨!)
//	// 5 % 3 == 2 (2번)
//	// 4 % 3 == 1 (1번)
//	
//	public static void main(String[] args) {
//		
//		System.out.println(Arrays.toString(gameSet()));
//		System.out.println(Arrays.toString(loseSpot()));
//		System.out.println(Loser());		// 메서드(함수)는 ()가 빠지면 실행되지 않음!!
//		
//	}
	

