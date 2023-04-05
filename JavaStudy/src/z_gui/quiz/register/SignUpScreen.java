package z_gui.quiz.register;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUpScreen extends JFrame {

	public SignUpScreen() {
		
		// 상단에 회원가입 화면 제목 띄우기
		JLabel signUp = new JLabel("[ 회원 가입 ]");				
		signUp.setBounds(125, 20, 200, 20);		
		signUp.setHorizontalAlignment(JLabel.CENTER);		
		signUp.setFont(new Font("굴림체", Font.BOLD, 20));
		
		add(signUp);

		// 아이디 입력
		JLabel label_id  = new JLabel ("아이디");
		JTextField tf_id = new JTextField();

		label_id.setBounds(50, 50, 100, 20);
		tf_id.setBounds(140, 50, 180, 20);

		add(label_id);
		add(tf_id);

		tf_id.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력된 ID > " + tf_id.getText());
				tf_id.setText(null);
			}
		});
		
		// 아이디 체크 버튼
		JButton btn_id = new JButton("중복확인");
		btn_id.setBounds(330, 50, 100, 20);	
		add(btn_id);
		
		// 비밀번호 입력
		JLabel label_pw  = new JLabel ("비밀번호");
		JPasswordField pf = new JPasswordField();

		label_pw.setBounds(50, 75, 100, 20);
		pf.setBounds(140, 75, 180, 20);

		add(label_pw);
		add(pf);

		pf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력된 pw : " + 
						new String(pf.getPassword()));
			}
		});
		
		// 비밀번호 확인 입력		
		JLabel label_pw2  = new JLabel ("비밀번호 확인");
		JPasswordField pf2 = new JPasswordField();

		label_pw2.setBounds(50, 100, 100, 20);
		pf2.setBounds(140, 100, 180, 20);

		add(label_pw2);
		add(pf2);

		pf2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인된 pw : " + 
						new String(pf2.getPassword()));
			}
		});
		
		// 나이
		JLabel label_age  = new JLabel ("나이");
		JTextField tf_age = new JTextField();
		JLabel label_age2  = new JLabel ("세");


		label_age.setBounds(50, 125, 100, 20);
		tf_age.setBounds(140, 125, 180, 20);
		label_age2.setBounds(330, 125, 20, 20);


		add(label_age);
		add(label_age2);
		add(tf_age);

		tf_age.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력된 나이 > " + tf_age.getText());
				tf_age.setText(null);
			}
		});
		
		
		
		
		
		// 주민등록번호
		JLabel label_regNum1  = new JLabel ("주민등록번호");
		JTextField tf_regNum1 = new JTextField();
		JLabel label_regNum2  = new JLabel ("-");
		JTextField tf_regNum2 = new JTextField();
		
		label_regNum1.setBounds(50, 150, 100, 20);
		tf_regNum1.setBounds(140, 150, 133, 20);
		label_regNum2.setBounds(285, 150, 20, 20);
		tf_regNum2.setBounds(300, 150, 133, 20);

		add(label_regNum1);
		add(tf_regNum1);
		add(label_regNum2);
		add(tf_regNum2);

		tf_regNum1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력된 주민등록번호 앞자리 > " + tf_regNum1.getText());
				tf_regNum1.setText(null);
			}
		});
		
		tf_regNum2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력된 주민등록번호 뒷자리 > " + tf_regNum2.getText());
				tf_regNum2.setText(null);
			}
		});
			
		
		// 이메일
		JLabel label_email  = new JLabel ("E-mail");
		JTextField tf_email = new JTextField();

		label_email.setBounds(50, 175, 100, 20);
		tf_email.setBounds(140, 175, 180, 20);
		

		add(label_email);
		add(tf_email);

		tf_email.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력된 E-mail > " + tf_email.getText());
				tf_email.setText(null);
			}
		});
		
		// 핸드폰 번호		
		JLabel label_phone = new JLabel ("핸드폰 번호");
		JTextField tf_phone = new JTextField();
				
		label_phone.setBounds(50, 200, 100, 20);
		tf_phone.setBounds(140, 200, 180, 20);

		add(label_phone);
		add(tf_phone);
	
		tf_phone.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력된 핸드폰 번호 > " + tf_phone.getText());
				tf_phone.setText(null);
			}
		});
		
		// SMS수신동의여부
				
		JLabel label_sms  = new JLabel ("SMS수신동의 ");

		label_sms.setBounds(50, 225, 100, 20);
		
		JRadioButton yesBtn = new JRadioButton();
		JRadioButton noBtn = new JRadioButton();

		yesBtn.setText("동의");
		noBtn.setText("비동의");

		yesBtn.setBounds(150, 225, 80, 20);
		noBtn.setBounds(230, 225, 80, 20);
		
		yesBtn.setFocusable(false);
		noBtn.setFocusable(false);
	
		yesBtn.setSelected(true);

		// 버튼 그룹을 설정하면 여러 버튼 중 하나만 선택할 수 있게 된다
		ButtonGroup buttonGroup = new ButtonGroup();

		buttonGroup.add(yesBtn);
		buttonGroup.add(noBtn);

		add(label_sms);
		add(yesBtn);
		add(noBtn);
		
		
		// 관심분야
		JLabel label_interest = new JLabel ("관심분야");
		String interest_field[]= {"education","sport","game","fashion", "living", "economic", "science", "language", "entertainment"};
		
		JComboBox interest = new JComboBox(interest_field); 
		
		label_interest.setBounds(50, 250, 100, 20);
		interest.setBounds(140, 250, 180, 20);

		add(label_interest);
		this.add(interest);
		
		
		// 가입성공버튼
		JButton checkBtn= new JButton("확인");
		JButton reEnterBtn= new JButton("다시입력");
		
		checkBtn.setBounds(100, 400, 100, 20);
		reEnterBtn.setBounds(250, 400, 100, 20);	

		add(checkBtn);
		add(reEnterBtn);
		
		checkBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUpSuccess();
				setVisible(false);
			}
		});

//		reEnterBtn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				setVisible(false);
//			}
//		});
		
		



		
		
		
		// 기본 세팅
		setTitle("Sign up");
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setLocation(100, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
