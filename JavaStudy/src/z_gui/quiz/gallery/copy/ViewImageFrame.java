package z_gui.quiz.gallery.copy;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewImageFrame extends JFrame {
	JFrame vf = this;
	JLabel imageLabel = new JLabel();
	JButton closeButton = new JButton("close");
	
	public ViewImageFrame() {
		setLayout(new BorderLayout());
		setSize(500, 500);
		setLocation(0, 100);
		setUndecorated(true);
		
		add(imageLabel, "Center");
		add(closeButton, "South");
		
		closeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vf.setVisible(false);
			}
		});
	}
	
	public void setImageLabel(File file) {
		try {
			imageLabel.setIcon(ImageIconTools.getScaledImageIcon(file, 500, 500));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}














