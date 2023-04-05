package z_gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class S02_BorderLayout {
	/*
		컨테이너에는 레이아웃을 설정할 수 있다
		레이아웃은 컴포넌트를 배치하는 방식을 결정한다
		
		# BorderLayout
		
		- 동서남북과 가운데로 이루어진 레이아웃
		- JFrame의 기본값
	*/
	public static void main(String[] args) {
		JFrame f1 = new JFrame("BorderLayout 입니다");
		
		BorderLayout layout = new BorderLayout();
		
		layout.setVgap(10);	// vetical gap
		layout.setHgap(10);	// horizen gap
				
		f1.setLayout(layout);
		
		// BorderLayout에 컴포넌트 배치하기
		f1.add(new JButton("Button1"), BorderLayout.WEST);
		f1.add(new JButton("Button2"), BorderLayout.EAST);
		f1.add(new JButton("Button3"), BorderLayout.SOUTH);
		f1.add(new JButton("Button4"), BorderLayout.NORTH);
		f1.add(new JButton("Button5"), BorderLayout.CENTER);
		
		// setBounds() : 위치와 프레임의 크기를 한번에 설정
		f1.setBounds(100, 100, 500, 500);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
	}
}
