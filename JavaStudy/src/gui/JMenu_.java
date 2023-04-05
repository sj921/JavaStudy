package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MyFrame extends JFrame implements ActionListener{

	/*
		JMenu 클래스에 JMenuItem 클래스를 붙이는 방식으로 메뉴를 사용할 수 있다
	 */
	JMenuItem eventTestItem;

	public MyFrame() {
		this.setTitle("Menu Title");
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		createMenu();

		this.setVisible(true);
	}

	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");

		mb.add(fileMenu);

		// Menu Item
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.add(new JMenuItem("Close"));

		// 구분선
		fileMenu.addSeparator();

		eventTestItem = new JMenuItem("Event test", KeyEvent.VK_E);
		fileMenu.add(eventTestItem);
		eventTestItem.addActionListener(null);

		fileMenu.addSeparator();
		
		// 메뉴에 서브 메뉴를 추가
		JMenu submenu = new JMenu("서브메뉴");
		fileMenu.add(submenu);
		
		submenu.add(new JMenuItem("sub menu1"));
		submenu.add(new JMenuItem("sub menu2"));

//		for (int i = 0; i < items.length; ++i) {
//			items[i] = new JMenuItem("item" + (i + 1));
//		}



		// 각 메뉴들에 아이템들 추가
		mb.add(editMenu);
		mb.add(new JMenu("Source"));
		
		this.setJMenuBar(mb);

	}


//		items[0].addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println(e.getSource());
//				System.out.println("Item1을 누름");
//			}
//		});

	


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == eventTestItem) {
			System.out.println("Execute Event Test Menu");
		}
	}
}	

public class JMenu_ {
	public static void main(String[] args) {
		new MyFrame();
	}
}
