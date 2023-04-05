package z_database.quiz.datamodel;


// data model : 데이터의 형태를 구현한 클래스 (데이터를 담아놓는 용도로 사용)

// 데이터를 담는 것은 생성자에서 진행


// 데이터는 구경할 수 있게 get만 만들어놓는다 (수정이 불가능)	
// 우클릭 - Source - Generate Getters and Setters - getters는 생성하면 읽기만 가능

// data model : 데이터의 형태를 구현한 클래스 (데이터를 담아놓는 용도로 사용)
public class GameUser2 {
	private Integer user_num;
	private String user_id;
	private String user_pw;
	private Integer gold;
	
	// 데이터를 담는 것은 생성자에서 진행
	public GameUser2 (Integer user_num, String user_id, String user_pw, Integer gold) {
		 this.user_num = user_num;
		 this.user_id = user_id;
		 this.user_pw = user_pw;
		 this.gold = gold;
	}

	// 데이터는 구경할 수 있게 get만 만들어놓는다 (수정이 불가능)
	public Integer getUser_num() {
		return user_num;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public Integer getGold() {
		return gold;
	}
	
	public void setGold (Integer gold) {
		this.gold = gold;
	}

	@Override
	public String toString() {
		return String.format("[%d, %s, %dgold]", user_num, user_id, gold);
	}

}











