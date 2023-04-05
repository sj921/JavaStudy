package PhoneBook;

public class PhoneBookInfo {

	String group;
	String name;
	String phoneNumber;
		
	public PhoneBookInfo(String group, String phoneNumber, String name) {
		this.group = group;
		this.phoneNumber = phoneNumber;
		this.name = name;
	}
		
	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", name, phoneNumber, group);
	}
	




	
	
	
}	
	
	
	
	
	
	
	
	
	
	

	
	
	

