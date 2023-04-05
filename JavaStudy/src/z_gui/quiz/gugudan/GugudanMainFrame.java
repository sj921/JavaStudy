package z_gui.quiz.gugudan;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.gugudan.component.GugudanButton;
import gui.quiz.gugudan.component.MinusButton;
import gui.quiz.gugudan.component.PlusButton;

public class GugudanMainFrame extends JFrame {

	// 리스트로 여러개의 같은 종류의 버튼 관리하기
	List<GugudanButton> gugudanBtns = new ArrayList<>();
	{
		for (int i = 1; i <= 9; ++i) {
			gugudanBtns.add(new GugudanButton(i));
		}
	}
	
	JButton plusBtn = new PlusButton(gugudanBtns);
	JButton minusBtn = new MinusButton(gugudanBtns);
	
	public GugudanMainFrame() {
		super("구구단");
		
		for (JButton gugudanBtn : gugudanBtns) {
			add(gugudanBtn);
		}
		
		add(plusBtn);
		add(minusBtn);
		
		// BorderLayout이 설정되어 있으면 원하는 대로 배치할 수 없으므로 레이아웃 해제
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 590);
		setVisible(true);
		
	}

}
