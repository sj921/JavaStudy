package gui;

import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class S15_JScrollPane {
	/*
		JScrollPane에 붙이는 컴포넌트는 스크롤이 가능해진다
	*/
	public static void main(String[] args) {
		JFrame f = new JFrame("ScrollPane Test");
		
		f.setLayout(new GridLayout(2, 2));
		
		for (int i = 0; i < 3; ++i) {
			f.add(new JButton("" + i));
		}
		
		// Panel : 다른 컴포넌트를 붙일 수 있는 컴포넌트 (레이아웃 설정할 수 있음)
		// Pane : 다른 컴포넌트를 붙일 수 있는 컴포넌트 (특이한 기능이 있음)
		JTextArea textarea = new JTextArea();
		JScrollPane scrollablePane = new JScrollPane(textarea);
		
		// JScrollPane에는 컴포넌트를 add 대신 setViewportView() 메서드를 사용한다
		scrollablePane.setViewportView(textarea);
		
		f.add(scrollablePane);
		
		f.setLocation(0, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}










