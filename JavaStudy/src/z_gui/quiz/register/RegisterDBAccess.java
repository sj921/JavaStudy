package z_gui.quiz.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;

public class RegisterDBAccess {

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String id = "testuser";
	private static String password = "1234";


	// 신규 회원 가입시, 가입정보 입력
	public static void insertMember(Register rg) {

		List<Register> list = new ArrayList<>();
		String sql = "INSERT INTO registerInfo VALUES (?,?,?,?,?,?,?,?,?)";
		
		try {
			Class.forName("driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){		
			conn.setAutoCommit(false);			

			while (rs.next()) {
//				list.add(new Register(rs));
				
				pstmt.setString(1, rg.getUser_id());
				pstmt.setString(2, rg.getUser_pw());
				pstmt.setString(3, rg.getUser_name());
				pstmt.setInt(4, rg.getUser_age());
				pstmt.setString(5, rg.getResident_number());
				pstmt.setString(6, rg.getInterest_field());
				pstmt.setString(7, rg.getSns_consent());
				pstmt.setString(8, rg.getEmail());
				pstmt.setString(9, rg.getPhone_number());
				
				pstmt.executeUpdate();
			}

			Savepoint point1 = conn.setSavepoint("point1");

			conn.rollback(point1); 

			conn.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	// 가입된 회원 로그인시, 가입정보 확인
	public static Register login (String userId, String userPw) {

		try {
			Class.forName("driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String sql = "SELECT * FROM registerInfo WHERE user_id = ?";

		try (
				Connection conn = DriverManager.getConnection(url, id, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			pstmt.setString(1, userId);
			try (ResultSet rs = pstmt.executeQuery()){
				Register user = null;

				if (rs.next()) {
					user = new Register(
							// get 값을 가져오는 것, 얼마나 들어있는지 들여다보기..

							);
				}
				// userId의 사용자가 없어서 조회가 안된 경우 null을 리턴
				if (user == null) {
					return null;
				} else {
					if (user.getUser_pw().equals(userPw)) {
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
}