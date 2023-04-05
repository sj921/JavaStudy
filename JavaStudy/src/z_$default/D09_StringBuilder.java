package z_$default;

public class D09_StringBuilder {

	public static void main(String[] args) {
	
		String str1 = "";
		
		str1 += "a";
		str1 += "p";
		str1 += "p";
		str1 += "l";
		str1 += "e";
		
		System.out.println(str1);
		System.out.println("------------------");
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("a");
		sb1.append("p");
		sb1.append("p");
		sb1.append("l");
		sb1.append("e");
		
		System.out.println(sb1);
		System.out.println("------------------");
		
		
		sb1.insert(2, "banana");
		System.out.println(sb1);
		System.out.println("------------------");
		
		
		sb1.reverse();
		System.out.println(sb1);
		System.out.println("------------------");
		
		
		String substr1 = sb1.substring(0, 5);
		String substr2 = sb1.substring(5, 10);
		
		System.out.println(substr1);
		System.out.println(substr2);
		System.out.println("------------------");

		
		sb1.setLength(9);
		System.out.println(sb1);
		System.out.println("------------------");

		
		sb1.setCharAt(0, 'Z');
		System.out.println(sb1);
		System.out.println("------------------");

		
		sb1.replace(3, 5, "xxxxxxxxxxx");
		System.out.println(sb1);
		System.out.println("------------------");

		
		sb1.delete(3, 10);
		System.out.println(sb1);
		System.out.println("------------------");

		sb1.deleteCharAt(6);
		System.out.println(sb1);
		System.out.println("------------------");

		
		String BuildResult = sb1.toString();
		System.out.println(BuildResult);
		System.out.println("------------------");

		long startTime = System.currentTimeMillis();
		String test1 = "";
		for (int i = 0; i < 100000; ++i) {
			test1 += "a";
			
			if (i % 20 == 19) {
				test1 += "\n";
			}
		}
		System.out.println("실행 시간: " + (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder test2 = new StringBuilder();
		for (int i = 0; i < 100000; ++i) {
			test2.append((char)('a' + i % 26));
			
			if (i % 20 == 19) {
				test2.append("\n");
			}
		}
		System.out.println("실행 시간2: " + (System.currentTimeMillis() - startTime) + "ms");
		// System.out.println(test2);
		
	}
	
}































