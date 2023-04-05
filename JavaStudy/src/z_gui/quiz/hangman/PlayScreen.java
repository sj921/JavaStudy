package z_gui.quiz.hangman;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlayScreen extends JFrame{

	public PlayScreen() {
		// 화면에 로그인 성공 문구 띄우기
		JLabel login = new JLabel("Game Start");				
		login.setBounds(140, 200, 200, 30);		
		login.setHorizontalAlignment(JLabel.CENTER);		
		login.setFont(new Font("굴림체", Font.BOLD, 15));

		add(login);
		
		setTitle("Save the hangman");
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
