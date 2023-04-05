package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.OjdbcConnection;
import database.model.EmployeeAndDepartment;

public class J05_JoinEmployees {
	/*
		employees와 departments를 조인한 결과를 조회하여 데이터 모델에 담아 모두 출력해보세요
	*/
	public static void main(String[] args) {
	
		List<EmployeeAndDepartment> list = new ArrayList<>();
		String query = "SELECT * FROM employees INNER JOIN departments USING (department_id)";
		
		try (
			Connection conn = OjdbcConnection.getConnection();	
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
		){
//			ResultSetMetaData meta = rs.getMetaData();
//			
//			for (int i = 1; i <= meta.getColumnCount(); ++i) {
//				System.out.println(meta.getColumnName(i).toLowerCase());
//			}
			while (rs.next()) {
				list.add(new EmployeeAndDepartment(rs));
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
	}
}

	
