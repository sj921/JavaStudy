package gui.quiz.register.join;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.quiz.register.dao.RegisterDAO;
import gui.quiz.register.model.Member;
import gui.quiz.register.module.PasswordEncryption;

public class JoinFrame extends JFrame {
	
	RegisterDAO register = new RegisterDAO();

	JFrame child = this;
	JFrame parent;
	
	// 아이디, 이름, 나이, 주민등록번호 맨 앞자리까지, 관심분야, SMS수신 동의 여부,	이메일, 핸드폰 번호
	JTextField id_field = new JTextField("abc123") {
		{
			setBounds(50, 50, 200, 30);
		}
	};
	JPasswordField pw_field = new JPasswordField("1234") {
		{
			setBounds(50, 500, 200, 30);
		}
	};
	
	
	JTextField name_field = new JTextField("김말이") {
		{
			setBounds(50, 100, 200, 30);
		}
	};
	JTextField age_field = new JTextField("23") {
		{
			setBounds(50, 150, 200, 30);
		}
	};
	JTextField social_number_field = new JTextField("881111-1") {
		{
			setBounds(50, 200, 200, 30);
		}
	};
	
	JCheckBox soccer = new JCheckBox("축구") {
		{
			 setBounds(50, 250, 50, 30);
		}
	};
	
	JCheckBox basketball = new JCheckBox("농구") {
		{
			setBounds(100, 250, 50, 30);
		}
	};
	JCheckBox movie = new JCheckBox("영화") {
		{
			setBounds(150, 250, 50, 30);
		}
	};
	JCheckBox drama = new JCheckBox("드라마") {
		{
			setBounds(200, 250, 65, 30);
		}
	};
	JCheckBox bike = new JCheckBox("자전거") {
		{
			setBounds(265, 250, 65, 30);
		}
	};
	
	List<JCheckBox> interest_fields = new ArrayList<>() {
		{
			add(soccer);
			add(basketball);
			add(movie);
			add(drama);
			add(bike);
		}
	};
	
	JCheckBox sms_box = new JCheckBox("~에 동의합니다.") {
		{
			setBounds(50, 300, 200, 30);
		}
	};
	
	JTextField email_field = new JTextField("email@abc.com") {
		{
			setBounds(50, 350, 200, 30);
		}
	};
	
	JTextField phone_field = new JTextField("12312341234") {
		{
			setBounds(50, 400, 200, 30);
		}
	};
	
	JButton join_button = new JButton("가입하기") {
		{
			setBounds(50, 450, 120, 30);
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 입력값 검증
					if (!fieldValidate()) {
						return;
					}
					// DB에 회원 정보 쓰기
					Member mem = new Member();
					
					mem.setMem_id(id_field.getText());
					mem.setEmail(email_field.getText());
					mem.setPhone_number(phone_field.getText());
					mem.setMem_name(name_field.getText());
					mem.setAge(Integer.parseInt(age_field.getText()));
					mem.setSms(sms_box.isSelected());
					
					
					
					// "881111-1"
					char ch = social_number_field.getText().charAt(7);
					
					if (ch == '1' || ch == '3') {
						mem.setGender("남");
					} else {
						mem.setGender("여");
					}
					
					
					int birth = Integer.parseInt(social_number_field.
							 getText().substring(0, 6));
					
					
					// java.sql.Date.valueOf(LocalDate) 기능 활용
					// 해당 메서드로 리턴되는 타입은 java.sql.Date이지만
					// java.sql.Date는 java.util.Date의 자식임 (어캐스팅)
					mem.setBirthday(java.sql.Date.valueOf(LocalDate.of(
							(ch <= '2' ?  1900 : 2000) + birth / 10000,
							birth % 10000 / 100,
							birth % 100
					)));
				
					List<String> interestes = new ArrayList<>();
					
					for (JCheckBox intereste_field : interest_fields) {
						if (intereste_field.isSelected()) {
							interestes.add(intereste_field.getName());
						}
					}
					
					// 1개 또는 2개만 선택했을 때 null 채워서 3개 만들기
					while (interestes.size() != 3) {
						interestes.add(null);
					}
					
					mem.setInterest1(interestes.get(0));
					mem.setInterest2(interestes.get(1));
					mem.setInterest3(interestes.get(2));
					
					String encryted_password = 
							PasswordEncryption.encrypt(pw_field.getPassword());
//					System.out.println("encrypted : " + encryted_password);
					
					mem.setPassword(encryted_password);
					
					register.registerMember(mem);
					
				}
			});
		}
	};
	
	JButton cancel_button = new JButton("취소") {
		{
			setBounds(200, 450, 120, 30);
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					parent.setVisible(true);
					child.setVisible(false);
				}
			});
					
		}
	};
	
	
	public JoinFrame (JFrame parent) {
		this.parent = parent;
		
		add(id_field);
		add(name_field);
		add(age_field);
		add(social_number_field);
		add(sms_box);
		add(email_field);
		add(phone_field);
		add(join_button);
		add(cancel_button);
		add(pw_field);
		
		for (JCheckBox interest_field : interest_fields) {
			add(interest_field);
		}
		
		setLayout(null);
		setLocation(700, 20);
		setSize(400, 700);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		// setVisible(true);
	}
	
	public void open() {
		setVisible(true);
		parent.setVisible(false); // 해당 프레임을 숨기는 메서드
	}
	
	
	public boolean fieldValidate() {
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
