package z_$default;

public class E01_Exception {
	/*
		# 예외 (Exception)
		
		- 우리가 예외라고 생각했던 빨간 글씨들을 예외라고 부른다
		- 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러라고 부른다 (자바 문법 오류)
		- 프로그래머는 발생할 수 있는 예외를 미리 예상하여 대비해둘 수 있다 (예외 처리)
		- 예외 발생 시, 프로그램의 기본 동작은 강제 종료이다
		
		# 예외 처리 (try-catch-finally)
		
		- 예외가 발생할 가능성이 있는 부분을 try문 내부에 포함시킨다
		- try문 내부에서 예외가 발생하지 않으면 평소대로 정상 실행한다
		- try문 내부에서 예외가 발생하는 경우 즉시 try문의 실행을 중단시키고
		  발생한 예외에 해당하는 catch문으로 이동한다
		- 예외가 발생하여 catch문에 도착할 때 예외 발생에 관한 정보를 담고있는 인스턴스가 함께 전달된다
		- catch문은 여러번 사용할 수 있다
		- 모든 예외의 부모 클래스인 Exception 클래스를 사용하면 모든 예외를 한번에 처리할 수 있다
		
		# finally
		
		- 예외가 발생하던 안하던 무조건 실행해야하는 코드를 작성하는 곳
	*/
	public static void finallyTest() {
		int[] nums = new int[10];
		
		try {
			nums[(int)(Math.random() * 20)] = 5;
			System.out.println("정상 실행");
		} catch (Exception e) {
			System.out.println("캐치 발생, 메서드 중단");
			return;
		} finally {
			// 메서드가 정상일 때도 실행되지만, 메서드가 강제 종료되더라도 무조건 실행된다
			System.out.println(" /)/)");
			System.out.println("( . .)");
			System.out.println("(  >☆");
		}
		
		System.out.println("정상 실행인 경우 계속되는 코드들...");
		
	}
	
	public static void main(String[] args) {
		finallyTest();
		
		
		System.out.println("--------------------------------------");
		
		int[] nums = new int[10];
		
		try {
			nums[(int)(Math.random() * 11)] = 3;
			System.out.println(19 / (int)(Math.random() * 3));
		} catch (Exception e) {
			System.out.println("이유: " + e.getMessage());
			System.out.println("이유를 알았으니 정상진행 하겠습니다~");
		} finally {
			System.out.println(" /)/)");
			System.out.println("( . .)");
			System.out.println("(  >☆");
			System.out.println("Finally");
		}
		
		System.out.println("프로그램이 정상 종료되었습니다.");
		
	}
	
}
