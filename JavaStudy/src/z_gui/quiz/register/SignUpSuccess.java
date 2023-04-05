package z_gui.quiz.register;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SignUpSuccess extends JFrame{

	public SignUpSuccess() {
		// 화면에 가입 성공 문구 띄우기
		JLabel login = new JLabel("회원 가입에 성공하였습니다");				
		login.setBounds(100, 200, 300, 30);		
		login.setHorizontalAlignment(JLabel.CENTER);		
		login.setFont(new Font("굴림체", Font.BOLD, 15));

		add(login);
		
		// 기본 세팅
		setTitle("Sign up Success");
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setLocation(100, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
