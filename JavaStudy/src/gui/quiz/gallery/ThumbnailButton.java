package gui.quiz.gallery;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ThumbnailButton extends JButton implements ActionListener{
	// J버튼을 상속받음. 이 자제가 J버튼임
	
	// 뷰이미지프레임은 하나만 있으면... 뷰 하나에 여러개 이미지 프레임 변동 가능..?
	private static ViewImageFrame viewFrame;
	
	// 연결
	public static void setViewFrame (ViewImageFrame f) {
		viewFrame = f;
	}
	
	File f;
	
	final private static int THUMBNAIL_WIDTH = 100;
	final private static int THUMBNAIL_HEIGHT = 80;
	
	public ThumbnailButton(String path) {
		this(new File(path));	// 다른 생성자로 보냄
	}
	
	public ThumbnailButton(File f) {
		this.f = f;
		
		try {
			setIcon(new ImageIcon(ImageIO.read(f).getScaledInstance(
					THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, Image.SCALE_AREA_AVERAGING)));
			setSize(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT);
			// 내파일을 가져와서 액션리스너에 붙일 수 있다
			addActionListener(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// view에는 new viewImageFrame이 들어있음
		// 버튼이 눌릴 때마다 제어
		viewFrame.setImageLable(f);
		viewFrame.setVisible(true);
		
	}
}
