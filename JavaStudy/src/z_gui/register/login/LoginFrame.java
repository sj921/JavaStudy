package z_gui.register.login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.quiz.register.join.JoinFrame;

public class LoginFrame extends JFrame {
	
	JoinFrame joinFrame = new JoinFrame(this);
	
	JLabel loginLabel = new JLabel() {
		{
			setText("아이디");
			setLocation(80, 80);
			setSize(100, 300);
		}
	};
	
	JLabel passwordLabel = new JLabel() {
		{
			setText("비밀번호");
			setLocation(80, 120);
			setSize(100, 30);
		}
	};
	
	JTextField loginTextField = new JTextField() {
		{
			setLocation(150, 80);
			setSize(150, 30);
			setColumns(30);
		}
	};
	
//	JPasswordField passwordField
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






