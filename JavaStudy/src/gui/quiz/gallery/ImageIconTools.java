package gui.quiz.gallery;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageIconTools {
	// 크기조절 메서드를 미리 만들어놓아 코드의 양을 줄인다
	
	public static ImageIcon getScaledImageIcon(File img, int w, int h) 
			throws IOException{
		return new ImageIcon(
				ImageIO.read(img).getScaledInstance(
						w, h, Image.SCALE_AREA_AVERAGING));
	}
	
}
