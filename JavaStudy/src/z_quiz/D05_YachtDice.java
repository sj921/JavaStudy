package z_quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D05_YachtDice {

	/*
		1. 플레이어는 다섯개의 주사위를 던진다 (주사위의 눈은 1 ~ 6)
		
		2. 다섯 개의 주사위 눈에 따라 다음을 구분한다
		
			(1) 풀 하우스 (같은 눈이 2개/3개)
				ex: 11555, 33366 ...				
			(2) 스몰 스트레이트 (1234/2345/3456)
				ex: 62134				
			(3) 라지 스트레이트 (12345/23456)
				ex: 52364				
			(4) 4 다이스 (같은 숫자 4개)
				ex: 44443, 11511
			(5) Yacht (같은 숫자 5개)
				ex: 66666, 55555
		
		3. 플레이어는 다시 던지고 싶은 주사위를 여러개 골라서 다시 던질 수 있다 (2회)
		
			44241 -> (2, 1 잡아서 던짐) 44442
	*/
	
public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
				
		Collections.addAll(list, 1, 2, 3, 4, 5, 6);
					
		Collections.shuffle(list);
		
		System.out.println(list);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
