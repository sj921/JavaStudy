package z_gui.quiz.hangman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import gui.quiz.gallery.ThumbnailButton;
import gui.quiz.gallery.ViewImageFrame;

public class PlayFrame extends JFrame {

	public PlayFrame() {
		// 이미지 삽입
	
		
		
		
		// 플레이어 입력창
		JTextField tf = new JTextField("");

		tf.setBounds(100, 300, 300, 30);

		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You > " + tf.getText());
				tf.setText(null);
			}
		});

		add(tf);

		setLocation(0, 100);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	public static void main(String[] args) {
		new PlayFrame();
	}


}
