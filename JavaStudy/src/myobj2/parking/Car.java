package myobj2.parking;

import java.util.Random;

public class Car {
	String number;
	CarType type;
	
	private static Random r;
	final private static String USAGE_SYMBOLS = 
			"가나다라마거너더러머버서어저고노도로모보소오조구누두루무부수우주하허호배" + "공해육합국";
	final private static CarType[] CAR_TYPES = {
			CarType.NOMAL, CarType.NOMAL, CarType.NOMAL, CarType.NOMAL,  // 일반차량이 나올 확률을 높이기 위해 변수명의 개수를 조절하여 차량 타입의 빈도를 조절함
			CarType.NOMAL, CarType.NOMAL, CarType.NOMAL, CarType.NOMAL, 
			CarType.LIGHTCAR, CarType.LIGHTCAR, CarType.LIGHTCAR, CarType.LIGHTCAR ,
			CarType.KID, CarType.DISABLED		// 만들어진 인스턴스를 사용, 새로운 carType을 만든 것이 아님
	};
		
	private static String randomCarNumber() {
		if (r == null) {
			r = new Random();
		}
		StringBuilder sb = new StringBuilder();
		
		sb.append(
				r.nextBoolean() ?
						String.format("%02d", r.nextInt(99) + 1) : 		// 차량 번호 앞자리가 2자리인 경우(0~99)
						String.format("%03d", r.nextInt(900) + 100)		// 차량 번호 앞자리가 3자리인 경우 (100~999)
		); 
		sb.append(USAGE_SYMBOLS.charAt(r.nextInt(USAGE_SYMBOLS.length())));
		sb.append(String.format("%04d", r.nextInt(10000)));
		
		return sb.toString();
	}
		
	private static CarType randomCarType() {
		if (r == null) {
			r = new Random();
		}
		return CAR_TYPES[r.nextInt(CAR_TYPES.length)];
	}
	
	public Car() {
		number = randomCarNumber();
		type = randomCarType();
		
		// System.out.println("차번호: " + number);
		// System.out.println("타입: " + type.getDisplayName());
	}
	
	public String getNumber() {
		return number;
	}
	
	public CarType getType() {
		return type;
	}
	
	
	
	@Override
	public String toString() {
		return number + "/" + type.getDisplayName();
		
	}
}
