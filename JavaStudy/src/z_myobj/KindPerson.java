package z_myobj;

public class KindPerson extends Person {

//	String name ;		// --> 값이 비워져 있으므로 부모의 값이 먼저 산출됨
	String name = "동용";
	
	// 상속받은 클래스는 부모의 생성자를 가장 먼저 호출해야 한다
	public KindPerson(String name, int age) {
		super(name, age); // super class의 생성자, 부모의 생성자로 제일 먼저 보냄
	}
	
	// 부모 클래스에 이미 존재하던 기능을 자식 클래스에서 수정하여 사용할 수 있다
	// (오버라이드)
	@Override
	public void sayHi() {
		String name = "인재";		
		// 그냥 name --> 인재, this.name --> 동용, super.name --> 범수
		
		System.out.printf("안녕하십니까. 제 이름은 %s입니다." + "나이는 %d살 입니다. 잘 부탁드립니다.\n", name, age);
	}
	

	
	
	// 부모 클래스에는 없던 새로운 기능
	public void sayMyName() {
		System.out.println("그냥 name: " + name);
		System.out.println("this.name: " + this.name);
		System.out.println("super.name: " + super.name);
	}
	
	public void sayThanks(String target) {
		System.out.printf("%s씨 감사합니다.\n", target);
	}
	
	
	
	
	
}
