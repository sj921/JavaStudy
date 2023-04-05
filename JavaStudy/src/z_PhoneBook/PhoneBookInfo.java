package z_PhoneBook;

public class PhoneBookInfo {

	String group;
	String name;
	String number;
	
	public PhoneBookInfo(String group, String number, String name) {
		this.group = group;
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", name, number, group);
	}
	
	
	
}	
	
	
	
	
	
	
	
	
	
	

	
	
	

