package myobj;

public class Grade {

	public int kor;
	public int eng;
	public int math;
	
	public Grade (int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.kor == ((Grade)obj).kor
				&& this.eng == ((Grade)obj).eng
				&& this.math == ((Grade)obj).math;
		// obj.kor이 안 찍히는 이유? -> 업 캐스팅
		// 다운 캐스팅해서 비교해야 함.
	}
	
	
}
