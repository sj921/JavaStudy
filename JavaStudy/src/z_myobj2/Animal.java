package z_myobj2;

// abstract - 나중에 자식이 구현할 예정임 (인스턴스화 할 수 없음)
// public abstract , abstract public (둘 다 가능!!)
public abstract class Animal {

	String name;
	
	public String getName() {
		return name;
	}
	
	// 나중에 자식이 구현할 예정인 메서드
	public abstract void bite();
	
	
	
	
	
	
}
