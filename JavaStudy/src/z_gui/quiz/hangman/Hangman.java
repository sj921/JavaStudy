package z_gui.quiz.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 행맨을 만들어보세요
public class Hangman {

	public Hangman() {}
	
	private static boolean getPlayerGuess (Scanner keyboard, String word, List<Character> playerGuesses) {
		System.out.println("Please enter a letter : ");
		String letterGuess = keyboard.nextLine();
		playerGuesses.add(letterGuess.charAt(0));
		
		return (word.contains(letterGuess));
	}
	
	private static boolean printWordState (String word, List<Character> playerGuesses) {
		int correctCount = 0;
		for (int i = 0; i < word.length(); i++) {
			if (playerGuesses.contains(word.charAt(i))) {
				System.out.print(word.charAt(i));
				correctCount++;
			} else {
				System.out.print("-");
			}
		}
		System.out.println();
		
		return (word.length() == correctCount);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("myFiles/wordList.txt"));
		Scanner keyboard = new Scanner(System.in);

		List<String> words = new ArrayList<>();
		words.add(sc.nextLine());

		Random ran = new Random();

		String word = words.get(ran.nextInt(words.size()));

		System.out.println(word);

		List<Character> playerGuesses = new ArrayList<>();

		int wrongCount = 0;
		while(true) {
			System.out.println(" ------- ");
			System.out.println(" |     | ");
			if (wrongCount == 1) {
				System.out.println(" O");
			} else if (wrongCount == 2) {
				System.out.print("\\");
			} else if (wrongCount == 3) {
				System.out.println("/");
			} else if (wrongCount == 4) {
				System.out.println("  | ");
			} else if (wrongCount == 5) {
				System.out.print("/");
			} else if (wrongCount == 6) {
				System.out.println("\\");
			} 
			System.out.println("");
			System.out.println("");
			
			if (!getPlayerGuess(keyboard, word, playerGuesses)) {
				wrongCount++;
			} else if (printWordState(word, playerGuesses)) {
				System.out.println("You Win!");
				break;
			}
			
			System.out.println("단어를 추측해보세요 : ");
			if (keyboard.nextLine().equals(word)) {
				System.out.println("You Win!");
				break;
			} else {
				System.out.println("정답이 아닙니다. 다시 입력해주세요~ ");
			}
		}
	}	
}		



