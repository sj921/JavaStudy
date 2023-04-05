package gui.quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class HangManGUI extends JFrame  {

	List<String> word_array;
	int count = 0;
	boolean gameOver = true;
	
	
	public HangManGUI() {
		super();
		
		String correct = correctWord(getWordList("alphabet.txt")).toLowerCase();
	}
	
	public List<String> getWordList(String path) {
		word_array = new ArrayList<>();
		
		try (BufferedReader in = new BufferedReader(new FileReader(
				path, Charset.forName("UTF-8")),2048)){
			String line;
			while((line = in.readLine()) != null) {
				word_array.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return word_array;
	}
	
	public String correctWord(List<String> array) {
		int ran = (int)(Math.random() * array.size());
		
		String word = array.get(ran);
		
		return word;
	}
	

	
	
	
	public static void main(String[] args) {
	
		
		
		
	}
	
}		



