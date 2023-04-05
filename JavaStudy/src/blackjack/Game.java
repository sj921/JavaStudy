package blackjack;

import java.util.Scanner;

public class Game {

	public static void gameInfo(Card[] user, Card[] dealer) {
		System.out.println("- User");
		for (int i = 0; i < user.length && user[i] != null; ++i) {
			Card c = user[i];
			System.out.printf("[%c%s], ", Card.shapes[c.shape], Card.ranks[c.rank]);
		}
		System.out.printf("(%d)", BlackJack.getValue(user));
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("- Dealer");
		for (int i = 0; i < dealer.length && dealer[i] != null; ++i) {
			Card c = dealer[i];
			
			if (!c.hidden) {
				System.out.printf("[%c%s], ", Card.shapes[c.shape], Card.ranks[c.rank]);
			} else {
				System.out.print("[XX]");
			}
		}
		System.out.println();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Deck d = new Deck(3);
		
		Card[] user = new Card[21]; 
		Card[] dealer = new Card[21];
		
		System.out.println("유저에게 두 장");
		user[0] = d.draw();
		user[1] = d.draw();
		
		System.out.println("딜러에게 두 장");
		dealer[0] = d.draw();
		Card c = d.draw();
		c.hide();
		dealer[1] = c;
		
		
		
		Scanner sc = new Scanner(System.in);
		int userIndex = 2;
		int dealerIndex = 2;
		
		while (true) {
			gameInfo(user, dealer);
			
			System.out.println("1. hit\t2.stand");
			int hit = sc.nextInt();
			
			if (hit == 1) {
				user[userIndex++] = d.draw();
				
				if (BlackJack.getValue(user) > 21) {
					gameInfo(user, dealer);
					System.out.println("플레이어 버스트로 패배");			// 가진 카드의 합이 21이 넘으면 버스트 (무조건 패배, 딜러는 카드를 뽑지도 않는다)
					return;
				} else if (BlackJack.getValue(user) == 21) {
					dealer[1].open();
					while (BlackJack.getValue(dealer) < 16) {		
						dealer[dealerIndex++] = d.draw();
					}
					break;
				}
				
			} else if (hit == 2) {
				dealer[1].open();
				while (BlackJack.getValue(dealer) < 16) {			// 딜러는 가지고 있는 카드 합이 16 이하라면 무조건 뽑고, 17 이상이면 무조건 멈춰야 한다
					dealer[dealerIndex++] = d.draw();
				}
				break;
			} else {
				continue;
			}
		}
		
		int userValue = BlackJack.getValue(user);
		int dealerValue = BlackJack.getValue(dealer);
		
		gameInfo(user, dealer);
		
		if (dealerValue > 21) {
			System.out.printf("%d(user) vs %d(dealer)딜러의 버스트로 유저 승!\n", userValue, dealerValue);
		} else if (userValue == dealerValue) {
			System.out.printf("%d(user) vs %d(dealer)로 비김\n", userValue, dealerValue);
		} else if (userValue > dealerValue) {
			System.out.printf("%d(user) vs %d(dealer)로 유저 승!\n", userValue, dealerValue);
		} else {
			System.out.printf("%d(user) vs %d(dealer)로 딜러 승!\n", userValue, dealerValue);
			
		}
			
			
			
//			System.out.println("유저 카드의 가치: " + BlackJack.getValue(user));
//			System.out.println("딜러 카드의 가치: " + BlackJack.getValue(dealer));
			
		
		
		
				
//		System.out.println("카드 개수: " + d.cards.length);
//		
//		for (int i = 0; i < d.cards.length; ++i) {		// 카드 잘 섞여 나오는지 테스트
//			System.out.println(d.cards[i]);
//		}
		
		
		
		
//		for (int shape = 0; shape < Card.shapes.length; ++shape) {
//			for (int rank = 0; rank < Card.ranks.length; ++rank) {
//				Card c = new Card(shape, rank);
//				System.out.println(c);
			// 생성자 만들어두면 아래와 같은 코드는 필요X...
			// c.shape = shape;		// 0 ~ 3 shape을 반복하는동안
			// c.rank = rank;		// 각각 0 ~13 rank를 생성하여 총 카드를 52개 만든다
//			}
//		}
	}
	
	
}
