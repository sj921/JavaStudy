package z_$default;

import z_myobj.Subway;

public class C03_OOP {

	public static void main(String[] args) {
		
		Subway one = new Subway();
		Subway two = new Subway();
		
		one.line = 1;
		two.line = 2;
		
		one.stations = new String[] {"시청", "종각", "종로3가", "종로5가"};	// 0-1-2-3-2-1-0
		two.stations = new String[] {"당산", "합정", "홍대입구", "신촌", "이대"}; // 0-1-2-3-4-0-1-2-3
		
		one.rotate = false;
		one.direction = true;		
		for (int i = 0; i < 10; ++i) {
			one.information();
			one.next();
		}
		
		
		two.rotate = true;
		two.direction = true;
		for (int i = 0; i < 10; ++i) {
			two.information();
			two.next();
		}
		
	}
	
}
