package z_database.quiz.dataaccess;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import z_database.quiz.datamodel.GameUser2;

public class DatabaseAccess2 {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String id = "testuser2";
	private static String pw = "1234";
	
	private static List<Integer> boxItems2 = new ArrayList<>();
	
	// 드라이버 호출
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		// 아이템 뽑기 배열 생성
		try (
			Connection conn = DriverManager.getConnection(url, id, pw);
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM item");
			ResultSet rs = pstmt.executeQuery();
		){
			while (rs.next()) {
				int prob = Math.round(rs.getFloat("probability") * 100);
				
				for (int i = 0; i < prob; ++i) {
					boxItems2.add(rs.getInt("item_id"));
				}
			}
			Collections.shuffle(boxItems2);
			
			System.out.println(boxItems2);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void openBox2 (GameUser2 user) {
		int gold = user.getGold();
		
		if (gold < 1000) {
			System.out.println("소지금이 부족합니다..");
			return;
		}
		
		// 1. DB의 소지금을 감소하고
		// 2. 아이템 목록에 추가
		
		String reduceGold = "UPDATE gameuser SET gold = gold - 1000 WHERE user_num = ?";
		String addownItem = "INSERT INTO ownitem VALUES" + "(ownitem_seq.nextval,?,?,sysdate)";
		String getItem = "SELECT * FROM item WHERE item_id = ?";
		
		try (
			Connection conn = DriverManager.getConnection(url, id, pw);
			PreparedStatement pstmt1 = conn.prepareStatement(reduceGold);
			PreparedStatement pstmt2 = conn.prepareStatement(addownItem);
			PreparedStatement pstmt3 = conn.prepareStatement(getItem);
		){
			// 확률대로 뽑은 아이템의 번호
			int item_id = boxItems2.get((int)(Math.random() * boxItems2.size()));
			
			// 물음표(?) 채우기
			pstmt1.setInt(1, user.getUser_num());
			pstmt2.setString(1, user.getUser_id());
			pstmt2.setInt(2, item_id);
			pstmt3.setInt(1, item_id);			
			
			// 다 만든 쿼리문 실행하여 DB에 반영하기
			pstmt1.executeUpdate();
			pstmt2.executeUpdate();
			
			// 뽑은 아이템 정보 가져와서 출력해주기
			ResultSet rs = pstmt3.executeQuery();
			rs.next();
			
			System.out.printf("[%s]님이 [%s]를 뽑으셨습니다\n", 
					user.getUser_id(), rs.getString("item_name"));
			
			user.setGold(gold - 1000);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static GameUser2 login (String userId, String userPw) {
		
		String sql = "SELECT * FROM gameuser WHERE user_id = ?";
		
		try (
			Connection conn = DriverManager.getConnection(url, id, pw);
			PreparedStatement pstmt = conn.prepareStatement(sql);	
		){
			pstmt.setString(1, userId);
			try (
				ResultSet rs = pstmt.executeQuery()
			){
				GameUser2 user = null;
				
				if (rs.next()) {
					user = new GameUser2(
							rs.getInt(1), 
							rs.getString(2), 
							rs.getString(3), 
							rs.getInt(4)
							);
				}
				
				// userId의 사용자가 없어서 조회가 안된 경우 null을 리턴
				if (user == null) {
					return null;
				} else {
					if (user.getUser_pw().equals(userPw)) {
						// 비밀번호 맞춰서 로그인에 성공하는 경우 정보를 리턴
						return user;
					} else {
						// 비밀번호 틀려서 로그인 실패하는 경우 null을 리턴
						return null;
					}
				}
			} 
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}	// end of try~catch
	}	// end of GameUser login
	
	
	
	public static void ownitemList () {
	
		String sql = "SELECT * FROM OwnItem";

	
		try (
				Connection conn = DriverManager.getConnection(url, id, pw);
				PreparedStatement pstmt = conn.prepareStatement(sql);	

			){
				try (
					ResultSet rs = pstmt.executeQuery(sql);
				){
										
					System.out.println("소지한 아이템 목록▽");
					while (rs.next()) {
						System.out.printf("%d\t%s\t%d\t%s\n",
								rs.getInt("own_id"),
								rs.getString("user_id"),
								rs.getInt("item_id"),
								rs.getString("own_date"));
					} 
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}// end of try~catch
	}	// end of ownitemList
}	// end of class
