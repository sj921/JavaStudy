package gui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import database.model.Fruit;

public class S10_JComboBox extends JFrame {
	
	JComboBox cb = new JComboBox();
	
	public S10_JComboBox() {
		
		Fruit[] fruits = {
				new Fruit("Apple", 3.3, 5000, "KR", "A+"),
				new Fruit("Mango", 3.5, 5000, "EN", "B+"),
				new Fruit("Kiwi", 5.3, 5000, "BR", "D"),
				new Fruit("Grape", 7.7, 5000, "CO", "F"),
				new Fruit("Podo", 19.9, 5000, "JP", "B-"),
		};
		
		// String[] fruits = {"apple", "mango", "kiwi", "orange"};
		
		cb = new JComboBox(fruits);
		
		// cb.addItem(123.123);
		
		cb.setBounds(50, 100, 100, 25);
		
		this.add(cb);
		
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println(e.getItem());
				}
			}
		});
		
		setTitle("JComboBox Test Frame");
		setLayout(null);
		setLocation(0, 100);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public void open() {
		setVisible(true);
	}
		
	public static void main(String[] args) {
		S10_JComboBox f = new S10_JComboBox();
		f.open();
	}
}
