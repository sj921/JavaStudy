package z_gui.quiz.register;

public class Register {
	private String user_id;
	private String user_pw;
	private String user_name;
	private Integer user_age;
	private String resident_number;
	private String interest_field;
	private String sns_consent;
	private String email;
	private String phone_number;
	
	
	public Register() {}
	
	public Register (String user_id, String user_pw, String user_name, Integer user_age,
			String resident_number, String interest_field, String sns_consent, 
			String email, String phone_number) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_age = user_age;
		this.resident_number = resident_number;
		this.interest_field = interest_field;
		this.sns_consent = sns_consent;
		this.email = email;
		this.phone_number = phone_number;
	}
		
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Integer getUser_age() {
		return user_age;
	}
	public void setUser_age(Integer user_age) {
		this.user_age = user_age;
	}
	public String getResident_number() {
		return resident_number;
	}
	public void setResident_number(String resident_number) {
		this.resident_number = resident_number;
	}
	public String getInterest_field() {
		return interest_field;
	}
	public void setInterest_field(String interest_field) {
		this.interest_field = interest_field;
	}
	public String getSns_consent() {
		return sns_consent;
	}
	public void setSns_consent(String sns_consent) {
		this.sns_consent = sns_consent;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
		
}



