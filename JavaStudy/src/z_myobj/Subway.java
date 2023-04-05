package z_myobj;

public class Subway {

	public String[] stations;
	public int current_station;
	public int line;
	public boolean direction = true;	//  진행방향이 오른쪽이면 true,  왼쪽이면 false
	public boolean rotate;
	
	
	// 생성자는 클래스와 이름이 같아야 함. 리턴 타입 없음
	public Subway() {		
	}
	
	// 인스턴스 메서드를 만들 때는 static을 사용하지 않음
	
	public void next() {
		current_station = rotate? nextRotateStation() : nextStation();
	}
	
	// 다음역이 무엇인지 계산하여 반환하는 메서드
	// 정방향, 역방향 왕복 구조
	public int nextStation() {
		if (current_station == stations.length - 1) {
			direction = false;		// 역방향 (-1)
		} else if (current_station == 0){
			direction = true;		// 정방향 (+1)
		}
		return current_station + (direction? 1 : -1);
	}
	
	
	// 순환구조
	public int nextRotateStation() {
		if (direction && current_station == stations.length - 1) {		
			return 0;
		} else if (!direction && current_station == 0) {
			return stations.length - 1;
		} 
		return current_station + (direction? 1 : -1);
	}
	
	
	public void information() {
		System.out.println("---------------------");
		System.out.printf("이 열차는 %s호선 열차입니다\n", line);
		System.out.printf("현재 역은 %s역 입니다\n", stations[current_station]);
		System.out.printf("다음 역은 %s역 입니다\n", stations[rotate? nextRotateStation() : nextStation()]);
		System.out.println("---------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}