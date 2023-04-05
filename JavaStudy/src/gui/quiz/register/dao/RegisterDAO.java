package gui.quiz.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import gui.quiz.register.model.Member;

// 회원가입 관련 작업으로 인한 DB 접근에 대한 코드를 모아놓은 곳
public class RegisterDAO {
	
	public boolean checkDuplicateEmail(String email) {
		return true;
	}
	
	public boolean checkDuplicateID(String id) {
		String sql = "SELECT count(*) FROM member WHERE mem_id = ?";
		
		int count = 1;
		
		if(count > 0) {
			System.out.println("중복 아이디 입니다!");
			return true;
		} else {
			System.out.println("중복 아이디가 아니므로 사용할 수 있습니다!");
			return false;
		}
		
		// 1이면 중복이므로 true, 0이면 중복이 아니므로 false
//		return count > 0;
	}

	public int registerMember (Member m) {
		
		String sql = "INSERT INTO member VALUES(?,?,?,?,?,?,?,?)";
		
		try (
			Connection conn = DBConnection.getConnection();	
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, m.getMem_id());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getMem_name());
			pstmt.setString(4, m.getEmail());
			pstmt.setString(5, m.getPhone_number());
			pstmt.setInt(6, m.getAge());
			pstmt.setDate(7, (java.sql.Date) m.getBirthday());
			pstmt.setString(8, m.getGender());
			pstmt.setString(9, m.getInterest1());
			pstmt.setString(10, m.getInterest2());
			pstmt.setString(11, m.getInterest3());
			
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			return -1;
		}
		

	}
	
	
}
