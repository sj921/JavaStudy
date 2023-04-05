package z_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_JButton extends JFrame {
	
	JButton mainBtn = new JButton("Main");
	JButton subBtn = new JButton("Sub Button");
	
	public S03_JButton() {
		super("JButton 테스트");	// JFrame의 생성자
		
		add(mainBtn, "Center");
		add(subBtn, "South");
		
		// 버튼 텍스트 설정
		mainBtn.setText("안녕하세요!");
		
		// 글꼴 설정
		mainBtn.setFont(new Font("궁서체", Font.BOLD, 55));
		mainBtn.setFont(new Font("굴림체", Font.PLAIN, 30));
		
		// 버튼의 글씨 색 변경
		subBtn.setForeground(Color.RED);
		
		// 버튼의 배경 색 변경
		subBtn.setBackground(new Color(31, 236, 255));	// RGB값 적용

		// 버튼의 이벤트 설정 (버튼에 액션 리스너 추가)
		subBtn.addActionListener(new ActionListener() {	
			int num = 1;	// 인스턴스의 변수
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼이 눌렸을 때의 동작을 설정할 수 있음
				System.out.println("Hello, Button Event!!");
				mainBtn.setText("<html>" + num++ + "번째 <br> 눌림</html>");
			}
		});

		
		setVisible(true);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		// super.EXIT_ON_CLOSE에서 나 자신에게 사용하는 것처럼 super를 생략하고 사용할 수 있다
	}

}






/*
		Attribute : 속성
		
	
		family : 글꼴
		weight : 글씨 무게 (굵기)
		width : 너비
		size : 크기
		transform : 방향 회전
		superscript :  ?
		char_replacement : 
		foreground : 글씨색
		background : 배경색
		underline : 밑줄
		strikethrough : 줄긋기
		run_direction :
		bidi_embedding :
		justification : 정렬
		input method highlight :
		input method underline : 
		swap_color :
		numeric_shaping :
		kerning : 
		ligatures : 
		tracking : 
		
		--> 필요하면 구글링해서 찾아서 쓰기

		
		
		HashMap<TextAttribute, Object> attributeMap = new HashMap<>();
			
		attributeMap.put(TextAttribute.FONT, "굴림체");
		attributeMap.put(TextAttribute.SIZE, 30);		
		attributeMap.put(TextAttribute.STRIKETHROUGH, true);
		attributeMap.put(TextAttribute.TRANSFORM, true);
		attributeMap.put(TextAttribute.FOREGROUND, "Red");
		
		
		subBtn.setFont(new Font(attributeMap));
		
		Attribute[] attrs = new Font(null, 0, 0).getAvailableAttributes();
		System.out.println(Arrays.toString(attrs));
*/










