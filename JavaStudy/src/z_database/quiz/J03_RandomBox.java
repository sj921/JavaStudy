package z_database.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import z_database.quiz.dataaccess.DatabaseAccess2;
import z_database.quiz.datamodel.GameUser2;

public class J03_RandomBox {

/*
	사용자가 실행할 때마다 무언가를 랜덤으로 뽑는 프로그램을 만들어주세요

	(1) 랜덤으로 뽑는 물건은 자유 (축구선수, 농구선수, ...)

	(2) 사용자에게는 재화가 있어서 재화를 다 쓰면 뽑기가 취소되어야 한다 (돈, 다이아몬드, 루비, ...)

	(3) 모든 상품은 각자의 확률대로 뽑혀야 한다

	(4) 사용자는 ID와 비밀번호로 인증하면 뽑기를 진행할 수 있다 	
 */

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("아이디를 입력해주세요.");
		String userId = in.readLine();
		
		System.out.print("비밀번호를 입력해주세요.");
		String userPw = in.readLine();
		
		GameUser2 userInfo = DatabaseAccess2.login(userId, userPw);
		
		while (true) {
			System.out.println(userInfo.getUser_id() + "님이 가지고 있는 골드"
					+ userInfo.getGold());
			
			int select = -1;
			
			try {
				System.out.print("1.뽑기 2. 목록보기 3. 그만하기 \n >> ");
				select = Integer.parseInt(in.readLine().trim());
				
				if (select < 1 || select > 3) {
					continue;
				}
				
			} catch (NumberFormatException e) {
				continue;
			}
			
			if (select == 1) {
				DatabaseAccess2.openBox2(userInfo);
			} else if (select == 2) {
				// 2.목록보기
								
				DatabaseAccess2.ownitemList();
				
				
			} else if (select == 3) {
				System.out.println("그만하기를 선택하셨습니다.");
				break;
			}
		}
	}
}





