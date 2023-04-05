package z_gui.quiz.gallery.copy;

import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S14_ImageGallery extends JFrame{

	public S14_ImageGallery (String path) {
		// 전달 받은 경로로 디렉토리 만듦
		File dir = new File(path);
		
		// 모든 ThumbnailButton에서 사용할 ViewImageFrame을 하나 생성하여 전달
		ThumbnailButton.setViewFrame(new ViewImageFrame());
		
		int imageCount = 0;
		
		// 디렉토리 파일에서 하나씩 꺼내면서 버튼을 만듦.
		for (File file : dir.listFiles()) {
			if (file.isFile()) {
				add(new ThumbnailButton(file));
				++imageCount;
			}
		}
		
		while (imageCount++ < 16) {
			add(new JButton("empty"));
		}
		
		setLayout(new GridLayout(4, 4));
		setTitle("Thumbnails");
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S14_ImageGallery("images/");
	}
}	
	
	












	
	