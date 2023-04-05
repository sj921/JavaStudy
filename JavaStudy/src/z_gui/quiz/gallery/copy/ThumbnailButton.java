package z_gui.quiz.gallery.copy;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ThumbnailButton extends JButton implements ActionListener {

	private static ViewImageFrame viewFrame;

	// 연결
	public static void setViewFrame(ViewImageFrame file) {
		viewFrame = file;
	}

	File file;
	
	final private static int THUMBNAIL_WIDTH = 100;
	final private static int THUMBNAIL_HEIGHT = 80;
	
	// 다른 생성자로 보냄
	public ThumbnailButton (String path) {
		this(new File(path));
	}

	public ThumbnailButton(File file) {
		this.file = file;
		
		try {
			setIcon(new ImageIcon(ImageIO.read(file).getScaledInstance(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, Image.SCALE_AREA_AVERAGING)));
			setSize(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT);
			addActionListener(this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		viewFrame.setImageLabel(file);
		viewFrame.setVisible(true);
		
	}
	
	
	
	
}














