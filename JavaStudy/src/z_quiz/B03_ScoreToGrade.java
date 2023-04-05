package z_quiz;

import java.awt.print.Printable;
import java.util.Scanner;

public class B03_ScoreToGrade {

	/*
		국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에 
		각 과목 점수, 평균 점수, 등급을 출력해주는 프로그램을 만들어보세요

			1.	90점 이상 A
				80점 이상 B
				70점 이상 C
				60점 이상 D
				그 외 F

			2. 유효한 점수는 0 ~ 100점이다. (유효하지 않은 점수가 하나라도 있다면 F)

			3. 평균 점수는 소수 둘째 자리에서 반올림하여 저장

	 */


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int kor, eng, math;
		double avg;

		System.out.print("국어, 영어, 수학 점수를 입력 >> ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();		
		
		avg = Math.round((kor + eng + math) / (double)3.0 * 100) / 100.0; 
	
		System.out.print("평균은 : " + avg);

		char grade;

		if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || math < 0 || math > 100) {
			System.out.println("유효하지 않은 점수가 있습니다.");
			grade = 'F';
		} else if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
				
		System.out.printf("국어 %d, 영어 %d, 수학 %d, 평균 %.2f, 등급 %c\n", kor, eng, math, avg, grade);

	}

}



//	Scanner sc = new Scanner(System.in);
//
//	System.out.print("국어, 영어, 수학 점수를 입력 >> ");
//
//	int korean, english, mathmatics;
//	korean = sc.nextInt();
//	english = sc.nextInt();
//	mathmatics = sc.nextInt();		
//
//	System.out.printf("국어는 %d점, 영어는 %d점, 수학은 %d점 입니다 \n", korean, english, mathmatics);
//
//	int score = korean + english + mathmatics;
//
//	double average;
//	average = score / 3.0;
//
//	System.out.println("평균은 : " + (Math.round(average * 100) / 100.0) + "점");
//
//	char grade;
//
//	if (average < 0 || average > 100) {         // --> 각 과목별로 하나라도 0점 미만이거나 100점 초과하면 X
//	grade = 0;									// --> 위에 해당하면 grade = 'F'
//	} else if (average >= 90 && average <= 100){
//	grade = 'A';
//	} else if (average >= 80 && average < 90) {
//	grade = 'B';
//	} else if (average >= 70 && average < 80) {
//	grade = 'C';
//	} else if (average >= 60 && average < 70) {
//	grade = 'D';
//	} else {
//	grade = 'F';
//	}	
//
//	System.out.printf("등급은 %c등급 입니다. \n", grade);