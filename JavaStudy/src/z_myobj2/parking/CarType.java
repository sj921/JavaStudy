package z_myobj2.parking;

public class CarType {
			
	final public static CarType NORMAL = new CarType(0);
	final public static CarType DISABLED = new CarType(1);
	final public static CarType INFANT_RIDE = new CarType(2);
	final public static CarType SMALLCAR = new CarType(3);
	
	private static String[] displayNameStrings = {"일반", "장애인", "유아동승", "경차"};
	
	int value;
	
	private CarType (int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	// ex) 타입: 유아동승 -> 으로 출력되게 하는 메서드
	public String getDisplayName() {
		return displayNameStrings[value];	
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.value == ((CarType)obj).value;
		
	}
}



