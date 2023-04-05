package z_myobj;

public class CoffeeBean{
		
	static String[] variousNames = {"예가체프", "안티오티카", "아야르자", "수프리모"};
	static String[] countryNames = {"브라질", "콜롬비아", "과테말라", "에티오피아", "베트남"};
	
	int various;
	int country;
		
	// static 영역에서 해당 클래스의 인스턴스를 미리 만들어 놓을 수 있다
	public static CoffeeBean ETHIOPIA_YIRGACHEFFEE = new CoffeeBean(0, 3);
	public static CoffeeBean COLOMBIA_SUPREMO = new CoffeeBean(3, 1);
	
	public CoffeeBean(int various, int country) {
		this.various = various;
		this.country = country;
	}
	
	public void info() {
		System.out.printf("품종: %s, 생산국: %s\n", variousNames[various], countryNames[country]);

	}
	
	
}
	
	