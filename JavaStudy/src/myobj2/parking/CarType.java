package myobj2.parking;

public class CarType {

	// static이므로 ==으로 비교가 가능하다
	final public static CarType NOMAL = new CarType(0);
	final public static CarType DISABLED = new CarType(1);
	final public static CarType KID = new CarType(2);
	final public static CarType LIGHTCAR = new CarType(3);
	
	private static String[] displayNames = {"일반", "장애인", "유아동승", "경차"};
	
	int value;
	
	private CarType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getDisplayName() {		// ex)타입: 유아동승 --> 으로 출력되게 하는 메서드
		return displayNames[value];
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return this.value == ((CarType)obj).value;
	}
	
}
