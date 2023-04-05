package database.quiz.dataaccess;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.quiz.datamodel.GameUser;

public class DatabaseAccess {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String id = "testuser";
	private static String password = "1234";
	
	private static List<Integer> boxItems = new ArrayList<>();
	// List<item> 이 맞다...???
	
	
	// 드라이버 호출은 프로그램 실행 시 최초 1번이면 충분하다
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 최초의 DB Access 발생시 아이템 뽑기 배열 생성
		try (
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = conn.prepareStatement(
					"SELECT * FROM item");
			ResultSet rs = pstmt.executeQuery();
					
		){
			while (rs.next()) {
				// 확률만큼 뽑기 배열에 추가하여 확률 생성
				int prob = Math.round(rs.getFloat("probability") * 100); 
				
				for (int i = 0; i < prob; ++i) {
					boxItems.add(rs.getInt("item_id"));
				}
			}
			Collections.shuffle(boxItems);		
			
			System.out.println(boxItems);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void openBox(GameUser user) {
		int gold = user.getGold();
		
		if (gold < 1000) {
			System.out.println("소지금이 부족합니다...");
			return;
		}
		
		// 1. DB의 소지금을 감소하고
		// 2. 아이템 목록에 추가하고
		String reduceGold = "UPDATE gameuser SET gold = gold - 1000 WHERE user_num = ?";
		String addownItem = "INSERT INTO ownitem VALUES" 
		+ "(ownitem_seq.nextval,?,?,sysdate)";
		String getItem = "SELECT * FROM item WHERE item_id = ?";
				
		try (
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt1 = conn.prepareStatement(reduceGold);
			PreparedStatement pstmt2 = conn.prepareStatement(addownItem);
			PreparedStatement pstmt3 = conn.prepareStatement(getItem);
		){
			// 확률대로 뽑은 아이템의 번호
			int item_id = boxItems.get((int)(Math.random() * boxItems.size()));
			
			// ? 채우기 (값을 설정하고 저장하는 것은 set...)
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
			
			System.out.printf("[%s]님이 [%s]를 뽑으셨습니다.\n", 
					user.getUser_id(), rs.getString("item_name"));

			user.setGold(gold - 1000);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static GameUser login (String userId, String userPassword) {
		String sql = "SELECT * FROM gameuser WHERE user_id = ?";
		
		try (
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)
		) {
			pstmt.setString(1, userId);
			try (ResultSet rs = pstmt.executeQuery()){
				GameUser user = null;
				
				if (rs.next()) {
					user = new GameUser(
							// get 값을 가져오는 것, 얼마나 들어있는지 들여다보기..
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
					if (user.getUser_password().equals(userPassword)) {
						// 비밀 번호 맞춰서 로그인에 성공하는 경우 정보를 리턴
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
		}
	}
	
	public static void ownitemList (String userId, String userPassword) {
		// 	join해서 아이템 이름까지
			
		GameUser user = new GameUser(null, userId, null, null);
		String sql = "SELECT * FROM OwnItem INNER JOIN Item USING (item_id) WHERE user_id = ? ";
		
		
		try (
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				pstmt.setString(1, userId); 
				try (
					ResultSet rs = pstmt.executeQuery();
				){
										
					System.out.printf("[%s]님이 소지한 아이템 목록▽\n", userId);
					while (rs.next()) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\n",
							rs.getInt("own_id"),
							rs.getString("item_name"),
							rs.getString("user_id"),
							rs.getInt("item_id"),
							rs.getString("own_date"));
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}// end of try~catch
	}	// end of ownitemList
	
}
