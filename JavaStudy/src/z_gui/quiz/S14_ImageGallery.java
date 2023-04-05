package z_gui.quiz;

import java.awt.GridLayout;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class S14_ImageGallery extends JFrame{
	/*
		(1) images 폴더에 있는 모든 이미지들을 GridLayout으로 보여주기

		(2) 해당 이미지를 클릭하면 확대된 이미지가 새 창에 나오게 만들기
	*/
	public S14_ImageGallery(String path) {
		// 전달받은 경로로 디렉토리 만듦
		File dir = new File(path);
		
		// 모든 ThumbnailButton에서 사용할 ViewImageFrame을 하나 생성하여 전달
		ThumbnailButton.setViewFrame(new ViewImageFrame());
		
		
		int imageCount = 0;
		// 디렉토리 파일에서 하나씩 꺼내면서 버튼을 만듦.
		for (File f : dir.listFiles()) {
			// 파일만 가지고 버튼만듦(디렉토리x)
			if (f.isFile()) {
				add(new ThumbnailButton(f));
				++imageCount;
			}
		}
		
		// 16개까지 버튼 만듦.
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public S14_ImageGallery() {
//		
//		GridLayout layout = new GridLayout(1, 3, 5, 5);
//		
//		JPanel jp = new JPanel();		
//		JButton[] btn = new JButton[3];
//		
//		for (int i = 0; i < btn.length; ++i) {
//		
//			jp.add(btn[i] = new JButton());
//			
//			if (i == 0) {
//				btn[i].setSize(200, 200);
//				
//				try {
//					BufferedImage bufferedImage = 
//							ImageIO.read(new File("images/apple.jpg"));
//					
//					Image scaledImage = 
//							bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//					
//					btn[i].setIcon(new ImageIcon(scaledImage));
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				
//				btn[i].addActionListener(new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						new gridImage();
//						setVisible(false);
//					}
//				});
//				
//            } 
//			
//		}
//		
//	
//		setLocation(0, 100);
//		setSize(600, 200);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//	}
//
//
//}










//btn.setSize(200, 200);
//
//f.add(btn);
//
//btn.addActionListener(new ActionListener() {
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		new gridImage();
//		f.setVisible(false);
//		
//	}
//});










//JButton btn1 = new JButton();
//JButton btn2 = new JButton();
//JButton btn3 = new JButton();
//
//try {
//	BufferedImage bufferedImage = 
//			ImageIO.read(new File("images/apple.jpg"));
//	
//	Image scaledImage = 
//			bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//	
//	btn1.setIcon(new ImageIcon(scaledImage));
//} catch (IOException e) {
//	e.printStackTrace();
//}
//
//btn1.addActionListener(new ActionListener() {
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		new gridImage();
//		f.setVisible(false);
//	}
//});
//
//
//
//try {
//	BufferedImage bufferedImage = 
//			ImageIO.read(new File("images/kiwi.jpg"));
//	
//	Image scaledImage = 
//			bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//	
//	btn2.setIcon(new ImageIcon(scaledImage));
//} catch (IOException e) {
//	e.printStackTrace();
//}
//
//btn2.addActionListener(new ActionListener() {
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		new gridImage();
//		f.setVisible(false);
//	}
//});
//
//
//
//
//try {
//	BufferedImage bufferedImage = 
//			ImageIO.read(new File("images/straw.jpg"));
//	
//	Image scaledImage = 
//			bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//	
//	btn3.setIcon(new ImageIcon(scaledImage));
//} catch (IOException e) {
//	e.printStackTrace();
//}
//
//btn3.addActionListener(new ActionListener() {
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		new gridImage();
//		f.setVisible(false);
//	}
//});








//f.add(btn1);
//f.add(btn2);
//f.add(btn3);
