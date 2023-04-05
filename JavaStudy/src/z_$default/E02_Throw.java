package z_$default;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class E02_Throw {

	public static void dangerousMethod() 
			throws FileAlreadyExistsException, FileNotFoundException, ClassNotFoundException{
		// throws Exception을 반드시 명시 --> dangerousMethod(); 에서 반드시 예외처리를 해야한다. (호출하는 곳으로 미룸)
		
		switch ((int)(Math.random() * 3)) {
		case 0:
			throw new FileAlreadyExistsException("0이 나와서 발생시킨 예외");
		case 1:
			throw new FileNotFoundException("1이 나와서 발생시킨 예외");
		case 2:
			throw new ClassNotFoundException("2이 나와서 발생시킨 예외");
		}
	}
	
	public  static void main(String[] args) {
		
		try {
			dangerousMethod();
		} catch (FileAlreadyExistsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
}


