package z_quiz;

public class B08_Pal2 {

	public static void main(String[] args) {
	
		
		String example = "apple";
		
		String reversed = "";
		for (int i = 4; i >= 0; --i) {
			// System.out.println(i + " ");
			// int i = example.length() - 1;
			reversed += example.charAt(i);
		}
		
		System.out.println("원래 문자열: " + example);
		System.out.println("뒤집은 문자열: " + reversed);
		System.out.println("좌우대칭이니? " + example.equals(reversed));
			
	}

}
