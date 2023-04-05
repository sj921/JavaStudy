package z_myobj2.parking;

import java.util.Random;

public class Car {

	// 차량번호와 차종을 연결!
	String number;
	CarType type;
	
	private static Random ran;
	final private static String USAGE_SYMBOLS = 
			"가나다라마거너더러머버서어저고노도로모보소오조구누두루무부수우주하허호배" + "공해육합국";
	final private static CarType[] CAR_TYPES = {
			CarType.NORMAL, CarType.NORMAL, CarType.NORMAL, CarType.NORMAL, CarType.NORMAL,
			CarType.NORMAL, CarType.NORMAL, CarType.NORMAL, CarType.NORMAL, CarType.NORMAL,
			CarType.DISABLED, CarType.INFANT_RIDE, CarType.SMALLCAR, CarType.SMALLCAR
			};
	
	// 차량번호 조합하기 -->  예) 12러3456
	private static String randomCarNumber() {
		
		if (ran == null) {
			ran = new Random();
		}
		StringBuilder sb = new StringBuilder();
		
		sb.append (
				// nextBoolean() : true 아니면 false를 생성
				ran.nextBoolean() ?
						String.format("%02d", ran.nextInt(99) + 1) : 
						String.format("%03d", ran.nextInt(900) + 100)
				);
		sb.append(USAGE_SYMBOLS.charAt(ran.nextInt(USAGE_SYMBOLS.length())));
		sb.append(String.format("%04d", ran.nextInt(10000)));
		
		return sb.toString();
	}
	
	// 차량 종류 랜덤으로 조합하기
	private static CarType randomCarType() {
		if (ran == null) {
			ran = new Random();
		}
		return CAR_TYPES[ran.nextInt(CAR_TYPES.length)];
	}
	
// ----------------------------------------------------------------------------
	
	public Car() {
		number = randomCarNumber();
		type = randomCarType();
	}
	
	public String getNumber() {
		return number;
	}
	
	public CarType getType () {
		return type;
	}
	
	
// ----------------------------------------------------------------------------
	
	// 차량번호와 차종이 함께 나오도록 문자열 조합함
	@Override
	public String toString() {
		return number + "/" + type.getDisplayName();
		
	}
}
