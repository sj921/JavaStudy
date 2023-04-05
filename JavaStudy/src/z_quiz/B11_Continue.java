package z_quiz;

public class B11_Continue {

	/*
		1. 1부터 30까지 한 줄에 숫자를 5개씩 출력

		2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 출력
	 */

	public static void main(String[] args) {



		//	1. 1부터 30까지 한 줄에 숫자를 5개씩 출력

		int num = 1;
		while (num <= 30) {
			System.out.print(num + "\t");
			num++;	
			
			if (num % 5 != 1) {
				continue;		//	※ continue 넣을 때 아래에 num++; 넣으면 무한 증식되므로 주의!
			}
			System.out.println();
		}
		System.out.println("while문 이후의 num의 값 : " + num);

		
		int sum = 0;
		num = 0;
		
		while (num++ < 200) {
			System.out.println(num);
			
			if (num % 2 != 0 && num % 3 != 0) {
				sum += num;
			}
		}
			
		System.out.println("sum: " + sum);
		
		
		// while문에서 가장 중요한 것은 증감값의 위치에 따라 숫자가 몇 부터 몇 까지 반복될지 정확하게 아는 것
		int i = 0;
		while (i++ < 10) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 출력해야 하는 값이 10개인데 9번 반복하므로 별로인 반복문
		int i1 = 0;
		while (++i1 < 10) {			
			System.out.print(i1 + " ");
		}
		System.out.println();
		
		int i2 = 0;
		while (i2 < 10) {
			System.out.print(i2++ + " ");
		}
		System.out.println();
		
		int i3 = 0;
		while (i3 < 10) {
			System.out.print(++i3 + " ");
		}
		System.out.println();
		
//		System.out.println(1 + "\t");
//		System.out.println(2 + "\t");
//		System.out.println(3 + "\t");
//		System.out.println(4 + "\t");
//		System.out.println(5 + "\t");
//		System.out.println();
//		System.out.println(6 + "\t");
//		System.out.println(7 + "\t");
//		System.out.println(8 + "\t");
//		System.out.println(9 + "\t");
//		System.out.println(10 + "\t");
//		System.out.println();
		

		//	2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 출력

		int j = 0;
		int sum2 = 0;
		while (j++ < 200) {
			if (j % 2 == 0 || j % 3 == 0) {
				continue;
			}
			sum2 += j;
		}
		System.out.println("합계" + sum2);


//		1	0+1
//		6	0+1+5
//		13	0+1+5+7
//		24	0+1+5+7+11
//		37	0+1+5+7+11+13
//		54	0+1+5+7+11+13+17		
//		73	.....+19		
//		96	.....+23
//		121	.....+25
//		150	.....+29
		
	}
	
}
