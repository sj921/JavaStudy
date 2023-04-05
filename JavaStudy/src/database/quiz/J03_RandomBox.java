package database.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import database.quiz.dataaccess.DatabaseAccess;
import database.quiz.datamodel.GameUser;
import z_database.quiz.dataaccess.DatabaseAccess2;

public class J03_RandomBox {

/*
	사용자가 실행할 때마다 무언가를 랜덤으로 뽑는 프로그램을 만들어주세요

	(1) 랜덤으로 뽑는 물건은 자유 (축구선수, 농구선수, ...)

	(2) 사용자에게는 재화가 있어서 재화를 다 쓰면 뽑기가 취소되어야 한다 (돈, 다이아몬드, 루비, ...)

	(3) 모든 상품은 각자의 확률대로 뽑혀야 한다

	(4) 사용자는 ID와 비밀번호로 인증하면 뽑기를 진행할 수 있다 	
 */

	public static void main(String[] args) throws IOException {
		// Scanner sc = new Scanner(System.in);
	
		// Scanner보다 성능이 좋다
		BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아이디를 입력해주세요. ");
		String userId = in.readLine();
		
		System.out.print("비밀번호를 입력해주세요. ");
		String userPassword = in.readLine();
		
//		System.out.println(userId);
//		System.out.println(userPassword);
		
		GameUser userInfo = DatabaseAccess.login(userId, userPassword);
		
		
		while (true) {
			System.out.println(userInfo.getUser_id() + "님이 가지고 있는 골드" 
					+ userInfo.getGold());
			
			int select = -1;
			
			try {
				System.out.print("1. 뽑기  2. 목록보기  3. 그만하기\n >>");
				select = Integer.parseInt(in.readLine().trim());
				
				if (select < 1 || select > 3) {
					continue;
				}
			} catch (NumberFormatException e) {
				continue;
			}
			
			if (select == 1) {
				DatabaseAccess.openBox(userInfo);
				
			} else if (select == 2) {
				//2. 목록보기 구현하기 -> 숙제!! (로그인한 사람이 가지고 있는 아이템 목록)
				DatabaseAccess.ownitemList(userId, null);
				
			} else if (select == 3) {
				System.out.println("그만하기를 선택하셨습니다.");
				break;
			}
			
			
		}
	}
}





