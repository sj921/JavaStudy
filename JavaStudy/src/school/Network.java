package school;

public class Network extends Subject{

	int kor;
	int eng;
	int linux;
	int network;
	int CCNA;
	
	public Network() {
		kor = ran.nextInt(101);
		eng = ran.nextInt(101);
		linux = ran.nextInt(101);
		network = ran.nextInt(101);
		CCNA = ran.nextInt(101);
	}
	
	public Network(int kor, int eng, int linux, int network, int CCNA) {
		this.kor = kor;
		this.eng = eng;
		this.linux = linux;
		this.network = network;
		this.CCNA = CCNA;
	}
	
	
	@Override
	public int getTotal() {
		return kor + eng + linux + network + CCNA;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 5.0;
	}
	
	@Override
	public char getGrade() {
		double avg = getAvg();
		if (avg >= 90) {
			return 'A';
		} else if (avg >= 80) {
			return 'B';
		} else if (avg >= 70) {
			return 'C';
		} else if (avg >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
//	국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다
	
	@Override
	public String[] getSubjectNames() {
		return new String[] {"국어", "영어", "리눅스", "네트워크", "CCNA"};
	}
	
	@Override
	public int[] getSubjectScores() {
		return new int[] {kor, eng, linux, network, CCNA};
	}
	
}
