package z_$default;

import z_myobj.CoffeeBean;
import z_myobj.PlayCard;

public class C05_Static {

	public static void main(String[] args) {
		// 인스턴스가 하나도 없는 상황에도 static은 존재할 수 있다
		
		System.out.println(PlayCard.width);
		System.out.println(PlayCard.height);
		
		PlayCard.changeCardSize(200, 300);
		System.out.println(PlayCard.width);
		System.out.println(PlayCard.height);
		
// ----------------------------------------------------------
		
		CoffeeBean.COLOMBIA_SUPREMO.info();
		CoffeeBean.ETHIOPIA_YIRGACHEFFEE.info();
		CoffeeBean myBean = new CoffeeBean(2, 2);
				
		myBean.info();
		
		
		// 익명 방식 (이름이 없어서 다시 사용할 수 없다)
		new CoffeeBean(1, 0).info();
		
	}
		
	
}
