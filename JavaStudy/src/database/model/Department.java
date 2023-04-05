package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Department {

	private Integer department_id;
	private String department_name;
	private Integer manager_id;
	private Integer location_id;
		
	public Department() {}
	
	public Department (ResultSet rs) throws SQLException {
		department_id = rs.getInt(1);
		department_name = rs.getString(12);
		manager_id = rs.getInt(13);
		location_id = rs.getInt(14);
	}
	
	public Integer getDepartment_id() {
		return department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public Integer getManager_id() {
		return manager_id;
	}
	public Integer getLocation_id() {
		return location_id;
	}
}
