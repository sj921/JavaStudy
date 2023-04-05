package quiz;

import java.util.Scanner;

public class B00_CelToFahr {

	/*
		사용자로부터 섭씨온도(℃)를 입력받았으면 화씨(℉)로 몇도인지 알려주는 프로그램을 만들어보세요.
		(온도 변환 공식은 구글링 할 것)	
	
	*/
	
	public static void main(String[] args) {
	
	
		Scanner tempScanner = new Scanner(System.in);
		
			double celsius, fahrenheit;			// 온도이므로 double 타입 사용할 것!!
		
			System.out.print("섭씨온도(℃)를 입력해주세요 >> ");
		
			celsius = tempScanner.nextDouble();	// 역시 nextInt()가 아니라 nextDouble()을 사용함!
			fahrenheit = (celsius * 9/5) + 32 ;
		
			System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉ 입니다. \n", celsius, fahrenheit);
				
			//(0°C × 9/5) + 32 = 32°F
	
	}
	
}
