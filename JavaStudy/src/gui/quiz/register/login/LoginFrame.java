package gui.quiz.register.login;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.quiz.register.join.JoinFrame;

public class LoginFrame extends JFrame{
	// 객체 나누기 힘들거나.. 양이 적거나 하면 때려박아...?
	
	JoinFrame joinFrame = new JoinFrame(this);
	
	JLabel loginLabel = new JLabel() {
		{
			setText("아이디");
			setLocation(80, 80);
			setSize(100, 30);
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
	
	JPasswordField passwordField = new JPasswordField() {
		{
			setLocation(150, 120);
			setSize(150, 30);
			setColumns(30);
		}
	};
	
	JButton loginButton = new JButton() {
		{
			setText("로그인");
			setLocation(80, 160);
			setSize(105, 30);
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("로그인 버튼이 눌렸음.");
				}
			});
		}
	};
	
	JButton joinButton = new JButton() {
		{
			setText("회원가입");
			setLocation(195, 160);
			setSize(105, 30);
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					joinFrame.open();
				}
			});
		}
	};
	
	public LoginFrame () {
		
		add(loginLabel);
		add(passwordLabel);
		add(loginTextField);
		add(passwordField);
		add(loginButton);
		add(joinButton);
		
		setTitle("Login My Service");
		setResizable(false);
		setLayout(null);
		setSize(400, 300);
		setLocation(300, 20);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LoginFrame();
	}
	
}






