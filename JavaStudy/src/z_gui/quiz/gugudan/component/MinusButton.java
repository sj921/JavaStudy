package z_gui.quiz.gugudan.component;

import java.awt.Font;
import java.util.List;

import javax.swing.JButton;

import z_gui.quiz.gugudan.event.MinusDanEvent;



public class MinusButton extends JButton {

	public MinusButton (List<GugudanButton> gugudanBtns) {
		setText("-");
		setBounds(0, 500, 250, 50);
		setFont(new Font(null, Font.PLAIN, 35));
		setFocusable(false);
		
		addActionListener(new MinusDanEvent(gugudanBtns));
	}
}
