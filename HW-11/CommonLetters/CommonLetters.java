import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


/*Да се напише конзолно приложение, което показва списък с най-често срещаните букви
в даден текст, въведен от потребителя. Програмата да извежда статистическа
информация за честотата на срещане на буквите, като не се прави разлика между
големи и малки букви. Буквите да са подредени по честотата на срещане в текста. На
всеки ред да се изписва буквата, броя на срещанията, както и графика, която да
илюстрира процента на срещания (чрез символа „#”).*/

public class CommonLetters {
	public static void main(String[] args) {

		System.out.print("Please enter your text: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String formatedText = text;
		if(!(formatedText==null)){
			text.toUpperCase();
		}
		
		TreeMap<Character, Integer> currentText = new TreeMap<Character, Integer>();

		for (int i = 0; i < formatedText.length(); i++) {
			if (!currentText.containsKey(formatedText.charAt(i))) {
				currentText.put(formatedText.charAt(i), 1); 
				continue;
			}

			int value = currentText.get(formatedText.charAt(i)).intValue(); 
			currentText.put(formatedText.charAt(i), value + 1);
		}

		
		ArrayList<Entry<Character, Integer>> list = 
				new ArrayList<Entry<Character, Integer>>(currentText.entrySet());

		
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		// printing the result
		for (Map.Entry<Character, Integer> tsak : list) {
			System.out.print(tsak.getKey() + ": " + tsak.getValue() + " ");
			for (int i = 0; i < (currentText.get(tsak.getKey()).floatValue() * 20)
					/ Collections.max(currentText.values()); i++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
