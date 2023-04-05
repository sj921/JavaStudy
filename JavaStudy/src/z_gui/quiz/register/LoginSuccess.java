package z_gui.quiz.register;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginSuccess extends JFrame{

	public LoginSuccess() {
		// 화면에 로그인 성공 문구 띄우기
		JLabel login = new JLabel("로그인에 성공하였습니다");				
		login.setBounds(140, 200, 200, 30);		
		login.setHorizontalAlignment(JLabel.CENTER);		
		login.setFont(new Font("굴림체", Font.BOLD, 15));

		add(login);
		
		// 기본 세팅
		setTitle("Login Success");
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setLocation(100, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
