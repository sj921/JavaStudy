package z_$default;

import z_myobj.Apple;

public class C04_Constructor {

	public static void main(String[] args) {
		Apple a = new Apple();
		Apple a2 = new Apple(99, 8, "red");
		Apple a3 = new Apple(77, 5);
		
		a.info();
		System.out.println("----------------------");
		a2.info();
		System.out.println("----------------------");
		a3.info();
		System.out.println("----------------------");
	}
	
}
