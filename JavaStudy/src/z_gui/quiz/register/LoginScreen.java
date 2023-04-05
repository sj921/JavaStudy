package z_gui.quiz.register;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends JFrame {

	public LoginScreen() {
				
		// 상단에 로그인 화면 제목 띄우기
		JLabel login = new JLabel("로그인 화면");				
		login.setBounds(50, 200, 200, 30);		
		login.setHorizontalAlignment(JLabel.CENTER);		
		login.setFont(new Font("바탕체", Font.BOLD, 40));
		
		// 아이디 입력창
		JLabel label_id  = new JLabel ("ID");
		JTextField tf = new JTextField();

		label_id.setBounds(120, 100, 80, 30);
		tf.setBounds(200, 100, 150, 30);

		add(label_id);
		add(tf);
		
		// 텍스트 필드에서 엔터키를 누르면 액션 이벤트 발생
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력된 ID > " + tf.getText());
				tf.setText(null);
			}
		});
		
		// 비밀번호 입력창		
		JLabel label_pw  = new JLabel ("Password");
		JPasswordField pf = new JPasswordField();

		label_pw.setBounds(120, 150, 80, 30);
		pf.setBounds(200, 150, 150, 30);

		add(label_pw);
		add(pf);

		pf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력된 PW : " + 
						new String(pf.getPassword()));
			}
		});
		
		// 회원가입과 로그인 버튼 만들기
		JButton signupBtn= new JButton("회원가입");
		JButton loginBtn= new JButton("로그인");
		
		signupBtn.setLocation(120, 250);
		signupBtn.setSize(100, 50);

		loginBtn.setLocation(250, 250);	
		loginBtn.setSize(100, 50);
		
		signupBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUpScreen();
				setVisible(false);
			}
		});
		
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginSuccess();
				setVisible(false);
			}
		});
		
		

		add(signupBtn);
		add(loginBtn);
		

		// 기본 세팅
		setTitle("Login");
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setLocation(100, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
