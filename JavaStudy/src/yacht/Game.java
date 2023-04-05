
package yacht;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 기능 테스트..
		//			Dice d = new Dice();
		//			
		//			System.out.println(d);
		//			d.roll("345");
		//			
		//			System.out.println(d);
		//			d.roll("345");


		Dice dice = new Dice();

		int rerollChance = 2;

		while (rerollChance > 0) {
			System.out.println(dice);		
			System.out.printf("다시 굴리기 (%d회 남음)> ", rerollChance);
			String input = sc.nextLine();

			// 다시 굴렸는데, 만약에.. input이 0과 같으면 탈출...?
			if (input.equals("0")) {
				// 체크 시작
				break;
			} else {
				dice.roll(input);
				--rerollChance;
			}

		}

		System.out.println(dice);
		System.out.println(YachtDiceRules.check(dice));





	}



}
