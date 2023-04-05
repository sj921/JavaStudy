package quiz;

import school.Student;

public class C12_School {

	/*
	
		1. 프로그래밍 반 학생들은 각자의
		   국어, 영어, 수학, 프로그래밍 언어, 운영체제, 자료구조 점수가 있다
		   
		2. 네트워크 반 학생들은 각자의
		   국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다
		   
		3. 머신러닝 반 학생들은 각자의
		   국어, 영어, 수학, 통계학, 프로그래밍 언어, NO-SQL 점수가 있다
		   
		4. 100명의 학생을 랜덤으로 생성한다
		   모든 학생의 소속 반, 과목별 점수, 이름이 랜덤으로 생성되어야 하고,
		   학생들의 학번은 중복없이 순차적으로 생성되어야 한다
		   
		5. 성적표 출력 메서드를 통해 각 학생의 
		   [이름/과목별 점수/총점/평균/등급]을 볼 수 있다
	*/

	public static void main(String[] args) {
		
		Student[] students = new Student[100];
		
		for (int i = 0; i < students.length; ++i) {
			students[i] = new Student();
			students[i].printScore();
		}
		
		
		
	}
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	// 소속 반
//	public static String[] className() {
//		String[] className = {"프로그래밍반", "네트워크반", "머신러닝반"};
//		
//		Random ran = new Random();
//		
//		for (int i = 0; i < 3; ++i) {
//			
//		}
//		
//		return className;
//		
//	}
//	
//	// 점수
//	public static int[] score() {
//		int[] score = new int[100];
//		for(int i = 0; i < score.length; ++i) {
//			score[i] = (int)(Math.random() * 101);
//		}
//		for(int i = 0; i < score.length; ++i) {
//			System.out.printf("[학생%03d]: %-3d \n", i + 1, score[i]);
//		}
//				
//		return score;
//	}
//	
//	// 이름
//	public static String[] studentName() {
//		String[] studentName = new String[100];
//		
//		String[][] nameArr = {
//			{'김', '이', '박', '최', '정', '강', '조', '윤', '장', '임', '노', '서', '전', '한'};	
//			
//		}; 
//			
////				서하이지아하나수유채소로태재주예연가해 
////				아윤서안아린은우하나율원현인리민영진연
//		
//		Random ran = new Random();
//		
//		for (int i = 0; i < 3;++i) {
//		
//		}
//				
//		return studentName;
//		
//	}
//	
//	// 학번
//	public static int[] studentId() {
//		int[] studentId = new int[100];
//		
//		Random ran = new Random();
//		
//		for (int i = 0; i < 6; ++i) {
//			char ch = (char)(ran.nextInt(10) + '0');
//			System.out.print(ch);
//		}
//		
//		return studentId;
//		
//	}
//
//	
//	
//	public static void main(String[] args) {
//		System.out.println(Arrays.toString(className())
//						+ Arrays.toString(score())
//						+ Arrays.toString(studentName())
//						+ Arrays.toString(studentId()));
//		
//	}
//	
//	
//
//	
//	
//}
