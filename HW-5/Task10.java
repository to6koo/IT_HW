package homework5;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a word");
		String word = sc.next();

		for (int letterIndex = 0; letterIndex < word.length(); letterIndex++) {

			char newLetter = (char) (word.charAt(letterIndex) + 5);

			System.out.print(newLetter);
		}
		System.out.println();
		
	}
}
