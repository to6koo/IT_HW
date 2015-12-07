package homework5;

import java.util.Scanner;

public class Task5 {

	/*
	 * Да се състави програма, чрез която се въвеждат 2 редици от знаци (думи).
	 * Ако в двете редици участва един и същи знак, да се изведе на екрана
	 * първата редица хоризонтално, а втората вертикално, така че да се пресичат
	 * в общия си знак. Ако редиците нямат общ знак да се изведе само
	 * уведомително съобщение. Пример : м а шапка и н а
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String stringA, stringB;

		System.out.print("Insert first string:");
		stringA = sc.next();
		System.out.print("Insert second string:");
		stringB = sc.next();

		char[] str1 = stringA.toCharArray();
		char[] str2 = stringB.toCharArray();

		int pos1 = 0;
		int pos2 = 0;

		{
			for (int i = 0; i < stringB.length(); i++, pos2++) {
				if ((pos1 = stringA.indexOf(str2[i])) != -1)
					break;
			}

			if (pos1 == -1) {
				System.out.println("Doesn't contain same chars");
				return;
			} else {
				for (int i = 0; i < stringA.length(); i++) {
					if (i == pos1) {
						System.out.println(stringB);
					} else {
						for (int k = 0; k < pos2; k++) {
							System.out.print(" ");
						}
						System.out.print(str1[i]);
						System.out.println();
					}
				}
			}
		}

	}
}
