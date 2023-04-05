package z_signup;

/*
DAO ( Data Access Object) : 데이터 접근 객체 ,  DB처리 클래스 ( DB연결, Select, update, insert, delete )

이름 규칙 : 테이블명DAO , 테이블명DTO
CRUD : Create;insert , Read;Select, Update, delete
*/

public class MemberDAO {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String USER = "testuser2";
	private static final String PASS = "1234";

	public MemberDAO() {}
	
	
}
