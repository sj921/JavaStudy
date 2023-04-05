package z_quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import z_myobj2.parking.Car;
import z_myobj2.parking.CarType;

public class D14_ParkingSystem {
	/*
		# 승용차 요일제 시행에 따른 차량 진입통제 안내		
			월요일	화요일	수요일	목요일	금요일
			1, 6	2, 7	3, 8	4, 9	5, 0	
		1) 요일별로 차량의 끝번호에 따라 출입을 허가 또는 통제한다.	
		2) 장애인, 유아동승, 경차 등은 제외되므로 출입 가능
	 */
	public static String checkRestricted (Car car, LocalDate date) {
		// 문자열 비교는 equals로 해야하지만(주소가 아니라 값으로 비교해야 하므로),
		// CarType은 메모리상에 4개뿐이므로 ==으로 비교가 가능하다
		
		// getDayOfWeek()는 int가 아닌 DayOfWeek 타입 인스턴스를 반환
		// DayOfWeek dayOfWeek = date.getDayOfWeek();
		// System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN));
				
		// 5부제 제외 차량 조건문
		if (car.getType() == CarType.DISABLED) {
			return String.format("[%s] 장애인 차량은 차량5부제 제외 차량입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if (car.getType() == CarType.INFANT_RIDE) {
			return String.format("[%s] 유아동승 차량은 차량5부제 제외 차량입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if (car.getType() == CarType.SMALLCAR) {
			return String.format("[%s] 경차는 차량5부제 제외 차량입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} 
		
		char lastNum = car.getNumber().charAt(car.getNumber().length() -  1);
		
		
		// 5부제 대상 차량 조건문
		// &&는 ||보다 먼저 연산되므로 주의해야 한다
		if ((lastNum == '1' || lastNum == '6') && date.getDayOfWeek() == DayOfWeek.MONDAY) {
			return String.format("[%s] %s 출입금지입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '2' || lastNum == '7') && date.getDayOfWeek() == DayOfWeek.TUESDAY) {
			return String.format("[%s] %s 출입금지입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '3' || lastNum == '8') && date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
			return String.format("[%s] %s 출입금지입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '4' || lastNum == '9') && date.getDayOfWeek() == DayOfWeek.THURSDAY) {
			return String.format("[%s] %s 출입금지입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '5' || lastNum == '0') && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
			return String.format("[%s] %s 출입금지입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else {
			return String.format("[%s] 주차 가능합니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		}
	}
	
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>(10);
		
		for (int i = 0; i < 10; ++i) {
			cars.add(new Car());
		}
		
		LocalDate checkDay = LocalDate.now();
		final int A_WEEK = 7;
		
		for (int i = 0; i < A_WEEK; ++i) {
			System.out.println(checkDay.getDayOfWeek() + " TEST : ");
			
			for (Car car : cars) {
				// test
				String result = checkRestricted(car, checkDay);
				System.out.println("\t" + result);
			}
			checkDay = checkDay.plusDays(1);
		}
	}
}	