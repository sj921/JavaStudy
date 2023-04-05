package gui.quiz;

import java.awt.BorderLayout;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.gugudan.GugudanMainFrame;

public class S03_Gugudan {

	/*
		실행하면 구구단이 출력되는 GUI 프로그램을 만들어보세요
		
		1. 프로그램을 처음 실행하면 구구단 2단이 출력되어 있는 상태로 시작
		
		2. +버튼을 누르면 단이 증가하며 구구단이 바뀐다 (최대 19단까지)
		
		3. -버튼을 누르면 단이 감소하며 구구단이 바뀐다 (최소 2단까지)
	*/
	
	public static void main(String[] args) {
		new GugudanMainFrame();
		
	}
	
	
	
	
	
	
}

//	JButton ggdBtn = new JButton("Gugudan");
//	JButton minusBtn = new JButton("Minus Button");
//	JButton plusBtn = new JButton("Plus Button");
//	
//	public S03_Gugudan() {
//		super("구구단 버튼");
//		
//		// 버튼 추가
//		add(ggdBtn, "Center");
//		add(minusBtn, "West");
//		add(plusBtn, "East");
//		
//		// 버튼 텍스트 설정
////		ggdBtn.setText("2 x 1 = 2");
//		minusBtn.setText("(-)");
//		plusBtn.setText("(+)");
//
//		// 글꼴 설정
//		ggdBtn.setFont(new Font("돋움체", Font.PLAIN, 30));
//		minusBtn.setFont(new Font("돋움체", Font.PLAIN, 30));
//		plusBtn.setFont(new Font("돋움체", Font.PLAIN, 30));
//		
//		
//		// 버튼의 이벤트 설정 (버튼에 액션 리스너 추가)
////		minusBtn.addActionListener(new ActionListener() {
////					
////		});
//		
//		plusBtn.addActionListener(new ActionListener() {
//			int dan = 2;
//			while (dan <= 19) {
//			}
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ggdBtn.setText(dan++ + " ");
//			}
//		});
//		
////		for (int dan = 2; dan <= 19 ; dan++) {
////			System.out.printf("%d단: ", dan);
////			for (int gop = 1; gop <= 9 ; gop++) {
////				System.out.printf("%d x %d = %d\t", dan, gop, dan*gop);
////			}
////			System.out.println();
////		}
//		
//		
//		setVisible(true);
//		setBounds(100, 100, 600, 400);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
//	
//	public static void main(String[] args) {
//
//		new S03_Gugudan();
//		
//	}