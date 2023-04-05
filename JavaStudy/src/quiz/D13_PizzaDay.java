package quiz;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D13_PizzaDay {

	/*
		실행하면 오늘로부터 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어보세요
		
		파파스데이 : 매월 18일
		파파프라이데이 : 홀수 번째 금요일
		
		※ 이벤트 날짜가 겹치는 경우 둘 모두 적용됨을 알려줘야 함
	*/
	
	public static boolean checkPapasDay (Calendar toCheck) {
		return toCheck.get(Calendar.DATE)  == 18;
	}
	
	public static boolean checkPapaFriday (Calendar toCheck) {
		return toCheck.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY && 
				toCheck.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1;
	}
	
	public static void printEventDays(Calendar start) {
		// Calendar event = start;					// 얕은 복사 (※ Object 클래스 참조)
		Calendar event = (Calendar) start.clone();	// 깊은 복사 (메서드를 실행해도 today의 값을 바꾸고 싶지 않은 경우 -> clone을 사용함)
													// 값이 변해버리면 for문 다시 돌려야 함
		SimpleDateFormat eventDayFormat = new SimpleDateFormat("yy-MM-dd E");
		
		for (int i = 0; i < 365; ++i) {
			event.add(Calendar.DATE, 1);
			System.out.print(eventDayFormat.format(event.getTime()) + " - ");
			
			boolean eventExist = false;
			boolean otherEventExist = false;
			
			if (checkPapasDay(event)) {
				System.out.print("파파스데이");
				otherEventExist = true;
				eventExist = true;
			}
			
			if (checkPapaFriday(event)) {
				if (otherEventExist) {
					System.out.print(", 파파프라이데이 (※ 중복 적용 가능)");
				} else {
					System.out.print("파파프라이데이");
				}
				eventExist = true;
			}
					
			if (!eventExist) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		printEventDays(today);
		
		System.out.println("메서드를 실행한 후의 today: " + today.get(Calendar.YEAR));
	}
}
