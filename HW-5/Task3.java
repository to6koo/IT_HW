package homework5;
	
	import java.util.Scanner;

	public class Task3 {
		/*Да се състави програма, чрез която се въвеждат последователно две
		редици от символи без интервали.
		Програмата да извежда съобщение за резултата от сравнението им по
		позиции.
		Пример: хипопотам, хипопотук
		Изход:
		Двата низа са с равна дължина.
		Разлика по позиции:
			8 а-у
			9 м-к
		 */
	static void Compare(String stringA, String stringB) {
			for (int index = 0; index < stringA.length(); index++) {
				if (stringA.charAt(index) != stringB.charAt(index)) {
					System.out.print(index + " ");
					System.out.println(stringA.charAt(index) + " - " + stringB.charAt(index));
				} else {
					continue;
				}
			}
		}

		public static void main(String[] args) {

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Input first string: ");
			String stringA = sc.next();
			System.out.println("Input second string: ");
			String stringB = sc.next();

			if (stringA.length() > stringB.length()) {
				System.out.println("StringA is longer than StringB!");
				System.out.println("Difference in positions: ");
				Compare(stringB, stringA);
			}
			if (stringA.length() < stringB.length()) {
				System.out.println("StringB is longet than stringA!");
				System.out.println("Difference in positions: ");
				Compare(stringA, stringB);
			}
			if (stringA.length() == stringB.length()) {
				System.out.println("The words have equal length!");
				System.out.println("Difference in positions: ");
				Compare(stringA, stringB);
			}
		}
	}

