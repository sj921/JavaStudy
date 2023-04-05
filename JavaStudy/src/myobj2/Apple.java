package myobj2;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class Apple {
	
	public static final Apple 엄청좋은사과 = new Apple(1, 100, 500, 10);
	public static final Apple 적당한사과 = new Apple(2, 80, 400, 60);
	public static final Apple 엄청나쁜사과 = new Apple(5, 35, 200, 30);
	
	int color;
	int sweet;
	int price;
	int appear;
	
	private Apple (int color, int sweet, int price, int appear) {
		this.color = color;
		this.sweet = sweet;
		this.price = price;
		this.appear = appear;
	}
}
