package z_$default;
import java.util.Date;

public class D12_Date{

	/*
		# java.util.Date
		
		- 시간 및 날짜 정보를 저장해놓을 수 있는 클래스
		- 오래된 클래스이기 때문에 메서드는 잘 사용하지 않는다
		- 주로 시간 데이터를 담아 전달하는 용도로 사용한다 (DTO)
	*/
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println();
		Date date2 = new Date(2000L);	// 10->1000->2000
		System.out.println(date2);
		System.out.println();
		
		/*
			System.currentTimeMillis() : 시스템으로부터 유닉스 타임을 받아옴  --> long type
			※ 유닉스 타임 - 1970년 1월 1일 9시 이후로 시간이 얼마나 흘렀는지를 1/1000초로 센 것
		*/
		Long unixTime = System.currentTimeMillis();
		Date now = new Date(unixTime);
		
		System.out.println("현재 Unix Time: " + unixTime);
		System.out.println("Date: " + now);
		System.out.println();
		
		// Date 타입 간 시점 비교가 가능
		System.out.println("date2 after now? " + date2.after(now));
		System.out.println("date2 before now? " + date2.before(now));
		System.out.println();
		
		date2.setTime(1000L * 60 * 60 * 24 * 365 * 31);		
		// date2.setTime(1000 * 60 * 60 * 24 * 365 * 31);	// 숫자가 범위를 넘어서서 연도 안넘어감 --> long타입으로 변환해야함
		System.out.println(date2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
